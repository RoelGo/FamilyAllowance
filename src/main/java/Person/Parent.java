package Person;

import Employment.EmploymentType;

import java.time.LocalDate;

/**
 * Created by roelg on 18/01/2017.
 */
public class Parent  extends Person{
    public EmploymentType getEmploymentType() {
        return employmentType;
    }

    private EmploymentType employmentType;

    public Parent(String name, LocalDate birthdate, Gender gender,EmploymentType employmentType) {
        super(name, birthdate,gender);
        this.employmentType = employmentType;
    }

    public double getAddition(int amountParents, int amountChildren) {
        // delegate
        return employmentType.getAddition( amountParents,  amountChildren);
    }

}

