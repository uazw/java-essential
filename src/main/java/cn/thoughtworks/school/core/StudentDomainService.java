package cn.thoughtworks.school.core;

import java.util.Comparator;
import java.util.List;

import static java.lang.String.format;

public class StudentDomainService {

    public void printAllStudentInformation(List<Student> students) {
        students
                .stream()
                .sorted(Comparator.comparing(Student::getScore).reversed())
                .limit(50)
                .map(student -> format("%s, %s", student.getName(), student.getScore()))
                .forEach(System.out::println);
    }
}
