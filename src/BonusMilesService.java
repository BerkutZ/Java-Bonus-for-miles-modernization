public class BonusMilesService {
    public int calculate(int cost) {
        int bonusForMiles = 1;
        int calculate = cost / 20 * bonusForMiles;
        return calculate;
    }

}
