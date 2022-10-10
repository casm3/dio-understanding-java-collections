/**
 * Author: Carlos Melo
 */

package br.com.collections.set.exercise2;

//TODO
// - Create a class FavoriteLanguage that has the attributes name, creationYear, ide. Later, create a Set with 3
// languages and make a program that orders this set by:
// - A. Insertion Order;
// - B. Natural Order (Name);
// - C. IDE;
// - D. Creation year and Name;
// - E. Name, creation year and IDE.


import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Exercise2 {
    public static void main(String[] args) {
        // Create a class FavoriteLanguage that has the attributes name, creationYear, ide.
        // Later, create a Set with 3 languages and make a program that orders this set by:
        LinkedHashSet<FavoriteLanguage> favoriteLanguages = new LinkedHashSet<>(){{
           add(new FavoriteLanguage("C", 1969, "Eclipse"));
           add(new FavoriteLanguage("C++", 1979, "DevCPP"));
           add(new FavoriteLanguage("Java", 1991, "Intellij"));
        }};

        // - A. Insertion Order;
        System.out.println(favoriteLanguages);

        // - B. Natural Order (Name);
        TreeSet<FavoriteLanguage> treeSetFavoriteLanguages = new TreeSet<>(favoriteLanguages);
        printOrder(treeSetFavoriteLanguages);

        // C. IDE;
        TreeSet<FavoriteLanguage> myTreeFavoriteLanguageWithIdeComparator = new TreeSet<>(new ComparatorIDE());
        myTreeFavoriteLanguageWithIdeComparator.addAll(treeSetFavoriteLanguages);
        printOrder(myTreeFavoriteLanguageWithIdeComparator);

        // D. Creation year and Name;
        TreeSet<FavoriteLanguage> myTreeFavoriteLanguageWithYearNameComparator = new TreeSet<>(new ComparatorYearName());
        myTreeFavoriteLanguageWithYearNameComparator.addAll(treeSetFavoriteLanguages);
        printOrder(myTreeFavoriteLanguageWithYearNameComparator);

        // D. Creation year and Name;
        TreeSet<FavoriteLanguage> myTreeFavoriteLanguageFullComparator = new TreeSet<>(new ComparatorNameYearIde());
        myTreeFavoriteLanguageFullComparator.addAll(treeSetFavoriteLanguages);
        printOrder(myTreeFavoriteLanguageFullComparator);


    }

    protected static void printOrder(TreeSet<FavoriteLanguage> languages){
        for (FavoriteLanguage language : languages) {
            System.out.println(language.getName() + " - " + language.getCreationYear() + " - " + language.getIde());
        }
    }
}
