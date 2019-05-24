package com.zeqing.comment.services.impl;

import com.zeqing.comment.dto.Comment;
import com.zeqing.comment.mappers.CommentMapper;
import com.zeqing.comment.services.ICommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class CommentServiceImpl implements ICommentService {

    @Autowired
    private CommentMapper commentMapper;

    @Override
    public List<Comment> queryCommentsByMovieId(Long movieId) {
        return commentMapper.queryCommentsByMovieId(movieId);
    }

    @Override
    public int deleteCommentsById(Long id) {
        commentMapper.deleteCommentsById(id);
        return 0;
    }

    @Override
    public int insertComment(Comment comment) {
        comment.setData(new Date());
        commentMapper.insertComment(comment);
        return 0;
    }

    @Override
    public int updateCommentLikeCountAddById(Long id) {
        commentMapper.updateCommentLikeCountAddById(id);
        return 0;
    }

    @Override
    public int updateCommentById(Comment comment) {
        commentMapper.updateCommentById(comment);
        return 0;
    }
}
