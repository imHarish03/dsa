package dsa.pattern.structural.adapter.student;

public class SchoolStudent {
    private String firstname;
    private String lastName;
    private String emailAddress;

    public SchoolStudent(String firstname, String lastName, String emailAddress) {
        this.firstname = firstname;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
    }

    public String getFirstName() {
        return firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
