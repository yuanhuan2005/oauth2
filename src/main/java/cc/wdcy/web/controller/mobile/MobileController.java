package cc.wdcy.web.controller.mobile;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Shengzhao Li
 */
@Controller
@RequestMapping("/m/")
public class MobileController
{
    @RequestMapping("dashboard.htm")
    public String dashboard()
    {
        return "mobile/dashboard";
    }

}