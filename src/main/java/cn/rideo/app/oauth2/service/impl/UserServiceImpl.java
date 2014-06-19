package cn.rideo.app.oauth2.service.impl;

import cn.rideo.app.oauth2.domain.shared.security.AppUserDetails;
import cn.rideo.app.oauth2.domain.user.User;
import cn.rideo.app.oauth2.domain.user.UserRepository;
import cn.rideo.app.oauth2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * @author Shengzhao Li
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException("Not found any user for username[" + username + "]");
        }

        return new AppUserDetails(user);
    }
}