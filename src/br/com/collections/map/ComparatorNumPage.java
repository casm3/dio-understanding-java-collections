package br.com.collections.map;

import java.util.Comparator;
import java.util.Map;

public class ComparatorNumPage implements Comparator<Map.Entry<String, Book>> {
    @Override
    public int compare(Map.Entry<String, Book> o1, Map.Entry<String, Book> o2) {
        return Integer.compare(o1.getValue().getNumPages(), o2.getValue().getNumPages());
    }
}
