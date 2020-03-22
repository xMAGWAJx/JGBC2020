package lesson12.traderpractisetask;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

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

    // 3. Find all traders from Cambridge and sort them by name.

    public SortedSet<String> findAllTradersFromCity(List<Transaction> transactions, String targetCity) {
        SortedSet<String> allTradersFromCity = new TreeSet<>();
        for (Transaction transaction : transactions) {
            Trader trader = transaction.getTrader();
            if (trader.getCity() == targetCity) {
                allTradersFromCity.add(String.valueOf(trader));
            }
        }
        return allTradersFromCity;
    }

    public SortedSet<String> question3(List<Transaction> transactions) {
        SortedSet<String> allTradersFromCity = findAllTradersFromCity(transactions, "Cambridge");
        return allTradersFromCity;
    }

    // 4. Return a string of all traders’ names sorted alphabetically.

    public SortedSet<String> findAllTraders(List<Transaction> transactions) {
        SortedSet<String> allTraders = new TreeSet<>();
        for (Transaction transaction : transactions) {
            Trader trader = transaction.getTrader();
            allTraders.add(String.valueOf(trader));
        }
        return allTraders;
    }

    public SortedSet<String> question4(List<Transaction> transactions) {
        SortedSet<String> allTraders = findAllTraders(transactions);
        return allTraders;
    }

    // 5. Are any traders based in Milan?

    public SortedSet<String> question5(List<Transaction> transactions) {
        SortedSet<String> allTradersFromCity = findAllTradersFromCity(transactions, "Milan");
        return allTradersFromCity;
    }

    // 6. Print all transactions’ values from the traders living in Cambridge.

    public List<Integer> findTransactionsTradersFromCity(List<Transaction> transactions, String targetCity) {
        List<Integer> transactionsTradersFromCity = new ArrayList<>();
        for (Transaction transaction : transactions) {
            Trader trader = transaction.getTrader();
            if (trader.getCity() == targetCity) {
                transactionsTradersFromCity.add(transaction.getValue());
            }
        }
        return transactionsTradersFromCity;
    }

    public List<Integer> question6(List<Transaction> transactions) {
        List<Integer> allTransactionsTradersFromCity = findTransactionsTradersFromCity(transactions, "Cambridge");
        return allTransactionsTradersFromCity;
    }

    // 7. What’s the highest value of all the transactions?

    public List<Integer> findAllTransactions(List<Transaction> transactions) {
        List<Integer> allTransactions = new ArrayList<>();
        for (Transaction transaction : transactions) {
            allTransactions.add(transaction.getValue());
        }
        return allTransactions;
    }

    public Integer findHighestValueOfTransaction(List<Transaction> transactions) {
        List<Integer> highestValueOfTransaction = findAllTransactions(transactions);
        Integer maxValue = Collections.max(highestValueOfTransaction);
        return maxValue;
    }

    public Integer question7(List<Transaction> transactions) {
        Integer highestValueOfTransactionResult = findHighestValueOfTransaction(transactions);
        return highestValueOfTransactionResult;
    }

    // 8. Find the transaction with the smallest value

    public Integer findLowestValueOfTransaction(List<Transaction> transactions) {
        List<Integer> highestValueOfTransaction = findAllTransactions(transactions);
        Integer minValue = Collections.min(highestValueOfTransaction);
        return minValue;
    }

    public Integer question8(List<Transaction> transactions) {
        Integer lowestValueOfTransaction = findLowestValueOfTransaction(transactions);
        return lowestValueOfTransaction;
    }

}