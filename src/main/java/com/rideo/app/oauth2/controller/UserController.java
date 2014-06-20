package com.rideo.app.oauth2.controller;

import net.sf.json.JSONObject;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rideo.app.oauth2.domain.AppUserDetails;

@Controller
@RequestMapping("/user/")
public class UserController
{

    @RequestMapping(value = "info", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    String getUserInfo()
    {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication.getPrincipal() instanceof AppUserDetails)
        {
            AppUserDetails appUserDetails = (AppUserDetails) authentication.getPrincipal();
            return JSONObject.fromObject(appUserDetails.getUser()).discard("username")
                    .discard("password").toString();
        }

        return "{}";
    }

    @RequestMapping(value = "login", method = RequestMethod.POST, produces = "application/json")
    public @ResponseBody
    String login(@RequestParam(required = false) String phoneNumber,
            @RequestParam(required = false) String email,
            @RequestParam(required = true) String password,
            @RequestParam(required = true) String userType)
    {
        System.out.println("phoneNumber=" + phoneNumber);
        System.out.println("email=" + email);
        System.out.println("password=" + password);
        System.out.println("userType=" + userType);
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication.getPrincipal() instanceof AppUserDetails)
        {
            AppUserDetails appUserDetails = (AppUserDetails) authentication.getPrincipal();
            return JSONObject.fromObject(appUserDetails.getUser()).discard("username")
                    .discard("password").toString();
        }

        return "{}";
    }

}
