/**
 *
 */
package com.semantics.thrillio.entities;

import java.util.Arrays;

public class Book extends Bookmark{
    private int publicationYear;
    private String publisher;
    private String[] authors;
    private String genre;
    private double amazonRatings;

    /**
     *
     * @return
     */
    public int getPublicationYear() {
        return publicationYear;
    }

    /**
     *
     * @param publicationYear
     */
    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    /**
     *
     * @return
     */
    public String getPublisher() {
        return publisher;
    }

    /**
     *
     * @param publisher
     */
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    /**
     *
     * @return
     */
    public String[] getAuthors() {
        return authors;
    }

    /**
     *
     * @param authors
     */
    public void setAuthors(String[] authors) {
        this.authors = authors;
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
    public double getAmazonRatings() {
        return amazonRatings;
    }

    /**
     *
     * @param amazonRatings
     */
    public void setAmazonRatings(double amazonRatings) {
        this.amazonRatings = amazonRatings;
    }

    @Override
    public String toString() {
        return "Book{" +
                "publicationYear=" + publicationYear +
                ", publisher='" + publisher + '\'' +
                ", authors=" + Arrays.toString(authors) +
                ", genre='" + genre + '\'' +
                ", amazonRatings=" + amazonRatings +
                '}';
    }
}
