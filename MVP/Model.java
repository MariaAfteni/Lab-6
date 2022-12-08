package MVP;

import Courses.Assignment;
import Courses.Course;
import MVP.System_Simulation;
import University.Student;

import java.util.ArrayList;
import java.util.Objects;

public class Model implements System_Simulation.Model{

    @Override
    public ArrayList<String> Courses(){
        ArrayList<String> list = new ArrayList<>();
        Course c1 = new Course();
        Course c2 = new Course();
        Course c3 = new Course();
        String course1, course2, course3;

        course1 = c1.list_courses();
        course2 = c2.list_courses();
        if (Objects.equals(course1, course2))
        {course2 = c2.list_courses();}
        course3 = c3.list_courses();
        if (Objects.equals(course1, course3) || Objects.equals(course2, course3)){course3 = c3.list_courses();}
        list.add(course1);
        list.add(course2);
        list.add(course3);
        return list;
    }

    @Override
    public ArrayList<String> Names(){
        String s1name,  s2name,  s3name;
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        ArrayList<String> list = new ArrayList<>();


        s1name = s1.Name();

        s2name = s2.Name();

        s3name = s3.Name();

        list.add(s1name); list.add(s2name); list.add(s3name);

        return list;
    }

    @Override
    public ArrayList<String> Surnames(){
        String  s1surname, s2surname, s3surname;
        ArrayList<String> list = new ArrayList<>();

        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1surname = s1.Surname();
        s2surname = s2.Surname();
        s3surname = s3.Surname();

        list.add(s1surname); list.add(s2surname); list.add(s3surname);

        return list;
    }

    @Override
    public int Course_grade(){
        Assignment a = new Assignment();
        int grade;
        grade = a.grade();
        return grade;
    }

}
