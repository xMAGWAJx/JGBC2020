package lesson9.menu;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<String, BigDecimal> menu = new HashMap<>();
        System.out.println("menu = " + menu);
        menu.put("Steak", new BigDecimal("12.99"));
        menu.put("Fries", new BigDecimal("3.99"));
        menu.put("Salad", new BigDecimal("6.99"));
        menu.put("Sauce", new BigDecimal("0.99"));
        menu.put("Coffee", new BigDecimal("2.49"));
        System.out.println("menu = " + menu);

        System.out.println("menu.size() = " + menu.size());
        System.out.println("menu.get(\"Fries\") = " + menu.get("Fries"));

        System.out.println();
        System.out.println("-- Contains, Keys & Values --");
        System.out.println("menu.containsKey(\"Salad\") = " + menu.containsKey("Salad"));
        System.out.println("menu.containsValue(new BigDecimal(\"6.99\")) = " +
                menu.containsValue(new BigDecimal("6.99")));
        System.out.println("menu.keySet() = " + menu.keySet());
        System.out.println("menu.values() = " + menu.values());

        System.out.println();
        System.out.println("-- Remove --");
        menu.remove("Fries");
        System.out.println("menu = " + menu);
        System.out.println("menu.size() = " + menu.size());
        menu.clear();
        System.out.println("menu = " + menu);
        System.out.println("menu.size() = " + menu.size());
    }
}
