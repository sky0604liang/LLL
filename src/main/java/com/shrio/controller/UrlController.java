package com.shrio.controller;

import org.hibernate.validator.constraints.SafeHtml;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 公共跳转
 */
@Controller
public class UrlController {

    @GetMapping("/{url}")
    public  String Login( @PathVariable String url){
        System.out.println("=================="+url);
        return "admin/"+url;
    }
}
