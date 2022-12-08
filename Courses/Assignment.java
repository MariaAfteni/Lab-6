package Courses;

import static java.lang.System.out;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import  java.util.Random;

public class Assignment {
    List<String> assignments = Arrays.asList("Individual task", "Laboratory", "Group task");
    public String add_assignment(String course){
        String a;

        Collections.shuffle(assignments, new Random());
        a = assignments.get(0);
        out.print("\n-->" + course + " assignment for today: " + a );
        return a;
    }


    public void submitted_by(String type, int present, int total){
        int submitted_on_time = 0, submitted_late, failed;
        switch (type) {
            case "Individual task" -> submitted_on_time = (75* present) / 100;
            case "Laboratory" -> submitted_on_time = (84 * present) / 100;
            case "Group task" -> submitted_on_time = (91 * present) / 100;
        }
        submitted_late = present - submitted_on_time;
        failed = total - present;

        out.print("\nCourses.Assignment submitted on time by " + submitted_on_time + " students");
        out.print("\nCourses.Assignment submitted late by " + submitted_late + " students");
        out.print("\nCourses.Assignment failed by  " + failed + " students");
    }

    public int grade() {
        List<String> status = Arrays.asList("Present", "Absent");
        List<String> submit = Arrays.asList("On time", "Late", "None");

        Collections.shuffle(status, new Random());
        Collections.shuffle(submit, new Random());
        String istatus, isubmit;
        int grade = 0;
        istatus = status.get(0);
        isubmit = submit.get(0);

        if (istatus == "Present" && isubmit == "On time"){
            grade = 10;
        } else if (istatus == "Present" && isubmit == "Late"){
            grade = 9;
        } else if (istatus == "Absent" && isubmit == "On time"){
            grade = 8;
        }else if (istatus == "Absent" && isubmit == "Late"){
            grade = 7;
        }else if (istatus == "Present" && isubmit == "None"){
            grade = 5;
        }else if (isubmit == "None"){
            grade = 4;
        }

        out.print("\n| " + istatus + "| Submitted assignment " + isubmit + " | Grade for assignment " + grade + " |");
        return grade;
    }
}