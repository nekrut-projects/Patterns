package lesson_7.controllers;

import lesson_7.dto.StudentDto;
import lesson_7.services.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/students")
public class StudentController {
    private final StudentService studentService;

    @GetMapping("/{id}")
    public StudentDto findById(@PathVariable Long id) {
        return studentService.findById(id);
    }

    @GetMapping("/{surname}")
    public StudentDto findBySurname(@PathVariable String surname) {
        return studentService.findBySurname(surname);
    }

    @GetMapping
    public Page<StudentDto> showPage(
            @RequestParam(name = "page", defaultValue = "1") int pageNumber)
    {
        return studentService.findPage(pageNumber - 1, 7);
    }
}
