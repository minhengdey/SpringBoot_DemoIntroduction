package org.example.springboot_be;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class controller {
    @RequestMapping("/index")
    public String index(Model model) {
        user us = new user("Do Ly Minh Anh", 20, "dlminhanh272@gmail.com", "Nu", "0918927204");
        model.addAttribute("user", us);
        return "index";
    }
}
