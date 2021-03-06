import Employment.SelfEmployed;
import Person.Child;
import Person.Gender;
import Person.Parent;
import Person.Person;

import java.util.ArrayList;
import java.util.Arrays;
/**
 * Created by roelg on 18/01/2017.
 */
public class Family {
    ArrayList<Person> children = new ArrayList<>();
    ArrayList<Person> parents = new ArrayList<>();

    public double calculateAllowance(){
        double output = 0;

        output += baseAddition();
        output += ageAddition();
        output += parentAddition();

        return output;
    }

    public void addParent(Parent parent) {
        parents.add(parent);
        parents = sortByAge(parents);
    }
    public void addChild(Child child) {
        children.add(child);
        children = sortByAge(children);
    }

    public double ageAddition(){
    if (children.size()!=0){
        double total=0;
        if (children.get(0).getAge()>=6 && children.get(0).getAge()<=11){total+= 16.04;}
        else if (children.get(0).getAge()>=12 && children.get(0).getAge()<=17){total+= 24.43;}
        else if (children.get(0).getAge()>=18){total+= 28.16;}
        else total+= 0.0;

        if (children.size()>1){
        for (int i=1;i<children.size();i++){
            if (children.get(i).getAge()>=6 && children.get(i).getAge()<=11){total+= 31.99;}
            else if (children.get(i).getAge()>=12 && children.get(i).getAge()<=17){total+= 48.88;}
            else if (children.get(i).getAge()>=18){total+= 62.15;}
            else total+=0.0;
        }}
        return total;
    }
    else return 0.0;
}

    public double parentAddition() {
        int amountParents = parents.size();
        int amountChildren = children.size();

        return getFamilyHead().getAddition(amountParents, amountChildren);
    }

    public Parent getFamilyHead() {
// needs 1+ males
        Parent familyHead = ((Parent) parents.get(0));

        for (Person parent : parents) {
            if (parent.getGender() == Gender.MALE) {
                familyHead = ((Parent) parent);

            }  else if ( parent.getGender() == Gender.FEMALE)
            {
                familyHead = ((Parent) parent);
            }
        }

        return familyHead;
    }

    public double baseAddition() {
        int amountChildren = children.size();
        double output = 0;

        for (int childNr = 0; childNr <= children.size(); childNr++) {

            if (getFamilyHead().getEmploymentType().getClass() != SelfEmployed.class) {
                if (((Child) children.get(childNr)).isOrphan()) {
                    output += 353.76;
                } else if (childNr == 0) {
                    output += 92.09;
                } else if (childNr == 1) {
                    output += 170.39;
                } else if (childNr == 2) {
                    output += 254.40;
                }
            } else  {
                output += 61.79;
            }
        }
        return output;
    }

    public static ArrayList<Person> sortByAge(ArrayList<Person> people) {
        int[][] array = new int[people.size()][2];
        ArrayList<Person> output = new ArrayList<>();
        for (int i = 0; i < people.size(); i++) {
            array[i][0] = people.get(i).getAgeInDays();
            array[i][1] = i;
        }
        Arrays.sort(array, new java.util.Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return Integer.compare(a[0], b[0]);
            }
        });
        for (int i = people.size()-1; i >=0 ; i--) {
            output.add(people.get((array[i][1])));
        }
        return output;
    }

}
