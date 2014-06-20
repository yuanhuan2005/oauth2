package com.rideo.app.oauth2.web.controller.unity;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rideo.app.oauth2.domain.AppUserDetails;

/**
 * @author Shengzhao Li
 */
@Controller
@RequestMapping("/unity/")
public class UnityController
{

    @RequestMapping("dashboard.htm")
    public String dashboard()
    {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        System.out.println("getName=" + authentication.getName());

        if (authentication.getPrincipal() instanceof AppUserDetails)
        {
            AppUserDetails appUserDetails = (AppUserDetails) authentication.getPrincipal();
            System.out.println("appUserDetails=" + appUserDetails);
        }
        return "unity/dashboard";
    }

}
