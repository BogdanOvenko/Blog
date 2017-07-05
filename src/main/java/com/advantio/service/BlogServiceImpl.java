package com.advantio.service;

import com.advantio.model.Blog;
import com.advantio.repository.BlogDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Devv-Kiev-2 on 23.06.2017.
 */
@Service
public class BlogServiceImpl implements BlogService{

    @Autowired
    private final BlogDao blogDao;

    public BlogServiceImpl(BlogDao blogDao){
        this.blogDao = blogDao;
    }

    @Override
    public Blog save(Blog blog) {
       return blogDao.create(blog);
    }

    @Override
    public List<Blog> getAllBlogs() {
        return blogDao.readAll(Blog.class);
    }

    @Override
    public Blog getBlogById(Long id) {
        return blogDao.read(Blog.class, id);
    }

    @Override
    public Blog updateBlog(Blog blog) {
        return blogDao.update(blog);
    }
}
