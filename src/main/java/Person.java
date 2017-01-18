package main.java;

import java.time.LocalDate;
import java.time.Period;

/**
 * Created by roelg on 16/01/2017.
 */
public abstract class Person {
    private String name;
    private LocalDate birthdate;

    public Person(String name, LocalDate birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }


    public String getName() {
        return name;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public int getAge(){
        return Period.between(this.birthdate, LocalDate.now()).getYears();
    }
}
