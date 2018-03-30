package cn.thoughtworks.school;

import cn.thoughtworks.school.core.StudentDomainService;
import cn.thoughtworks.school.core.StudentSystem;
import cn.thoughtworks.school.core.Students;

public class Starter {

    public static void main(String[] args) {
        StudentSystem studentSystem = new StudentSystem(new StudentDomainService(), new Students());
        studentSystem.start();
    }
}
