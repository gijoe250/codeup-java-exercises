package grades;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    private HashMap<Date, String> attendance;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    // returns the student's name
    public String getName() {
        return this.name;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade) {
        this.grades.add(grade);
    }

    // returns the average of the students grades
    public double getGradeAverage() {
        int sum = 0;
        for (int grade : this.grades ){
            sum += grade;
        }
        return (double) sum/grades.size();
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void recordAttendance(String date, String value){
        //TODO add record to attendance hashmap
        //TODO check string for validity
    }
}
