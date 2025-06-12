package dsa.pattern.structural.bridge.courseManager.mode;

import dsa.pattern.structural.bridge.courseManager.course.Course;

public abstract class Mode {
    protected Course course;

    public Mode(Course course) {
        this.course = course;
    }

    public abstract void openCourse();
}
