/**
 * Author: Carlos Melo
 */

package br.com.collections.map;

//TODO
// - Given the estimated population for some Brazilian NE states, do:
// - State = PE - Population = 9.616.621
// - State = AL - Population = 3.351.543
// - State = CE - Population = 9.187.103
// - State = RN - Population = 3.534.265
// - Create a Dictionary that relates each state with its population;
// - Change the population of the RN State for 3.534.165;
// - Check if the PB state is in the dictionary, and add PB - 4.039.277 if it isn't;
// - Present the PE population;
// - Show all states and their population in the insertion order;
// - Show all states and their population in the alphabetical order;
// - Show the state with min population and the amount;
// - Show the state with max population and the amount;
// - Show the sum of all populations;
// - Remove all states with population smaller than 4.000.000;
// - Clear the dict;
// - Check if the dict is empty.

import java.util.*;

public class Exercise1 {
    public static void main(String[] args) {
        Map<String, Integer> states = new HashMap<>(){{
            put("PE", 9_616_621);
            put("AL", 3_351_543);
            put("CE", 9_187_103);
            put("RN", 3_534_265);
        }};

        // Change the population of the RN State for 3.534.165;
        states.put("RN", 3_534_165);

        // Check if the PB state is in the dictionary, and add PB – 4.039.277 if it isn't;
        if (!states.containsKey("PB")){
            states.put("PB", 4_039_277);
        }

        // — Present the PE population;
        System.out.println("PE - Population: " + states.get("PE"));


        // — Show all states, and their population in the insertion order;
        Map<String, Integer> linkedStates = new LinkedHashMap<>(){{
            put("PE", 9_616_621);
            put("AL", 3_351_543);
            put("CE", 9_187_103);
            put("RN", 3_534_265);
        }};
        System.out.println(linkedStates);

        // - Show all states, and their population in the alphabetical order;
        Map<String, Integer> treeMapStates = new TreeMap<>(linkedStates);
        System.out.println(treeMapStates);

        // — Show the state with min population and the amount;
        Collection<Integer> population = states.values();
        Integer minPopulation = Collections.min(population);
        Integer maxPopulation = Collections.max(population);
        String stateWithMinPopulation = "";
        String stateWithMaxPopulation = "";

        Set<Map.Entry<String, Integer>> entries = states.entrySet();
        for (Map.Entry<String, Integer> state : entries) {
            if (state.getValue().equals(minPopulation)) {
                stateWithMinPopulation = state.getKey();
                System.out.println("State: "
                        + stateWithMinPopulation
                        + " - Population: "
                        + minPopulation
                );
            }
            if (state.getValue().equals(maxPopulation)) {
                    stateWithMaxPopulation = state.getKey();
                    System.out.println("State: "
                        + stateWithMaxPopulation
                        + " - Population: "
                        + maxPopulation
                );
                }
        }
        // — Remove all states with population smaller than 4_000_000;
        states.values().removeIf(aDouble -> aDouble.equals(4_000_000));

        // — Show the sum of all populations;
        int sum = 0;
        for (int value : population){
            sum += value;
        }
        System.out.println(sum);

        // — Clear the dict;—
        // Check if the dict is empty.
        states.clear();
        System.out.println(states.isEmpty());
    }
}
