package dsa.pattern.structural.bridge.courseManager.mode;

import dsa.pattern.structural.bridge.courseManager.course.Course;

public class OnlineMode extends Mode {

    public OnlineMode(Course course) {
        super(course);
    }

    @Override
    public void openCourse() {
        System.out.println("Opening course online: " + course.getTitle());
        System.out.println("Fetching content from server...");
        for (String module : course.getAllContent()) {
            System.out.println("Streaming module: " + module);
        }
    }
}
