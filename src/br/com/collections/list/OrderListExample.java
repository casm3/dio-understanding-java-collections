package br.com.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Author: Carlos Melo
 */

public class OrderListExample {
    public static void main(String[] args) {
        List<Cat> myCats = new ArrayList<>() {{
            add(new Cat("Bardo", 6, "Black"));
            add(new Cat("Pandora", 7, "White"));
            add(new Cat("Gordo", 6, "Tiger"));
        }};

        System.out.println("--\tInsertion Order\t---");
        System.out.println(myCats);

        System.out.println("--\tRandom Order\t---");
        Collections.shuffle(myCats);
        System.out.println(myCats);

        System.out.println("--\tNatural Order(Name)\t---");
        Collections.sort(myCats);
        System.out.println(myCats);

        System.out.println("--\tAge Order\t---");
        myCats.sort(new ComparatorAge());
        System.out.println(myCats);

        System.out.println("--\tColor Order\t---");
        myCats.sort(new ComparatorColor());
        System.out.println(myCats);

        System.out.println("--\tName, Color and Age Order\t---");
        myCats.sort(new ComparatorNameColorAge());
        System.out.println(myCats);
    }
}

class Cat implements Comparable<Cat> {
    private final String name;
    private final Integer age;
    private final String color;

    public Cat(String name, Integer age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }
    public Integer getAge() {
        return age;
    }
    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "br.com.collections.list.Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public int compareTo(Cat cat) {
        return this.getName().compareToIgnoreCase(cat.getName());
    }
}

class ComparatorAge implements Comparator<Cat> {
    @Override
    public int compare(Cat cat1, Cat cat2) {
        return Integer.compare(cat1.getAge(), cat2.getAge());
    }
}

class ComparatorColor implements Comparator<Cat> {
    @Override
    public int compare(Cat cat1, Cat cat2) {
        return cat1.getColor().compareToIgnoreCase(cat2.getColor());
    }
}

class ComparatorNameColorAge implements Comparator<Cat> {
    @Override
    public int compare(Cat cat1, Cat cat2) {
        int name = cat1.getName().compareToIgnoreCase(cat2.getName());
        int color = cat1.getColor().compareToIgnoreCase(cat2.getColor());
        if (name != 0) return name;
        if (color != 0) return color;
        return Integer.compare(cat1.getAge(), cat2.getAge());
    }
}
