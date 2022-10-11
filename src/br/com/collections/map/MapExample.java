package br.com.collections.map;

import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        System.out.println("Create a dictionary that relates models and their consume. ");
        Map<String, Double> popularCars = new HashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(popularCars);

        System.out.println("Change the gol consume by 15.2 km/l.");
        popularCars.put("gol", 15.2);
        System.out.println(popularCars);

        System.out.println("Check if the tucson model is in the dictionary. " + popularCars.containsKey("tucson"));

        System.out.println("Show the uno consumption: " + popularCars.get("uno"));

        System.out.println("Show all the models. ");
        Set<String> models = popularCars.keySet();
        System.out.println(models);

        System.out.println("Show all consumption values");
        Collection<Double> consumption = popularCars.values();
        System.out.println(consumption);

        System.out.println("Show the most economic model and its consumption. ");
        Double mostEfficientConsume = Collections.max(consumption);
        Set<Map.Entry<String, Double>> entries = popularCars.entrySet();
        String mostEfficientModel = "";

        for (Map.Entry<String, Double> entry : entries) {
            if (entry.getValue().equals(mostEfficientConsume)) {
                mostEfficientModel = entry.getKey();
                System.out.println("Most Efficient Model: "
                        + mostEfficientModel
                        + " - Consumption: "
                        + mostEfficientConsume
                );
            }
        }

        System.out.println("Show the less economic model and its consumption. ");
        Double lessEfficientConsume = Collections.min(consumption);
        String lessEfficientModel = "";

        for (Map.Entry<String, Double> entry : entries) {
            if (entry.getValue().equals(lessEfficientConsume)) {
                lessEfficientModel = entry.getKey();
                System.out.println("Less Efficient Model: "
                        + lessEfficientModel
                        + " - Consumption: "
                        + lessEfficientConsume
                );
            }
        }

        System.out.println("Show the sum of all consumptions: ");
        Double sum = 0d;
        for (Double value : consumption){
            sum += value;
        }
        System.out.println(sum);

        System.out.println("Present the consumption mean for this dictionary: " + (sum/consumption.size()));

        System.out.println("Remove the models with a consumption equal to 15.6 km/l");

        popularCars.values().removeIf(aDouble -> aDouble.equals(15.6));

        System.out.println(popularCars);

        System.out.println("Show all cars in the insertion order. ");
        Map<String, Double> orderedPopularCars = new LinkedHashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(orderedPopularCars);

        System.out.println("Show the dict ordered by the model. ");
        Map<String, Double> orderedByKeyPopularCars = new TreeMap<>(orderedPopularCars);
        System.out.println(orderedByKeyPopularCars);

        System.out.println("Erase the car dictionary: ");
        popularCars.clear();
        System.out.println("Check if the dict is empty: " + popularCars.isEmpty());









    }
}
