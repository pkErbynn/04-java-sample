package io.turntabl.university;

import java.util.List;

public class Course {
    private Lecturer lecturer;
    private List<Student> students;
    private CourseYear courseYear;

    public Lecturer getLecturer() {
        return lecturer;
    }

    public List<Student> getStudents() {
        return students;
    }

    public CourseYear getCourseYear() {
        return courseYear;
    }

    public Course(Lecturer lecturer, List<Student> students, CourseYear courseYear) {
        this.lecturer = lecturer;
        this.students = students;
        this.courseYear = courseYear;
    }

    @Override
    public String toString() {
        return "Course{" +
                "lecturer=" + lecturer +
                ", students=" + students +
                ", courseYear=" + courseYear +
                '}';
    }
}
