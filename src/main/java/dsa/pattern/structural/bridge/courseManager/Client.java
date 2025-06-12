package dsa.pattern.structural.bridge.courseManager;

import dsa.pattern.structural.bridge.courseManager.course.Course;
import dsa.pattern.structural.bridge.courseManager.course.ProgrammingCourse;
import dsa.pattern.structural.bridge.courseManager.mode.Mode;
import dsa.pattern.structural.bridge.courseManager.mode.OfflineMode;
import dsa.pattern.structural.bridge.courseManager.mode.OnlineMode;

import java.util.List;

public class Client {
    public static void main(String[] args) {
    Mode onlineMode= new OnlineMode(new ProgrammingCourse());
    onlineMode.openCourse();

    Mode offlineMode= new OfflineMode(new ProgrammingCourse());
    offlineMode.openCourse();
    }
}
