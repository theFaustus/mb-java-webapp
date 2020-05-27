package com.evil.inc.mb.service.impl;

import com.evil.inc.mb.model.User;
import com.evil.inc.mb.repository.UserRepository;
import com.evil.inc.mb.service.UserService;

public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User findById(String id) {
        return userRepository.findById(id);
    }
}
