package br.com.collections.set.exercise2;


import java.util.Objects;

public class FavoriteLanguage implements Comparable<FavoriteLanguage> {
    private final String name;
    private final int creationYear;
    private final String ide;

    public FavoriteLanguage(String name, int creationYear, String ide) {
        this.name = name;
        this.creationYear = creationYear;
        this.ide = ide;
    }

    @Override
    public String toString() {
        return "FavoriteLanguage{" +
                "name='" + name + '\'' +
                ", creationYear=" + creationYear +
                ", ide='" + ide + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FavoriteLanguage)) return false;
        FavoriteLanguage that = (FavoriteLanguage) o;
        return creationYear == that.creationYear && Objects.equals(name, that.name) && Objects.equals(ide, that.ide);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, creationYear, ide);
    }

    public String getName() {
        return name;
    }

    public int getCreationYear() {
        return creationYear;
    }

    public String getIde() {
        return ide;
    }

    @Override
    public int compareTo(FavoriteLanguage language) {
        return this.getName().compareTo(language.getName());
    }
}
