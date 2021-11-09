package lesson_7.utils;

import lesson_7.dto.StudentDto;
import lesson_7.model.Student;


public class Mapper {
    public static StudentDto mappingDto(Student s){
        return new StudentDto(s.getId(), s.getName(), s.getPatronymic(),
                                s.getSurname(), s.getPhone(), s.getGroup().getTitle());
    }

}
