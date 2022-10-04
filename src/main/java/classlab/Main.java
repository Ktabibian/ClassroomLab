package classlab;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int maxNumberOfStudents = 3;
        Classroom classroom = new Classroom(maxNumberOfStudents);
        Double[] examScores = { 100.0, 150.0, 250.0, 0.0 };
        Double[] examScores1 = { 112.0, 156.0, 259.0, 0.0 };
        Double[] examScores2 = { 120.0, 167.0, 252.0, 0.0 };
        Student student = new Student("Leon", "Hunter", examScores);
        Student student1 = new Student("Clyde", "Clone", examScores1);
        Student student2 = new Student("Dean", "Dudley", examScores2);
        Student[] students = {student, student1, student2};

        // When
        Student[] preEnrollment = classroom.getStudents();
        classroom.addStudent(students);
        Student[] postEnrollment = classroom.getStudents();

        // Then
        String preEnrollmentAsString = Arrays.toString(preEnrollment);
        String postEnrollmentAsString = Arrays.toString(postEnrollment);

        System.out.println("===========================");
        System.out.println(preEnrollmentAsString);
        System.out.println("===========================");
        System.out.println(postEnrollmentAsString);

    }
}
