package br.com.collections.map;

import java.util.Objects;

class Book {
    private String name;
    private Integer numPages;

    @Override
    public String toString() {
        return name + " - " + numPages;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return Objects.equals(name, book.name) && Objects.equals(numPages, book.numPages);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, numPages);
    }

    public String getName() {
        return name;
    }

    public Integer getNumPages() {
        return numPages;
    }

    public Book(String name, Integer numPages) {
        this.name = name;
        this.numPages = numPages;
    }
}
