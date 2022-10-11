package br.com.collections.map;

import java.util.*;

public class OrderMapExample {
    public static void main(String[] args) {
        System.out.println("--\tRandom Orders--\t");
        Map<String, Book> myBooks = new HashMap<>(){{
            put("Hawking, Stephen", new Book("A brief story of time", 256));
            put("Duhigg, Charles", new Book("The power of habit", 408));
            put("Harari, Yuval Noah", new Book("21 Lessons to 21 Century", 432));
        }};
        for (Map.Entry<String, Book> book :
        myBooks.entrySet()) {
            System.out.println(book.getKey() + " - " + book.getValue());
        }

        System.out.println("--\tInsertion Order--\t");
        Map<String, Book> myOrderedBooks = new LinkedHashMap<>(){{
            put("Hawking, Stephen", new Book("A brief story of time", 256));
            put("Duhigg, Charles", new Book("The power of habit", 408));
            put("Harari, Yuval Noah", new Book("21 Lessons to 21 Century", 432));
        }};
        for (Map.Entry<String, Book> book :
                myOrderedBooks.entrySet()) {
            System.out.println(book.getKey() + " - " + book.getValue());
        }

        System.out.println("--\tAlphabetical Order (Author)--\t");
        Map<String, Book> myOrderedBooksByAuthor = new TreeMap<>(myOrderedBooks);
        for (Map.Entry<String, Book> book :
                myOrderedBooksByAuthor.entrySet()) {
            System.out.println(book.getKey() + " - " + book.getValue());
        }

        System.out.println("--\tAlphabetical Order (Book Name)--\t");
        Set<Map.Entry<String, Book>> mySetBooks = new TreeSet<>(new ComparatorName());
        mySetBooks.addAll(myBooks.entrySet());
        for (Map.Entry<String, Book> book :
                mySetBooks) {
            System.out.println(book.getKey() + " - " + book.getValue());
        }

        System.out.println("--\tOrder by Page Number--\t");
        Set<Map.Entry<String, Book>> myOrderedSetByNumPages = new TreeSet<>(new ComparatorNumPage());
        myOrderedSetByNumPages.addAll(myBooks.entrySet());
        for (Map.Entry<String, Book> book :
                myOrderedSetByNumPages) {
            System.out.println(book.getKey() + " - " + book.getValue());
        }


    }
}


