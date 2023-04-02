package com.semantics.thrillio;

import com.semantics.thrillio.entities.Bookmark;
import com.semantics.thrillio.entities.User;
import com.semantics.thrillio.manger.BookmarkManager;
import com.semantics.thrillio.manger.UserManager;

public class Launch {

    private static User[] users;
    private static Bookmark[][] bookmarks;

    /**
     * loadData loads the data
     */
    public static void loadData() {
        System.out.println("1. Loading data ...");
        DataStore.loadData();

        // fetch the data from the datastore
        users = UserManager.getInstance().getUsers();
        bookmarks = BookmarkManager.getInstance().getBookmarks();

        System.out.println("Printing data ...");
        printUserData();
        printBookmarkData();



    }

    /**
     *
     */
    private static void printBookmarkData() {
        for (Bookmark[] bookmarkList : bookmarks) {
            for (Bookmark bookmark : bookmarkList) {
                System.out.println(bookmark);
            }
        }
    }

    /**
     *
     */
    private static void printUserData() {
        for (User user : users) {
            System.out.println(user);
        }
    }

    private static void startBookmarking() {
        System.out.println("\n2. Bookmarking ...");
        for(User user: users) {
            View.bookmark(user, bookmarks);
        }
    }

    public static void main(String[] args) {
        loadData();
        startBookmarking();
    }
}
