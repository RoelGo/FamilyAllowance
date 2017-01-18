package main.java;

import java.time.LocalDate;

/**
 * Created by roelg on 18/01/2017.
 */
public class Child extends Person {

    private boolean isOrphan;

    public Child(String name, LocalDate birthdate) {
        super(name, birthdate);
        this.isOrphan = false;
    }

    public Child(String name, LocalDate birthdate, boolean isOrphan) {
        super(name, birthdate);
        this.isOrphan = isOrphan;
    }

    public Boolean isOrphan() {
        return isOrphan;
    }

    public void becomesOrphan() {
        isOrphan = true;
    }

}
