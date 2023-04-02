/**
 *
 */
package com.semantics.thrillio.manger;

import com.semantics.thrillio.dao.UserDao;
import com.semantics.thrillio.entities.User;

public class UserManager {
    // instance of the class
    private static UserManager instance =  new UserManager();

    // instance of the class UserDao
    private static UserDao dao = new UserDao();

    // IMPLEMENTING THE SINGLETON PATTERN

    // using the private constructor to prevent instantiation of this class
    private UserManager() {}

    // making it static method to access it without instantiation of the class
    /**
     * UserManager provides the global point for accessing the UserManger class
     * @return UserManager
     */
    public static UserManager getInstance() {
        return instance;
    }

    /**
     * createUser
     * @param id
     * @param email
     * @param password
     * @param firstName
     * @param lastName
     * @param gender
     * @param userType
     * @return user
     */
    public User createUser(long id, String email, String password, String firstName, String lastName, int gender, String userType) {
        User user = new User();
        user.setId(id);
        user.setEmail(email);
        user.setPassword(password);
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setGender(gender);
        user.setUsertype(userType);

        return user;

    }

    /**
     *
     * @return User[]
     */
    public User[] getUsers() {
        return dao.getUser();
    }

}
