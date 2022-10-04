package classlab;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    private String firstName;
    private String lastName;
    private ArrayList<Double> examScores;

    public Student(String firstName, String lastName, Double[] testScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = new ArrayList<>(Arrays.asList(testScores));
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getExamScores() {
        String i = "";
        for (int a = 0; a < examScores.size(); a++) {
            i += "Exam " + (1 + a) + " ->: " + examScores.get(a) + "\n";
        }
        return i;
    }

    public void addExamscore(Double i) {
        this.examScores.add(i);
    }

    public void setExamScore(int examNumber, double newScore) {
        this.examScores.set(examNumber, newScore);
    }

    public double getAverageExamScore() {
        double sum = 0.0;
        for (int i = 0; i < examScores.size(); ++i) {
            sum += examScores.get(i);
        }
        return sum / examScores.size();
    }

    @Override
    public String toString() {
        return "> Class.Student Name: " + firstName + " " + lastName +
                "\n> Average score:" + " " + getAverageExamScore() +
                "\nExam Scores:" +
                "\n" + getExamScores();

    }
}
