package br.com.collections.map;

import java.util.Comparator;
import java.util.Map;

public class ComparatorName implements Comparator<Map.Entry<String, Book>> {
    @Override
    public int compare(Map.Entry<String, Book> o1, Map.Entry<String, Book> o2) {
        return o1.getValue().getName().compareToIgnoreCase(o2.getValue().getName());
    }
}
