package br.com.collections.set.examples;

import java.util.*;

public class OrderSetExample {
    public static void main(String[] args) {

        Set<Serie> mySeries = new HashSet<>(){{
            add(new Serie("Game of Thrones", "Phantasy", 60));
            add(new Serie("Dark", "Drama", 60));
            add(new Serie("That 70's Show", "Comedy", 25));
        }};
        System.out.println(mySeries);

        System.out.println("--\tRandom Order\t---");
        printOrder(mySeries);

        System.out.println("--\tInsertion Order\t---");
        Set<Serie> myLinkedSeries = new LinkedHashSet<>(){{
            add(new Serie("Game of Thrones", "Phantasy", 60));
            add(new Serie("Dark", "Drama", 60));
            add(new Serie("That 70's Show", "Comedy", 25));
        }};
        printOrder(myLinkedSeries);

        System.out.println("--\tInsertion Order\t---");
        Set<Serie> myTreeSeries = new TreeSet<>(myLinkedSeries);
        printOrder(myTreeSeries);

        System.out.println("--\tName, Genre and Time Order\t--");
        Set<Serie> myTreeSeriesWithComparator = new TreeSet<>(new ComparatorNameGenreEpisodeTime());
        myTreeSeriesWithComparator.addAll(myTreeSeries);
        printOrder(myTreeSeriesWithComparator);

    }

    protected static void printOrder(Set<Serie> series){
        for (Serie serie : series) {
            System.out.println(serie.getName() + " - " + serie.getGenre() + " - " + serie.getEpisodeTime());
        }
    }
}

