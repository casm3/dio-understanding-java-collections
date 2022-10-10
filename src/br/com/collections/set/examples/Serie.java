package br.com.collections.set.examples;

import java.util.Objects;

class Serie implements Comparable<Serie> {
    private final String name;
    private final String genre;
    private final int episodeTime;

    public Serie(String name, String genre, int episodeTime) {
        this.name = name;
        this.genre = genre;
        this.episodeTime = episodeTime;
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public int getEpisodeTime() {
        return episodeTime;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", genre='" + genre + '\'' +
                ", episodeTime=" + episodeTime +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Serie serie)) return false;
        return episodeTime == serie.episodeTime && Objects.equals(name, serie.name) && Objects.equals(genre, serie.genre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, genre, episodeTime);
    }

    @Override
    public int compareTo(Serie serie) {
        int genre = this.getGenre().compareTo(serie.getGenre());
        int episodeTime = Integer.compare(this.getEpisodeTime(), serie.getEpisodeTime());
        return episodeTime != 0 ? episodeTime : genre;
    }
}
