package Employment;

/**
 * Created by roelg on 18/01/2017.
 */
public class Disabled implements EmploymentType {

    @Override
    public double getAddition(int amountParents, int amountChildren) {
        if (amountChildren >= 3) {
            return 46.88 + 29.06 + (23.43 * (amountChildren - 2));
        } else if (amountChildren == 2) {
            return 46.88 + 29.06;
        } else if (amountChildren == 1) {
            return 46.88;
        }
        return 0;
    }
}
