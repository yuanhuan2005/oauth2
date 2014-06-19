package cc.wdcy.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cc.wdcy.service.UserService;

/**
 * @author Shengzhao Li
 */
@Controller
@RequestMapping("/user/")
public class UserController
{

    @Autowired
    private UserService userService;

    @RequestMapping(value = "overview.htm", method = RequestMethod.GET, produces = "application/html")
    public String overview(Model model)
    {

        return "user_overview";
    }

}