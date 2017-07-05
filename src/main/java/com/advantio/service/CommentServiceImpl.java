package com.advantio.service;

import com.advantio.model.Comment;
import com.advantio.repository.CommentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Devv-Kiev-2 on 23.06.2017.
 */
@Service
public class CommentServiceImpl implements CommentService{

    @Autowired
    private CommentDao commentDao;

    @Override
    public Comment save(Comment comment) {
        return commentDao.create(comment);
    }

    @Override
    public List<Comment> getAllComments() {
        return commentDao.readAll(Comment.class);
    }

    @Override
    public Comment update(Comment comment) {
        return commentDao.update(comment);
    }

    @Override
    public Comment delete(Comment comment) {
        return commentDao.delete(comment);
    }
}
