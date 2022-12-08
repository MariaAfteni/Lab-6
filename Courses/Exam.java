package Courses;

import static java.lang.System.out;

import java.util.*;

public class Exam {
    public int grade_exam(ArrayList grades){
        List<String> status = Arrays.asList("Present", "Absent");
        String s;
        Collections.shuffle(status, new Random());
        s = status.get(0);

        int fgrade=0, grade = 0, len;

        len = grades.size();

        for(int i=0; i<len; i++){
            grade = grade + (int) grades.get(i);
        }

        fgrade = grade/len;

        if (s == "Present"){
            out.print("\nGrade: " + fgrade);
            if (grade >= 5) {
                out.print(" - Courses.Exam Passed");

            }
            else{
                out.print(" - Courses.Exam Failed - Not passing grade");
            }
        }
        else{
            out.print(" - Courses.Exam Failed - Absent at exam");
        }

        return fgrade;
    }

    public void avg(ArrayList grades, String course){
        int fgrade = 0, grade = 0, len;

        len = grades.size();
        for(int i=0; i<len; i++){
            grade = grade + (int) grades.get(i);
        }

        fgrade = grade/len;

        out.print("\n** Average grade per " + course + " exam - " + fgrade);
    }

}
