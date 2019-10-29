package io.turntabl.university;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UniversityTestDrive {
    public static void main(String[] args) {

        List<Student> students = Arrays.asList(     // since now creating list, use array.asList(...)
                new Student("Erbynn", 006, StudentYear.FOURTH),
                new Student("Dawud", 056, StudentYear.FIRST),
                new Student("Dennis", 026, StudentYear.SECOND),
                new Student("Isaac", 007, StudentYear.FIRST),
                new Student("Doreen", 005, StudentYear.THIRD),
                new Student("Billa", 0063, StudentYear.FIRST),
                new Student("Franklin", 066, StudentYear.SECOND),
                new Student("Raph", 0062, StudentYear.FOURTH),
                new Student("Sam", 39, StudentYear.FIRST),
                new Student("Partricia", 006, StudentYear.SECOND),
                new Student("Alex", 025, StudentYear.THIRD),
                new Student("Magie", 0010, StudentYear.FIRST),
                new Student("Anthody", 016, StudentYear.FIRST),
                new Student("Grace", 0046, StudentYear.THIRD),
                new Student("Selase", 033, StudentYear.SECOND),
                new Student("Edem", 051, StudentYear.FIRST),
                new Student("Manasie", 066, StudentYear.FOURTH),
                new Student("Nab", 054, StudentYear.FIRST),
                new Student("Suzzy", 022, StudentYear.SECOND),
                new Student("Ibrahim", 033, StudentYear.FOURTH),
                new Student("James", 0013, StudentYear.THIRD),
                new Student("Tom", 0043, StudentYear.FOURTH)
        );

        printStudents(students);


//        filtering for first year students
        List<Student> firstYearStudents = new ArrayList<Student>();
        for (Student student:
             students) {
            if(student.getStudentYear()==StudentYear.FIRST){
                firstYearStudents.add(student);
            }
        }
        printStudents(firstYearStudents);

        // creating or mounting or assigning a course to all first years....new Course()
        Course IntroToProgrammingCourse = new Course(
                (new Lecturer("Prof Quainor",
                        LecturerCourse.PROGRAMMING)),
                firstYearStudents,
                CourseYear.FIRST
        );
        System.out.println(IntroToProgrammingCourse);


        // first and fourth year filter
        List<Student> thirdAndFourthYearStudents = new ArrayList<Student>();
        for (Student stu:
             students) {
            if( (stu.getStudentYear() == StudentYear.THIRD) || (stu.getStudentYear() == StudentYear.THIRD) ){   // lvalue is a field therefore no .fxn caller to StudentYear
                thirdAndFourthYearStudents.add(stu);
            }
        }
        printStudents(thirdAndFourthYearStudents);

        // assigning all third and forth years to a course
        Course AdvancedGardeningCourse = new Course(
                (new Lecturer("Dr. Amanfo",
                        LecturerCourse.GARDENING)),
                thirdAndFourthYearStudents,
                CourseYear.SECOND
        );


        // forth year filter
        List<Student> fourthYearStudents = new ArrayList<Student>();
        for (Student stu:
             students) {
            if(stu.getStudentYear() == StudentYear.FOURTH){
                fourthYearStudents.add(stu);
            }
        }
        printStudents(fourthYearStudents);


        // fourth year stu with vowel names
        List<Student> fourthYearStudentsWithVowelNames = new ArrayList<>();



        /*
        for (Student physicsCourseList: studentList){
            if(physicsCourseList.getStudentsLevel() == StudentsLevel.FOURTH &&
                    physicsCourseList.getStudentsName().matches("[aeiouAEIOU].*") ){
                physicsCourse.add(physicsCourseList);
            }
        }
        printNamesOfPhysicsStudent(physicsCourse);

        List<String> physicsClass = new ArrayList<>();
        for(Student pc : physicsCourse){
            physicsClass.add(pc.getStudentsName());
        }
    }

    private static void printNamesOfPhysicsStudent(List<Student> physicsCourse) {
        System.out.println("physics students with names starting with vowel: " + physicsCourse);
    }
        */


        /*
        git branch management testing
         */

    }

    private static void printStudents(List<Student> students) {
        System.out.println(students);
        System.out.println("LengthOfStudents: " + students.size() + "\n");
    }

}
