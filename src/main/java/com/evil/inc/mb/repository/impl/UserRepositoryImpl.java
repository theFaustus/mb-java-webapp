package com.evil.inc.mb.repository.impl;

import com.evil.inc.mb.model.User;
import com.evil.inc.mb.repository.UserRepository;

public class UserRepositoryImpl implements UserRepository {
    public User findById(String userId) {
        return new User(userId, "John");
    }
}
