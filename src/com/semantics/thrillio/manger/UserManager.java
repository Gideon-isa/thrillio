/**
 *
 */
package com.semantics.thrillio.manger;

import com.semantics.thrillio.entities.User;

public class UserManager {
    private static UserManager instance =  new UserManager();

    // Implementing the Singleton Pattern
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

}
