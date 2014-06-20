package com.rideo.app.oauth2.web.controller.unity;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
        return "unity/dashboard";
    }

}