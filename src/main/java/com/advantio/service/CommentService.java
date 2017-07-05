package com.advantio.service;

import com.advantio.model.Comment;

import java.util.List;

/**
 * Created by Devv-Kiev-2 on 23.06.2017.
 */
public interface CommentService {

    Comment save(Comment comment);
    List<Comment> getAllComments();
    Comment update(Comment comment);
    Comment delete(Comment comment);
}
