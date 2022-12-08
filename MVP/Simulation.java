package MVP;

import Courses.Assignment;
import Courses.Exam;
import Courses.Midterm;
import University.University;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import static java.lang.System.out;

public class Simulation implements System_Simulation.Presenter{
    @Override
    public void Simulate() throws InterruptedException {
        {
            Model model = new Model();
            View view = new View();

            Date date = new Date();
            University u = new University();
            Assignment a1 = new Assignment();
            Assignment a2 = new Assignment();
            Assignment a3 = new Assignment();
            Midterm m = new Midterm();
            Exam e = new Exam();

            int total_students = u.total_students();
            int weekday = 1, week = 1, w = 0, p = 0, grade;
            int present = u.students_present(total_students, weekday);

            String assignment1, assignment2, assignment3, status;

            ArrayList<Integer> grade1 = new ArrayList<>();
            ArrayList<Integer> grade2 = new ArrayList<>();
            ArrayList<Integer> grade3 = new ArrayList<>();
            ArrayList<Integer> mid1 = new ArrayList<>();
            ArrayList<Integer> mid2 = new ArrayList<>();
            ArrayList<Integer> mid3 = new ArrayList<>();
            ArrayList<Integer> exam = new ArrayList<>();

            ArrayList<String> names;
            ArrayList<String> surnames;
            names = model.Names();
            surnames = model.Surnames();

            view.Start_semester();
            ArrayList<String> courses;
            courses = model.Courses();
            out.print("\n======================================");

            while(true){
                if (w == 0){
                   view.Week(week); }
                out.print("\n--------------------------------------");
                weekday = date.display_day(weekday);

                w++;
                if (p<5){
                    if (week % 2 != 0 && week % 5 != 0){
                        view.Total_present(present);

                        assignment1 = a1.add_assignment(courses.get(0));
                        view.Assignment_submitted(assignment1, present, total_students);
                        assignment2 = a2.add_assignment(courses.get(1));
                        view.Assignment_submitted(assignment2, present, total_students);
                        assignment3 = a3.add_assignment(courses.get(2));
                        view.Assignment_submitted(assignment3, present, total_students);

                        view.Submit_Log();
                        view.submit_student(surnames.get(0), names.get(0));
                        view.submit_course(courses.get(0));
                        grade = model.Course_grade();
                        grade1.add(grade);
                        view.submit_course(courses.get(1));
                        grade = model.Course_grade();
                        grade1.add(grade);
                        view.submit_course(courses.get(2));
                        grade = model.Course_grade();
                        grade1.add(grade);
                        view.submit_student(surnames.get(1), names.get(1));
                        view.submit_course(courses.get(0));
                        grade = model.Course_grade();
                        grade2.add(grade);
                        view.submit_course(courses.get(1));
                        grade = model.Course_grade();
                        grade2.add(grade);
                        view.submit_course(courses.get(2));
                        grade = model.Course_grade();
                        grade2.add(grade);
                        view.submit_student(surnames.get(2), names.get(2));
                        view.submit_course(courses.get(0));
                        grade = model.Course_grade();
                        grade3.add(grade);
                        view.submit_course(courses.get(1));
                        grade = model.Course_grade();
                        grade3.add(grade);
                        view.submit_course(courses.get(2));
                        grade = model.Course_grade();
                        grade3.add(grade);
                    }
                    else if(week % 2 == 0){
                        view.Midterms_week();
                        view.Total_present(present);
                        Collections.shuffle(courses, new Random(1));
                        view.submit_course(courses.get(0));
                        view.submit_student(surnames.get(0), names.get(0));
                        grade = m.grade_midterm(grade1);
                        mid1.add(grade);
                        status = m.status();
                        m.display(grade, status);
                        view.submit_student(surnames.get(1), names.get(1));
                        grade = m.grade_midterm(grade2);
                        mid2.add(grade);
                        status = m.status();
                        m.display(grade, status);
                        view.submit_student(surnames.get(2), names.get(2));
                        grade = m.grade_midterm(grade3);
                        mid3.add(grade);
                        status = m.status();
                        m.display(grade, status);
                        p = 5;
                    }
                    else{
                        view.Exams_week();
                        view.Total_present(present);
                        Collections.shuffle(courses, new Random(1));
                        view.submit_course(courses.get(0));
                        view.submit_student(surnames.get(0), names.get(0));
                        grade = e.grade_exam(mid1);
                        exam.add(grade);
                        view.submit_student(surnames.get(1), names.get(1));
                        grade = e.grade_exam(mid2);
                        exam.add(grade);
                        view.submit_student(surnames.get(2), names.get(2));
                        grade = e.grade_exam(mid3);
                        exam.add(grade);
                        e.avg(exam, courses.get(0));
                        p = 5;
                        if (w == 5){
                            courses.clear();
                            grade1.clear();
                            grade2.clear();
                            grade3.clear();
                            mid1.clear();
                            mid2.clear();
                            mid3.clear();
                            exam.clear();
                            names.clear();
                            surnames.clear();

                            view.End_semester();
                            Thread.sleep(1000);
                            view.Start_semester();
                            courses = model.Courses();
                            out.print("\n======================================");


                            names = model.Names();
                            surnames = model.Surnames();
                            week = 0;
                        }
                    }
                    p++;} else { p = 0;}

                if (w > 5){
                    week ++;
                    w = 0;
                }
                Thread.sleep(3500);
            }
        }
    }
}
