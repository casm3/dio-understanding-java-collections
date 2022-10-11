/**
 * Author: Carlos Melo
 */

package br.com.collections.map;

//TODO
// - Make a program that simulates the launch of a Die;
// - Launch the die 100 times and store it;
// - Show how many times each value was inserted.


import java.util.HashMap;
import java.util.Map;

public class Challenge {
    public static void main(String[] args) {
        Die die = new Die(6);

        Map<Integer, Integer> dieRolls = new HashMap<>();
        for (int i = 0; i < 1000; i++){
            int roll = die.rollDice();
            if (dieRolls.containsKey(roll)) {
                dieRolls.put(roll, dieRolls.get(roll) + 1);
            } else {
                dieRolls.put(roll, 1);
            }
        }
        System.out.println(dieRolls);
    }
}
