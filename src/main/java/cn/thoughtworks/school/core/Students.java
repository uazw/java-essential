package cn.thoughtworks.school.core;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class Students {

    public List<Student> retrieveStudents() {
        try {
            Path filePath = Paths.get(ClassLoader.getSystemResource("list.txt").toURI());
            return Files.lines(filePath).map(this::parse).collect(toList());
        } catch (URISyntaxException | IOException e) {
            throw new RuntimeException("if you see this exception, please raise your hand");
        }
    }

    private Student parse(String line) {
        String[] parts = line.split(" ");
        return new Student(parts[0], Score.valueOf(parts[1]));
    }
}
