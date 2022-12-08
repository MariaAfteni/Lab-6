package MVP;

import java.util.ArrayList;

public interface System_Simulation {
    interface View{
         void Start_semester();
         void Total_present(int present);
         void Midterms_week();
         void Exams_week();
         void Week(int week);
         void End_semester();
    }

    interface Presenter{
        void Simulate() throws InterruptedException ;
    }

    interface Model{
        ArrayList<String> Surnames();
        ArrayList<String> Names();
        ArrayList<String> Courses();
        int Course_grade();
    }
}
