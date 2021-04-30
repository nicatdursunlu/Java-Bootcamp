package models;

public class Instructor extends User {

    private String[] courseInstructors;
    private String biography;

    public Instructor() {

    }

    public Instructor(String[] courseInstructors, String biography) {
        this.courseInstructors = courseInstructors;
        this.biography = biography;
    }

    public String[] getCourseInstructors() {
        return courseInstructors;
    }

    public String getBiography() {
        return biography;
    }

    public void setCourseInstructors(String[] courseInstructors) {
        this.courseInstructors = courseInstructors;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }
}
