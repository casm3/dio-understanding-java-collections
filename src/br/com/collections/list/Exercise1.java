package br.com.collections.list;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Carlos Melo
 */

/*
Make a program that receives the mean temperature of the first 6 months of the year and store them into a list.

Later, calculate the semester mean temperature and show all temperatures that are over this mean, and the month that
they happened. (Show the months for extensive, such as January).
 */

public class Exercise1 {
    public static void main(String[] args) {
        System.out.println("Temperature by month mean: ");
        List<Double> temperatures = new ArrayList<>() {{
            add(30d);
            add(28.6);
            add(26.8);
            add(23.5);
            add(20.5);
            add(16.5);
        }};

        System.out.println("The mean temperature for this semester was: " + meanTemperature(temperatures) + " degrees.");

        System.out.println("They highest temperatures were: ");
        highestTemperature(temperatures);
    }
    protected static double meanTemperature(List<Double> temperatures) {
        double sum = 0d;
        int listSize = temperatures.size();
        for (Double temperature : temperatures) sum += temperature;
        return sum/listSize;
    }

    protected static void highestTemperature(List<Double> temperatures){
        String[] months = {"January", "February", "March", "April", "June", "July", "August", "September",
                "October", "November", "December"};
        for (Double temperature : temperatures){
            int index = temperatures.indexOf(temperature);
            if (temperature > meanTemperature(temperatures))
                System.out.println(temperature + " degrees in " + months[index]);
        }
    }
}
