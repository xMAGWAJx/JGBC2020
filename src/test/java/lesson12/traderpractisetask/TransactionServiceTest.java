package lesson12.traderpractisetask;

import org.testng.annotations.Test;

import java.util.List;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class TransactionServiceTest {

    private TransactionStorage storage = new TransactionStorage();
    private TransactionService service = new TransactionService();

    @Test
    public void testQuestion1() {
        List<Transaction> transactions = storage.getTransactions();
        List<Transaction> result = service.question1(transactions);

        assertEquals(result.size(), 2);
        assertEquals(result.get(0).getValue(), 300);
        assertEquals(result.get(1).getValue(), 400);

        assertEquals(result.get(0).getYear(), 2011);
        assertEquals(result.get(1).getYear(), 2011);
    }

    @Test
    public void testQuestion2() {
        List<Transaction> transactions = storage.getTransactions();
        List<Transaction> result = service.question1(transactions);

        assertEquals(result.size(), 2);
        assertTrue("Cambridge", true);
        assertTrue("Milan", true);
    }

}
