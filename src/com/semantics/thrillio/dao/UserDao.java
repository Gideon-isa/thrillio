package com.semantics.thrillio.dao;

import com.semantics.thrillio.DataStore;
import com.semantics.thrillio.entities.User;

public class UserDao {
    public User[] getUser() {
        return DataStore.getUsers();
    }
}
