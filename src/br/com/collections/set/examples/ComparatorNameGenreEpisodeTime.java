package br.com.collections.set.examples;

import br.com.collections.set.examples.Serie;

import java.util.Comparator;

public class ComparatorNameGenreEpisodeTime implements Comparator<Serie> {

    @Override
    public int compare(Serie serie1, Serie serie2) {
        int name = serie1.getName().compareTo(serie2.getName());
        int episodeTime = Integer.compare(serie1.getEpisodeTime(), serie2.getEpisodeTime());
        int genre = serie1.getGenre().compareTo(serie2.getGenre());

        return (name != 0) ? name : (genre != 0) ? genre : episodeTime;
    }
}
