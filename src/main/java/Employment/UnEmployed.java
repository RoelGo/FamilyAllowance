package Employment;

/**
 * Created by roelg on 18/01/2017.
 */
public class UnEmployed  implements EmploymentType{
    @Override
    public double getAddition(int amountParents, int amountChildren) {
        return 0;
    }
}
