package lesson13.attack;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class BonusServiceTest {

    @Mock
    DateService dateService;

    @InjectMocks
    BonusService bonusService;

    @Test
    public void calculateAttackBonus_oddDate() {
        when(dateService.currentDate()).thenReturn(oddDate());
        int result = bonusService.calculateAttackBonus();
        assertEquals(0, result);
    }

    @Test
    public void calculateAttackBonus_evenDate() {
        when(dateService.currentDate()).thenReturn(evenDate());
        int result = bonusService.calculateAttackBonus();
        assertEquals(5, result);
    }

    private Date oddDate() {
        Date odd = new Date();
        odd.setDate(11);
        return odd;
    }

    private Date evenDate() {
        Date even = new Date();
        even.setDate(12);
        return even;
    }
}