package me.snajdovski.zadaca1;

import java.util.HashMap;
import java.util.Map;

/**
 * 1. Да се креира мапа со име речник. И клучот и вредноста да бидат од тип
 * String. Како клучеви да се внесуваат зборови на англиски јазик, а како
 * вредности соодветен превод на македонски. Да се внесат најмалку пет
 * парови.
 * a. Да се испечатат само клучевите
 * b. Да се испечатат само вредностите
 * c. Да се испечатат и клучевите и вредностите
 * d. Да се испечати вредноста за зборот 'hi' на македонски, доколку
 * постои, а во спротивно да се испечати дека таков збор не постои.
 */

public class Main {
    public static void main(String[] args) {


        // Креирај мапа за да ги зачуваме преводите
        Map<String, String> translations = new HashMap<>();

        // Додади клуч-вредност пар во мапата
        translations.put("Hello", "Здраво");
        translations.put("Goodbye", "Довидување");
        translations.put("Yes", "Да");
        translations.put("No", "Не");
        translations.put("Thank you", "Ви благодарам");

        // Испечати ги сите клучеви
        System.out.println("Keys: " + translations.keySet());

        // Испечати ги сите вредности
        System.out.println("Values: " + translations.values());

        // Испечати ги сите клуч-вредност парови
        for (Map.Entry<String, String> entry : translations.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Испечати го преводот на 'hi' ако постои
        String hiMacedonian = translations.get("Hi");
        if (hiMacedonian != null) {
            System.out.println("Hi in Macedonian: " + hiMacedonian);
        } else {
            System.out.println("The word 'Hi' does not exist in the dictionary.");
        }
    }
}