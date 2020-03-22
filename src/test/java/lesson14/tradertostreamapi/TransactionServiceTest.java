package lesson14.tradertostreamapi;

import org.junit.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.SortedSet;

import static org.junit.Assert.assertNotNull;
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
        Set<String> result = service.question2(transactions);

        assertEquals(result.size(), 2);
        assertTrue("Cambridge", true);
        assertTrue("Milan", true);
    }

    @Test
    public void testQuestion3() {
        List<Transaction> transactions = storage.getTransactions();
        SortedSet<String> result = service.question3(transactions);

        assertEquals(result.size(), 3);
        assertTrue("Raoul", true);
        assertTrue("Alan", true);
        assertTrue("Brian", true);
    }

    @Test
    public void testQuestion4() {
        List<Transaction> transactions = storage.getTransactions();
        String result = service.question4(transactions);

        Assert.assertEquals(result, "Alan,Brian,Mario,Raoul");
    }

    @Test
    public void testQuestion5() {
        List<Transaction> transactions = storage.getTransactions();
        boolean result = service.question5(transactions);

        assertEquals(result, true);
    }

    @Test
    public void testQuestion6() {
        List<Transaction> transactions = storage.getTransactions();
        List<Integer> result = service.question6(transactions);

        assertEquals(result.size(), 4);
        assertEquals("[300, 1000, 400, 950]", result.toString());
    }

    @Test
    public void testQuestion7() {
        List<Transaction> transactions = storage.getTransactions();
        Optional<Transaction> opt =
                service.question7(transactions);
        if (opt.isPresent()) {
            Transaction maxTransaction = opt.get();
            assertNotNull(maxTransaction);
        } else {
            System.out.println("Maximum transaction not found!");
        }
    }

    @Test
    public void testQuestion8() {
        List<Transaction> transactions = storage.getTransactions();
        Optional<Transaction> opt =
                service.question8(transactions);
        if (opt.isPresent()) {
            Transaction smallestTransaction = opt.get();
            assertNotNull(smallestTransaction);
        } else {
            System.out.println("Smallest transaction not found!");
        }
    }
}
