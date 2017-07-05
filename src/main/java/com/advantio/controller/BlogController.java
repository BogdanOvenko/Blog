package com.advantio.controller;

import com.advantio.model.Blog;
import com.advantio.model.Comment;
import com.advantio.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Devv-Kiev-2 on 23.06.2017.
 */
@RestController(value = "/API/POSTS/")
public class BlogController {

    @Autowired
    public BlogService blogService;

    @RequestMapping(value="/{id}", method = RequestMethod.GET)
    public @ResponseBody Blog getSingleBlogEntry(@PathVariable Long id) {
        Blog existingBlog = blogService.getBlogById(id);
        return existingBlog;

    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public @ResponseBody List<Blog> getAllBlogEntries(){
        List<Blog> blogList = blogService.getAllBlogs();
        return blogList;
    }

    @RequestMapping(value = "/API/POSTS/{text}", method = RequestMethod.POST)
    public @ResponseBody Blog addBlog(@PathVariable String text, @PathVariable String email){
        Blog newBlog = new Blog();
        newBlog.setText(text);
        newBlog.setEmail(email);
        return blogService.save(newBlog);
    }

    @RequestMapping(value = "")
    public @ResponseBody Blog updateBlog(){
        return null;
    }

    @RequestMapping
    public @ResponseBody Comment saveComment(){
        return null;
    }

    @RequestMapping
    public @ResponseBody List<Comment> getAllComments(){
        return null;
    }

}
