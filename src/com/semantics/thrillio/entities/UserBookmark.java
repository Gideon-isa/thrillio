/**
 *
 */
package com.semantics.thrillio.entities;

public class UserBookmark {
    private User user;
    private Bookmark bookmark;

    /**
     *
     * @return
     */
    public User getUser() {
        return user;
    }

    /**
     *
     * @param user
     */
    public void setUser(User user) {
        this.user = user;
    }

    /**
     *
     * @return
     */
    public Bookmark getBookmark() {
        return bookmark;
    }

    /**
     *
     * @param bookmark
     */
    public void setBookmark(Bookmark bookmark) {
        this.bookmark = bookmark;
    }
}
