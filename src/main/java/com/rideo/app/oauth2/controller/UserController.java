package com.rideo.app.oauth2.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rideo.app.oauth2.domain.AppUserDetails;

@Controller
@RequestMapping("/user/")
public class UserController
{

    @RequestMapping(value = "info", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    String getUserInfo(HttpServletRequest request, HttpServletResponse response)
    {
        String contentType = "text/json;charset=UTF-8";
        response.setContentType(contentType);
        response.setCharacterEncoding("utf-8");

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication.getPrincipal() instanceof AppUserDetails)
        {
            AppUserDetails appUserDetails = (AppUserDetails) authentication.getPrincipal();
            // System.out.println("appUserDetails=" + appUserDetails);
            return JSONObject.fromObject(appUserDetails.getUser()).discard("password").toString();
        }

        return "{}";
    }

}
