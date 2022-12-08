package Courses;

import java.util.*;

import static java.lang.System.out;

public class Midterm {

    public int grade_midterm(ArrayList grades){
        int fgrade=0, grade = 0, len;

        len = grades.size();

        for(int i=0; i<len; i++){
            grade = grade + (int) grades.get(i);
        }

        fgrade = grade/len;


        return fgrade;
    }

    public String status(){
        List<String> status = Arrays.asList("Present", "Absent");

        Collections.shuffle(status, new Random());
        return status.get(0);
    }

    public void display(int grade, String status){
        if (status == "Present"){
            out.print("\nGrade: " + grade);
            if (grade >= 5) {
                out.print(" - Courses.Midterm Passed");
            }
            else{
                out.print(" - Courses.Midterm Failed - Not passing grade");
            }
        }
        else{
            out.print(" - Courses.Midterm Failed - Absent at midterm");
        }
    }
}
