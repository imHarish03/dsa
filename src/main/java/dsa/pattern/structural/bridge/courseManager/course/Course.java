package dsa.pattern.structural.bridge.courseManager.course;

import java.util.List;

public interface Course {
    String getTitle();
    String getAuthor();
    List<String> getAllContent(); // all lessons
}
