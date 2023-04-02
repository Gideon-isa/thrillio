package com.semantics.thrillio.controller;

import com.semantics.thrillio.entities.Bookmark;
import com.semantics.thrillio.entities.User;
import com.semantics.thrillio.manger.BookmarkManager;

public class BookmarkController {
    private static BookmarkController instance = new BookmarkController();
    private BookmarkController(){}

    //SINGLETON PATTERN
    public static BookmarkController getInstance() {
        return instance;
    }

    public void saveUserBookmark(User user, Bookmark bookmark) {
        BookmarkManager.getInstance().saveUserBookmark(user, bookmark);
    }
}
