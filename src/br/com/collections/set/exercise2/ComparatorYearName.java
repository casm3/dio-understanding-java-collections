package br.com.collections.set.exercise2;

import java.util.Comparator;

public class ComparatorYearName implements Comparator<FavoriteLanguage> {
    @Override
    public int compare(FavoriteLanguage language1, FavoriteLanguage language2) {
        int creationYear = Integer.compare(language1.getCreationYear(), language2.getCreationYear());
        int name = language1.getName().compareTo(language2.getName());
        return (creationYear != 0) ? creationYear : name;
    }
}
