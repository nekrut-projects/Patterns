package lesson_7.services;

import lesson_7.dto.StudentDto;
import lesson_7.exceptions.ResourceNotFoundException;
import lesson_7.model.Student;
import lesson_7.repositories.StudentRepository;
import lesson_7.utils.Mapper;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.stream.DoubleStream;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepository studentRepository;

    public StudentDto findBySurname(String surname){
        Student student = studentRepository.findBySurname(surname).orElseThrow(() ->
                new ResourceNotFoundException("Student not found, surname: " + surname));
        return Mapper.mappingDto(student);
    }

    public StudentDto findById(Long id) throws ResourceNotFoundException{
        Student student = studentRepository.findById(id).orElseThrow(() ->
                new ResourceNotFoundException("Student not found, id: " + id));
        return Mapper.mappingDto(student);
    }

    public Page<StudentDto> findPage(int pageIndex, int pageSize) {
        return studentRepository.findAll(PageRequest.of(pageIndex, pageSize)).map(Mapper::mappingDto);
    }
}
