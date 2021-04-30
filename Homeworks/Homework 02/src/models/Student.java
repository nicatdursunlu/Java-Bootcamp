package models;

public class Student extends User {

    private String studentNumber;
    private int completingPercentage;
    private String[] courses;

    public Student() {

    }

    public Student(String studentNumber, int completingPercentage, String[] courses) {
        this.studentNumber = studentNumber;
        this.completingPercentage = completingPercentage;
        this.courses = courses;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public int getCompletingPercentage() {
        return completingPercentage;
    }

    public String[] getCourses() {
        return courses;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public void setCompletingPercentage(int completingPercentage) {
        this.completingPercentage = completingPercentage;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }
}
