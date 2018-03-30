package cn.thoughtworks.school.core;

public class Student {

    private String name;
    private Score score;

    public Student(String name, Score score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public Score getScore() {
        return score;
    }
}
