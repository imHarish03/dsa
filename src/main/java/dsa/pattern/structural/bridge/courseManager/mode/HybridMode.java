package dsa.pattern.structural.bridge.courseManager.mode;

import dsa.pattern.structural.bridge.courseManager.course.Course;

import java.util.ArrayList;
import java.util.List;

public class HybridMode extends Mode {

    private List<String> preloaded = new ArrayList<>();

    public HybridMode(Course course) {
        super(course);
        preloadIntro();
    }

    private void preloadIntro() {
        preloaded.add(course.getAllContent().get(0)); // Only intro
    }

    @Override
    public void openCourse() {
        System.out.println("Opening hybrid course: " + course.getTitle());

        System.out.println("Reading preloaded module: " + preloaded.get(0));

        List<String> remaining = course.getAllContent().subList(1, course.getAllContent().size());
        for (String module : remaining) {
            System.out.println("Streaming module from server: " + module);
        }
    }
}
