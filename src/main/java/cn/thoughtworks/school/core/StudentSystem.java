package cn.thoughtworks.school.core;

import java.util.List;

public class StudentSystem {

    private final StudentDomainService studentDomainService;
    private final Students students;

    public StudentSystem(StudentDomainService studentDomainService, Students students) {
        this.studentDomainService = studentDomainService;
        this.students = students;
    }

    public void start() {
        List<Student> students = this.students.retrieveStudents();
        studentDomainService.retrieveTopTenStudents(students);
    }
}