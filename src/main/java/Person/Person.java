package Person;

import java.time.LocalDate;
import java.time.Period;

/**
 * Created by roelg on 16/01/2017.
 */
public abstract class Person {
    protected String name;
    protected LocalDate birthdate;
    protected Gender gender;

    public Person(String name, LocalDate birthdate, Gender gender) {
        this.name = name;
        this.birthdate = birthdate;
        this.gender = gender;
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
