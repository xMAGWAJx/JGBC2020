package lesson14.tradertostreamapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
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