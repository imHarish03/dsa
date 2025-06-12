package dsa.pattern.structural.bridge.courseManager.course;

import java.util.List;

public class ProgrammingCourse implements Course {
    public String getTitle() { return "Java Basics"; }
    public String getAuthor() { return "Hariharan R"; }

    public List<String> getAllContent() {
        return List.of("Intro", "OOP", "Collections", "Multithreading");
    }
}
