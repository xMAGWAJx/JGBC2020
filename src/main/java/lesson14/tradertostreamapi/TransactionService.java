package lesson14.tradertostreamapi;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class TransactionService {

    // 1. Find all transactions in the year 2011 and sort them by value (small to high).

    public List<Transaction> filterByYear(List<Transaction> transactions, int targetYear) {
        List<Transaction> transactionsByYear = new ArrayList<>();
        for (Transaction transaction : transactions) {
            if (transaction.getYear() == targetYear) {
                transactionsByYear.add(transaction);
            }
        }
        return transactionsByYear;
    }

    public void sortTransactionsByVolume(List<Transaction> transactions) {
        TransactionYearComparator comparator = new TransactionYearComparator();
        transactions.sort(comparator);
    }

    public List<Transaction> question1(List<Transaction> transactions) {
        List<Transaction> transactions2011 = filterByYear(transactions, 2011);
        sortTransactionsByVolume(transactions2011);
        return transactions2011;
    }

    //2. What are all the unique cities where the traders work?

    public Set<String> findUniqueCities(List<Transaction> transactions) {
        Set<String> uniqueCities = new HashSet<>();
        for (Transaction transaction : transactions) {
            Trader trader = transaction.getTrader();
            String city = trader.getCity();
            uniqueCities.add(city);
        }
        return uniqueCities;
    }

    public Set<String> question2(List<Transaction> transactions) {
        Set<String> uniqueCitiesResult = findUniqueCities(transactions);
        return uniqueCitiesResult;
    }

    // 3. Done - Find all traders from Cambridge and sort them by name.

    public String question3(List<Transaction> transactions) {
        return transactions.stream()
                .map(transaction -> transaction.getTrader())
                .filter(trader -> trader.getCity().equals("Cambridge"))
                .map(Trader::getName)
                .distinct()
                .sorted()
                .collect(Collectors.joining(","));
    }

    // Done - 4. Return a string of all traders’ names sorted alphabetically.

    public String question4(List<Transaction> transactions) {
        return transactions.stream()
                .map(transaction -> transaction.getTrader().getName())
                .distinct()
                .sorted()
                .collect(Collectors.joining(","));
    }

    // Done - 5. Are any traders based in Milan?

    public boolean question5(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getTrader)
                .map(Trader::getCity)
                .anyMatch(city -> city.equals("Milan"));
    }

    // 6. Done - Print all transactions’ values from the traders living in Cambridge.

    public String question6(List<Transaction> transactions) {
        return transactions.stream()
                //.filter(transaction -> transaction.getTrader().getCity().equals("Cambridge"))
                .filter(this::transactionFromCambridge)
                .map(transaction -> transaction.getValue())
                .map(value -> value.toString())
                .collect(Collectors.joining(","));
    }

    private boolean transactionFromCambridge(Transaction transaction) {
        Trader trader = transaction.getTrader();
        return trader.getCity().equals("Cambridge");
    }

    // Done - 7. What’s the highest value of all the transactions?

    public Optional<Transaction> question7(List<Transaction> transactions) {
        return transactions.stream()
                .max(new TransactionComparatorByValue());
    }

    // Done - 8. Find the transaction with the smallest value

    public Optional<Transaction> question8(List<Transaction> transactions) {
        return transactions.stream()
                .min(new TransactionComparatorByValue());
    }

}