package Student;

import java.util.Date;

public class Person {
    String id;
    String name;
    String email;
    Date birthDate;

    public Person(String id, String name, String email, Date birthDate){
        this.id = id;
        this.name = name;
        this.email =email;
        this.birthDate = birthDate;
    }
}
