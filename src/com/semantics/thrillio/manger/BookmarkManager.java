/**
 *
 */
package com.semantics.thrillio.manger;

import com.semantics.thrillio.entities.Book;
import com.semantics.thrillio.entities.Movie;
import com.semantics.thrillio.entities.WebLink;

public class BookmarkManager {
    private static BookmarkManager instance = new BookmarkManager();

    // constructor
    private BookmarkManager() {}

    /**
     * BookmarkManager
     * @return BookmarkManager
     */
    public static BookmarkManager getInstance() {
        return instance;
    }


    /**
     * createMovie
     * @param id int
     * @param title String
     * @param profileUrl String
     * @param releaseYear int
     * @param cast String[]
     * @param directors String[]
     * @param genre String
     * @param imdbRatings double
     * @return Movie
     */
    public Movie createMovie(long id, String title, String profileUrl, int releaseYear, String[] cast, String[] directors, String genre, double imdbRatings) {
        Movie movie = new Movie();
        movie.setId(id);
        movie.setTitle(title);
        movie.setProfileUrl(profileUrl);
        movie.setReleaseYear(releaseYear);
        movie.setCast(cast);
        movie.setDirectors(directors);
        movie.setGenre(genre);
        movie.setImdbRating(imdbRatings);

        return movie;

    }

    /**
     *
     * @param id
     * @param title
     * @param publicationYear
     * @param publisher
     * @param authors
     * @param genre
     * @param amazonRatings
     * @return
     */
    public Book createBook(long id, String title, int publicationYear, String publisher, String[] authors, String genre, double amazonRatings) {
        Book book = new Book();

        book.setId(id);
        book.setTitle(title);
        book.setPublicationYear(publicationYear);
        book.setPublisher(publisher);
        book.setAuthors(authors);
        book.setGenre(genre);
        book.setAmazonRatings(amazonRatings);

        return book;
    }

    /**
     *
     * @param id
     * @param title
     * @param url
     * @param host
     * @return
     */
    public WebLink createWebLink(long id, String title, String url, String host) {
        WebLink webLink = new WebLink();
        webLink.setId(id);
        webLink.setTitle(title);
        webLink.setUrl(url);
        webLink.setHost(host);

        return webLink;
    }
}
