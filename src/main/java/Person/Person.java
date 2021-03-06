package Person;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/**
 * Created by roelg on 16/01/2017.
 */
public abstract class Person implements Comparable{
    protected String name;
    protected LocalDate birthdate;
    protected Gender gender;

    public Gender getGender() {
        return gender;
    }

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

    public int getAgeInDays() {
        LocalDate today = LocalDate.now();
        long age = ChronoUnit.DAYS.between(birthdate, today);
        int ageint = (int) age;
        return ageint;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthdate=" + birthdate +
                ", gender=" + gender +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        return getAgeInDays() - ((Person) o).getAgeInDays();
    }
}
