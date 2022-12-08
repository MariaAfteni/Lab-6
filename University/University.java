package University;

import java.util.*;


import static java.lang.System.out;

public class University {
    Random rand = new Random();

    public int  total_students(){
        int n;
        n = rand.nextInt(1000) + 200;
        out.print("\nTotal students at university: " + n );
        return n;
    }

    public int students_present(int total, int day){
        int present;
        present = rand.nextInt(total);

        if (day == 2){
            present = present - 100;
        }
        if (day == 6){
            present = present - 300;
        }
        if (present < 0){
            present = -present;
        }
        if (present < total/2){
            present = present + 150;
        }


        return present;
    }
    public int  total_professor(int t){
        int n;

        n = rand.nextInt(t);
        out.print("\nTotal professors at university: " + n );
        return n;
    }

    public int total_courses(){
        int n;
        n = rand.nextInt(10);
        return n;
    }




}
