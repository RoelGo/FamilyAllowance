

import java.time.LocalDate;

/**
 * Created by roelg on 18/01/2017.
 */
public class Child extends Person {

    private boolean isOrphan;

    public Child(String name, LocalDate birthdate, boolean gender) {
        super(name, birthdate,gender);
        this.isOrphan = false;
    }

    public Child(String name, LocalDate birthdate,boolean gender, boolean isOrphan) {
        super(name, birthdate, gender);
        this.isOrphan = isOrphan;
    }

    public Boolean isOrphan() {
        return isOrphan;
    }

    public void becomesOrphan() {
        isOrphan = true;
    }

}
