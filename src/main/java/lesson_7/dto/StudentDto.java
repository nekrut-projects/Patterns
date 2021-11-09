package lesson_7.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class StudentDto {
    private Long id;
    private String name;
    private String patronymic;
    private String surname;
    private String phone;
    private String group;

    public StudentDto(Long id, String name, String patronymic, String surname, String phone, String group) {
        this.id = id;
        this.name = name;
        this.patronymic = patronymic;
        this.surname = surname;
        this.phone = phone;
        this.group = group;
    }
}
