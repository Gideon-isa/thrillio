/**
 *
 */
package com.semantics.thrillio.entities;

public class Bookmark {
    private long id;
    private String title;
    private String profileUrl;

    /**
     *
     * @return
     */
    public long getId() {
        return id;
    }

    /**
     *
     * @param id
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     *
     * @return
     */
    public String getTitle() {
        return title;
    }

    /**
     *
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     *
     * @return
     */
    public String getProfileUrl() {
        return profileUrl;
    }

    /**
     *
     * @param profileUrl
     */
    public void setProfileUrl(String profileUrl) {
        this.profileUrl = profileUrl;
    }
}
