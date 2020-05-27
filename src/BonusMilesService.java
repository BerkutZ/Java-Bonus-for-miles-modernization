public class BonusMilesService {
    public int calculate(int cost) {
        int bonus_for_miles = 1;
        int calculate = cost / 20 * bonus_for_miles;
        return calculate;
    }

}
