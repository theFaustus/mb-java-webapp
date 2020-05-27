package com.evil.inc.mb.repository;

import com.evil.inc.mb.model.User;

public interface UserRepository {
    User findById(String userId);
}
