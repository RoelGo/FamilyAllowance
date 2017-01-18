

import java.util.ArrayList;
/**
 * Created by roelg on 18/01/2017.
 */
public class Family {
    ArrayList<Child> children = new ArrayList<>();
    ArrayList<Parent> Parents = new ArrayList<>();

public double AgeAddition(){
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

}
