package com.vinyangy.blog.web;

import com.vinyangy.blog.NotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/")
    public String index() {

//        int i = 9/0;
        String blog = null;
        if (blog == null) {
            throw new NotFoundException("Blog Not Found");
        }
        return "index";
    }
}
