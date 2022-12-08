package MVP;

import Courses.Assignment;
import MVP.System_Simulation;

import static java.lang.System.out;

public class View implements System_Simulation.View{


    public void Assignment_submitted(String assignment, int present, int total){
        Assignment a1 = new Assignment();

        a1.submitted_by(assignment, present, total);
        out.print("\n");
    }

    public void Submit_Log(){
        out.print("\n------------------------------------------");
        out.print("\n|          Submit Log                    |");
        out.print("\n------------------------------------------");
    }

    public void submit_student(String surname, String name){
        out.print("\n#" + surname + " " + name);
    }

    public void submit_course(String course){
        out.print("\n - " + course);
    }

    @Override
    public void Start_semester(){
        out.print("\n===========================================");
        out.print("\n      START of the new semester");
        out.print("\n===========================================");
        out.print("\n======================================");
        out.print("\nCourses this semester");
    }

    @Override
    public void Total_present(int present) {
        out.print("\nTotal students present today: " + present);
    }
    @Override
    public void End_semester() {
        out.print("\n===========================================");
        out.print("\n         END of the semester");
        out.print("\n===========================================");
    }
    @Override
    public void Midterms_week(){
        out.print("\n!!! MIDTERMS WEEK!!");
    }
    @Override
    public void Exams_week(){
        out.print("\n!!! EXAMS WEEK !!!");
    }
    @Override
    public void Week(int week){
        out.print("\nWeek " + week);
    }
}
