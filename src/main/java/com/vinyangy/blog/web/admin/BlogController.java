package com.vinyangy.blog.web.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author yeyang
 * @Date 2019-07-12
 */
@Controller
@RequestMapping("/admin")
public class BlogController {

    @GetMapping("/manage")
    public String list() {
        return "admin/manage";
    }
}
