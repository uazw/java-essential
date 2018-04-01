package cn.thoughtworks.school.core;

import java.util.List;

public class StudentDomainService {

    public void retrieveTopTenStudents(List<Student> students) {
        students.forEach(System.out::println);
    }
}
