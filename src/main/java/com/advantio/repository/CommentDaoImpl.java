package com.advantio.repository;

import com.advantio.model.Comment;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

/**
 * Created by Devv-Kiev-2 on 23.06.2017.
 */
@Repository
@Transactional
public class CommentDaoImpl extends  AbstractDao<Comment> implements CommentDao {
}
