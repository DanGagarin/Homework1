package JCA_Homework10;

import java.security.Key;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        phoneBook2();
        System.out.println("----------------");
        words();
    }

    static void phoneBook() {

        WeakHashMap<String, Integer> nameAndPhone = new WeakHashMap<>();

        nameAndPhone.put("Luke", 89001234);
        nameAndPhone.put("Han", 89005678);
        nameAndPhone.put("Luke", 89009012);

        Integer phone = nameAndPhone.get("Luke");
        System.out.println(phone);

        nameAndPhone.put("Dart", 89009999);
        System.out.println(nameAndPhone);

    }

    static void phoneBook2() {
        HashMap<String, Integer> nameAndPhone = new HashMap<>();
        nameAndPhone.put("Luke", 89001234);
        nameAndPhone.put("Han", 89005678);
        nameAndPhone.put("Luke", 89009012);
        nameAndPhone.put("Mando", 89009013);
        for (Map.Entry<String, Integer> o : nameAndPhone.entrySet()) {
            System.out.println(o.getKey() + ": " + o.getValue());
        }
        //Integer phone = nameAndPhone.get("Luke");
        //System.out.println(phone);

        Integer n = nameAndPhone.get("Luke");
        System.out.println("Search >>> Luke number");
        if (n != null) { System.out.println("Search result >>> " + n); }

        nameAndPhone.put("Dart", 89005556);
        System.out.println("New subscriber >>> " + nameAndPhone.get("Dart"));

    }

    static void words() {

        List<String> words = Arrays.asList("apple", "apple", "apple", "tomato", "tomato", "potato", "potato", "peach",
                "pear", "cranberry", "blueberry", "strawberry", "orange", "banana", "coconut", "mango");
        System.out.println("Set of words >>>");
        words.forEach(System.out::println);

        System.out.println("\nWords count >>>");
        Map<String, Integer> wordsCount = new HashMap<>();
        for (String s : words) { wordsCount.put(s, wordsCount.getOrDefault(s, 0) + 1); }
        wordsCount.entrySet().forEach(System.out::println);

        System.out.println("\nList of unique words >>>");
        Set<String> unique = new HashSet<>(words);
        unique.forEach(System.out::println);
    }
}
