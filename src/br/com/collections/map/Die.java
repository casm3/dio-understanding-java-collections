/**
 * Author: Carlos Melo
 */

package br.com.collections.map;

public class Die {
    private int sides;

    public Die(int sides) {
        this.sides = sides;
    }

    public int rollDice() {
        return 1 + (int) (Math.random() * sides);
    }

    public int getSides() {
        return sides;
    }
}
