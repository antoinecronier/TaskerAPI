package com.tactfactory.tasker.configurations.security.service;

import com.tactfactory.tasker.configurations.security.models.SecurityUser;

public interface UserService {
    void save(SecurityUser user);

    SecurityUser findByLogin(String login);
}
