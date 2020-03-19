package lesson13.attack;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class AttackServiceTest {

    @Mock
    BonusService bonusService;

    @InjectMocks
    AttackService attackService;

    @Test
    public void calculateAttack_withZeroBonus() {
        when(bonusService.calculateAttackBonus()).thenReturn(0);

        int result = attackService.calculateAttack(5);

        assertEquals(50, result);
    }

    @Test
    public void calculateAttack_withFiveBonus() {
        when(bonusService.calculateAttackBonus()).thenReturn(5);

        int result = attackService.calculateAttack(5);

        assertEquals(55, result);
    }

}