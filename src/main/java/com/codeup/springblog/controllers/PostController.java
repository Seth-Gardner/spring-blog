package com.codeup.springblog.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

public class PostController {

    @GetMapping("/posts")
    public String postsIndex(){
        return "index";
    }

    @GetMapping("/posts/{id}")
    public String postsId(@PathVariable String id){
        return "index" + id;
    }

    @GetMapping("/posts/create")
    public String createPage(){
        return "create";
    }

    @PostMapping("/posts/create")
    public String createPost(){
        return "create";
    }

}
