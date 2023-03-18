SELECT * FROM students;
SELECT * FROM countries;
SELECT * FROM idtypes;
SELECT * FROM courses_has_students;
SELECT * FROM courses;
SELECT * FROM modules;
-- Estudiantes que esten registrades en un curso.
-- Nombre, id, apellido, curso al que estan registrades
-- Buscar estudiantes y el curso al que pertenecen
select* from students where nationality = 125;
select * from courses_has_students where course_code = 'JAVA-1';
select count(*) from courses_has_students where course_code = 'JAVA-1';

 select 
t1.course_code AS 'Codigo de curso',
t2.code AS 'Codigo de curso',
t2.name AS 'Curso',
t2.module_code AS 'modulo c',
t1.students_id_student AS 'ID' 

FROM courses_has_students t1
INNER JOIN courses t2
ON t1.course_code = t2.code
GROUP BY t2.module_code;

SELECT 
    COUNT(*) AS 'Numero de estudiantes sin cursos'
FROM students t1
WHERE t1.idStudent NOT IN (
    SELECT t2.students_id_student
    FROM courses_has_students t2
)