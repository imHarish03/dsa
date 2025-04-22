package dsa.pattern.structural.adapter.student;

import java.util.List;

public class Client {
    public static void main(String[] args) {
        StudentClient studentClient = new StudentClient();
        List<Student> students = studentClient.getStudentList();
        for (Student student : students) {
            System.out.println("Name: " + student.getName() + ", Surname: " + student.getSurname() + ", Email: " + student.getEmail());
        }
    }
}
