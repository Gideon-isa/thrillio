/**
 *
 */
package com.semantics.thrillio.entities;

public class Movie extends Bookmark{
    private int releaseYear;
    private String[] cast;
    private String[] directors;
    private String genre;
    private double imdbRating;

    public int getReleaseYear() {
        return releaseYear;
    }

    /**
     *
     * @param releaseYear
     */
    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    /**
     *
     * @return
     */
    public String[] getCast() {
        return cast;
    }

    /**
     *
     * @param cast
     */
    public void setCast(String[] cast) {
        this.cast = cast;
    }

    /**
     *
     * @return
     */
    public String[] getDirectors() {
        return directors;
    }

    /**
     *
     * @param directors
     */
    public void setDirectors(String[] directors) {
        this.directors = directors;
    }

    /**
     *
     * @return
     */
    public String getGenre() {
        return genre;
    }

    /**
     *
     * @param genre
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }

    /**
     *
     * @return
     */
    public double getImdbRating() {
        return imdbRating;
    }

    /**
     *
     * @param imdbRating
     */
    public void setImdbRating(double imdbRating) {
        this.imdbRating = imdbRating;
    }
}
