package com.advantio.service;

import com.advantio.model.Blog;

import java.util.List;

/**
 * Created by Devv-Kiev-2 on 23.06.2017.
 */
public interface BlogService {

    Blog save(Blog blog);
    List<Blog> getAllBlogs();
    Blog getBlogById(Long id);
    Blog updateBlog(Blog blog);
}
