import Person.Child;
import Person.Gender;
import Person.Person;
import com.sun.org.apache.xpath.internal.functions.FuncQname;
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
        ArrayList<Person> testChildren = new ArrayList<>();
        testChildren.add(new Child("Roel", LocalDate.of(1992,12,2), Gender.FEMALE));
        testChildren.add(new Child("Roel", LocalDate.of(1997,12,2), Gender.FEMALE));
        testChildren.add(new Child("Roel", LocalDate.of(1999,12,2), Gender.FEMALE));
        testChildren.add(new Child("Roel", LocalDate.of(2003,2,10), Gender.FEMALE));
        testChildren.add(new Child("Roel", LocalDate.of(1991,12,2), Gender.FEMALE));
        testChildren.add(new Child("Roel", LocalDate.of(2003,12,2), Gender.FEMALE));
        testChildren.add(new Child("Roel", LocalDate.of(2003,2,2), Gender.FEMALE));
        testChildren.add(new Child("Roel", LocalDate.of(2003,2,10), Gender.FEMALE));
        System.out.println();
        System.out.println("############## BEFORE");
        System.out.println();

        for (Person testChild : testChildren) {
            System.out.println(testChild);
        }

        testChildren  = Family.SortByAge(testChildren);

        System.out.println();
        System.out.println("############## AFTER");
        System.out.println();

        for (Person testChild : testChildren) {
            System.out.println(testChild);
        }


    }

}