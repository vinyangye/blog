package com.vinyangy.blog.service;


import com.vinyangy.blog.dao.UserRepository;
import com.vinyangy.blog.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by yeyang on 2019-05-11.
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User loginAuthentication(String username, String password) {

        User user = userRepository.findByUserNameAndPassword(username, password);
        return user;
    }
}
