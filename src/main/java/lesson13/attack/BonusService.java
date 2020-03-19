package lesson13.attack;

import java.util.Date;

public class BonusService {

    private static final int EVEN_DAY_BONUS = 5;
    private DateService dateService = new DateService();

    public int calculateAttackBonus() {
        Date now = dateService.currentDate();
        if (now.getDate() % 2 == 0) {
            return EVEN_DAY_BONUS;
        } else {
            return 0;
        }
    }

    public int calculateGoldBonus() {
        return 100;
    }

}
