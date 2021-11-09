CREATE TABLE IF NOT EXISTS
faculties (
    id bigserial,
    title VARCHAR(255),
    created_at timestamp default current_timestamp,
    updated_at timestamp default current_timestamp,
    PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS
groups (
    id bigserial,
    title VARCHAR(255),
    faculty_id bigint references faculties(id),
    created_at timestamp default current_timestamp,
    updated_at timestamp default current_timestamp,
    PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS
students (
    id bigserial,
    name VARCHAR(255),
    patronymic VARCHAR(255),
    surname VARCHAR(255),
    phone VARCHAR(12),
    group_id bigint references groups (id),
    created_at timestamp default current_timestamp,
    updated_at timestamp default current_timestamp,
    PRIMARY KEY (id)
);


INSERT INTO faculties (title)
VALUES
('Факультет государственного управления и международных отношений'),
('Факультет строительства и архитектуры'),
('Факультет фундаментальной и прикладной информатики');


INSERT INTO groups (title, faculty_id)
VALUES
('201_GM', 1),
('303_HY', 2),
('401_JU', 3);



INSERT INTO students (name, patronymic, surname, phone, group_id)
VALUES
('Иван', 'Иваныч', 'Иванов', '+79216651100', 1),
('Иван', 'Петрович', 'Сидоров', '+79216651100', 3),
('Иван', 'Семенович', 'Петров', '+79216651100', 2),
('Иван', 'Сергеевич', 'Степанов', '+79216651100', 1);
