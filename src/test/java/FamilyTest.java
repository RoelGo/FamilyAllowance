import Person.Child;
import Person.Gender;
import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by rodrPMFF on 18/01/2017.
 */
public class FamilyTest {
    @Test
    public void sortByAge() throws Exception {
        ArrayList<Child> testChildren = new ArrayList<>();
        testChildren.add(new Child("Roel", LocalDate.of(1992,12,2), Gender.FEMALE));
        testChildren.add(new Child("Roel", LocalDate.of(1997,12,2), Gender.FEMALE));
        testChildren.add(new Child("Roel", LocalDate.of(1999,12,2), Gender.FEMALE));
        testChildren.add(new Child("Roel", LocalDate.of(1991,12,2), Gender.FEMALE));
        testChildren.add(new Child("Roel", LocalDate.of(2003,12,2), Gender.FEMALE));

        System.out.println(testChildren);
    }

}