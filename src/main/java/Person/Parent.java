package Person;

import Employment.EmploymentType;

import java.time.LocalDate;

/**
 * Created by roelg on 18/01/2017.
 */
public class Parent  extends Person{

    private EmploymentType employmentType;



    public Parent(String name, LocalDate birthdate, Gender gender) {
        super(name, birthdate,gender);
    }

}

