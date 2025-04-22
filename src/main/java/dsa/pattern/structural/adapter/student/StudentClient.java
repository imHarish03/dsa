package dsa.pattern.structural.adapter.student;

import java.util.ArrayList;
import java.util.List;

public class StudentClient {
    public List<Student> getStudentList(){
        List<Student> studentList=new ArrayList<>();
        CollegeStudent collegeStudent=new CollegeStudent("imharish","kumar","b0r6e@example.com");
        studentList.add(collegeStudent);

        SchoolStudent schoolStudent=new SchoolStudent("anu","raghav","b0r6@example.com");
        studentList.add(new SchoolStudentAdapter( schoolStudent));
        return studentList;
    }
}
