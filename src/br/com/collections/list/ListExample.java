package br.com.collections.list; /**
 * Author: Carlos Melo
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        System.out.println("Create a grade list with seven grades: ");
        List<Double> grades = new ArrayList<>();
        grades.add(7.0);
        grades.add(8.5);
        grades.add(9.3);
        grades.add(5.0);
        grades.add(7.0);
        grades.add(0.0);
        grades.add(3.6);
        System.out.println(grades);

        System.out.println("Show the position of 5.0 grade: " + grades.indexOf(5.0));
        System.out.println("Add the 8.0 grade to the list at position 4: ");
        grades.add(4, 8.0);
        System.out.println(grades);

        System.out.println("Change the grade 5.0 with grade 6.0");
        grades.set(grades.indexOf(5.0), 6.0);
        System.out.println(grades);

        System.out.println("Check if grade 5.0 is on the list: " + grades.contains(5.0));

        for (Double grade : grades) System.out.println(grade);

        System.out.println("Show the third added grade: " + grades.get(2));

        System.out.println("Show the lower grade: " + Collections.min(grades));
        System.out.println("Show the maximum grade: " + Collections.max(grades));

        Iterator<Double> iterator = grades.iterator();
        Double sum = 0d;

        while (iterator.hasNext()){
            Double next = iterator.next();
            sum += next;
        }

        System.out.println("Show the sum of all grades: " + sum);
        System.out.println("Show the mean of grades: " + (sum/grades.size()));

        System.out.println("Remove the grade 0: ");
        grades.remove(0d);

        System.out.println("Remove the grade at the position 0: ");
        grades.remove(0);

        System.out.println("Remove the grades that are lower than 7 and show the list: ");

        grades.removeIf(next -> next < 7.0);

        System.out.println(grades);

        System.out.println("Delete the list");
        grades.clear();

        System.out.println(grades);

        System.out.println("Check if the list is empty: " + grades.isEmpty());



    }
}
