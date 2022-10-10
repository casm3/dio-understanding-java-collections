/**
 * Author: Carlos Melo
 */

//TODO
// - Create a Set with all the rainbow colors;
// - A. Show all colors one per line;
// - B. Show the amount of colors that a rainbow has;
// - C. Show the colors in an alphabetical order;
// - D. Show the colors in a reverse order;
// - E. Show all colors that starts with the letter "v";
// - F. Remove all the colors that doesn't start with "v";
// - G. Clear the Set;
// - H. Check if the Set is Empty.

package br.com.collections.set.exercise1;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Exercise1 {
    public static void main(String[] args) {
        // Create a Set with all the rainbow colors;
        Set<String> rainbow = new HashSet<String>(){{
            add("Red");
            add("Orange");
            add("Yellow");
            add("Green");
            add("Blue");
            add("Indigo");
            add("Violet");
        }};
        System.out.println(rainbow);

        // Show all colors one per line;
        for (String color : rainbow) System.out.println(color);

        // Show the amount of colors that a rainbow has;
        System.out.println(rainbow.size());

        // C. Show the colors in alphabetical order;
        TreeSet<String> alphabeticalRainbow = new TreeSet<String>(rainbow);
        System.out.println(alphabeticalRainbow);

        // D. Show the colors in a reverse order;
        System.out.println(alphabeticalRainbow.descendingSet());

        // E. Show all colors that starts with the letter "v";
        for (String color : rainbow)
            if (color.startsWith("V"))
                System.out.println(color);

        // F. Remove all the colors that doesn't start with "v";
        rainbow.removeIf(color -> !color.startsWith("V"));

        System.out.println(rainbow);

        // G. Clear the Set;
        rainbow.clear();

        // H. Check if the Set is Empty.
        System.out.println(rainbow.isEmpty());
    }
}
