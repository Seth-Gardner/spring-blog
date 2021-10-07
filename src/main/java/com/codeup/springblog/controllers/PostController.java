
package com.codeup.springblog.controllers;

import com.codeup.springblog.models.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PostController {

    @GetMapping("/posts")
    public String showPosts(Model model) {
        Post post1 = new Post("I am a title", "I am a description");
        Post post2 = new Post("I dislike cats", "well i dislike dogs");
        List<Post> allPosts = new ArrayList<Post>();
        allPosts.add(post1);
        allPosts.add(post2);
        // hi


        model.addAttribute("posts", allPosts);
        return "posts/index";
    }

    @GetMapping("/posts/{id}")
    public String showOnePost(@PathVariable long id, Model model) {
        Post post = new Post("title", "description");
        model.addAttribute("postId", id);
        model.addAttribute("post", post);
        return "posts/show";
    }

    @GetMapping("/posts/create")
    public String createPage(){
        return "posts/index";
    }

    @PostMapping("/posts/create")
    public String createPost(){
        return "posts/index";
    }

}
