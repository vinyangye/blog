package com.vinyangy.blog.dao;

import com.vinyangy.blog.po.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by yeyang on 2019-05-11.
 */
public interface UserRepository extends JpaRepository<User,Long> {


    /**
     * Find by user name and password user.
     *
     * @param username the username
     * @param password the password
     * @return the user
     */
    User findByUserNameAndPassword(String username, String password);

}
