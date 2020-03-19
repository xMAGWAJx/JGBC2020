package lesson13.attack;

public class AttackService {

    private BonusService bonusService = new BonusService();

    public int calculateAttack(int strength) {
        return strength * 10 + bonusService.calculateAttackBonus();
    }

}
