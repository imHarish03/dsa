package dsa.pattern.structural.bridge.courseManager.mode;

import dsa.pattern.structural.bridge.courseManager.course.Course;

import java.util.ArrayList;
import java.util.List;

public class OfflineMode extends Mode {

    private List<String> cachedContent = new ArrayList<>();

    public OfflineMode(Course course) {
        super(course);
        preload();
    }

    private void preload() {
        System.out.println("Downloading all course content for offline mode...");
        cachedContent.addAll(course.getAllContent());
    }

    @Override
    public void openCourse() {
        System.out.println("Opening course offline: " + course.getTitle());
        for (String module : cachedContent) {
            System.out.println("Reading module from device: " + module);
        }
    }
}
