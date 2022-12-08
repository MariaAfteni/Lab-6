package University;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;


public class Student {

    public String Surname(){
        List<String> surnames = Arrays.asList( "Smith", "Johnson", "Williams", "Brown", "Jones", "Garcia", "Miller", "Davis", "Rodriguez",
                "Martinez");
        String surname;

        Collections.shuffle(surnames, new Random());
        surname = surnames.get(0);

        return surname;
    }

    public String Name() {
        List<String> names = Arrays.asList("Liam","Olivia","Noah","Emma","Oliver","Charlotte","Elijah","Amelia","James","Ava","William",
                "Sophia","Benjamin","Isabella","Lucas","Mia","Henry","Evelyn","Theodore","Harper");

        String name;

        Collections.shuffle(names, new Random());
        name = names.get(0);

        return name;

    }

}
