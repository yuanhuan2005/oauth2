package com.rideo.app.oauth2.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.rideo.app.oauth2.domain.AppUserDetails;
import com.rideo.app.oauth2.domain.User;
import com.rideo.app.oauth2.domain.UserRepository;
import com.rideo.app.oauth2.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService
{

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException
    {
        User user = userRepository.findByUsername(username);
        if (user == null)
        {
            throw new UsernameNotFoundException("Not found any user for username[" + username + "]");
        }

        return new AppUserDetails(user);
    }
}