package com.rideo.app.oauth2.domain;

public interface UserRepository
{

    User findByGuid(String guid);

    void saveUser(User user);

    void updateUser(User user);

    User findByUsername(String username);

}