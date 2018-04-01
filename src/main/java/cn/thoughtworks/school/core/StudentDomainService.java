package cn.thoughtworks.school.core;

import java.util.List;

public class StudentDomainService {

    public void retrieveTopTenStudents(List<Student> students) {
        students.stream().map(this::studentFormatter).forEach(System.out::println);
    }

    public String studentFormatter(Student student) {
        return String.format("%s %s", student.getName(), student.getScore());
    }
}
