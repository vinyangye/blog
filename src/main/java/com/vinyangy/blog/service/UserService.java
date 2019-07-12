package com.vinyangy.blog.service;

import com.vinyangy.blog.po.User;

/**
 * Created by yeyang on 2019-05-11.
 */

public interface UserService {


    /**
     * Login authentication user.
     *
     * @param username the username
     * @param password the password
     * @return the user
     */
    User loginAuthentication(String username, String password);
}
