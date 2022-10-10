package br.com.collections.set.exercise2;

import java.util.Comparator;

public class ComparatorIDE implements Comparator<FavoriteLanguage> {
    @Override
    public int compare(FavoriteLanguage language1, FavoriteLanguage language2) {
        return language1.getIde().compareTo(language2.getIde());
    }
}
