package io.turntable;

public class Lecturer {
    private String name;
    private LecturerCourse course;

    public Lecturer(String name, LecturerCourse course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public LecturerCourse getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return "Lecturer{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
}
