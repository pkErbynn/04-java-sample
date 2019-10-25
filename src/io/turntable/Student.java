package io.turntable;

public class Student {
    private String name;
    private int studentID;
    private StudentYear studentYear;

    public Student(String name, int studentID, StudentYear studentYear) {
        this.name = name;
        this.studentID = studentID;
        this.studentYear = studentYear;
    }

    public String getName() {
        return name;
    }

    public int getStudentID() {
        return studentID;
    }

    public StudentYear getStudentYear() {
        return studentYear;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", studentID=" + studentID +
                ", studentYear=" + studentYear +
                '}';
    }
}
