package br.com.collections.set.examples;

import java.util.*;

public class SetExample {
    public static void main(String[] args) {

        System.out.println("Creating a grade set");
        Set<Double> grades = new HashSet<>(){{
            add(7d);
            add(8.5d);
            add(9.3d);
            add(5d);
            add(0d);
            add(3.6d);
        }};
        System.out.println(grades);

        System.out.println("Check if the grade 5.0 is in the grade set. " + grades.contains(5d));

        System.out.println("Show the min grade. " + Collections.min(grades));
        System.out.println("Show the max grade. " + Collections.max(grades));

        Iterator<Double> iterator = grades.iterator();
        Double sum = 0d;

        while (iterator.hasNext()){
            Double next = iterator.next();
            sum += next;
        }

        System.out.println("Show the sum of the grades: " + sum);

        System.out.println("Show the grades mean: " + (sum/ grades.size()));

        System.out.println("Remove the zero grade");

        grades.remove(0d);

        System.out.println("Remove the grades that are less than seven.");

        grades.removeIf(next -> next < 7);

        System.out.println(grades);

        System.out.println("Show the grades at given order: ");

        Set<Double> listGrades = new LinkedHashSet<>(){{
            add(7d);
            add(8.5d);
            add(9.3d);
            add(5d);
            add(0d);
            add(3.6d);
        }};
        System.out.println(listGrades);

        System.out.println("Show all grades in ascending order. ");
        Set<Double> treeGrades = new TreeSet<>(grades);
        System.out.println(treeGrades);

        System.out.println("Clear the set. ");
        grades.clear();
        System.out.println(grades);

    }
}
