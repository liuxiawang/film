package com.zeqing.comment.services;


import com.zeqing.comment.dto.Comment;

import java.util.List;

public interface ICommentService {

    List<Comment> queryCommentsByMovieId(Long movieId);

    int deleteCommentsById(Long id);

    int insertComment(Comment comment);

    int updateCommentLikeCountAddById(Long id);

    int updateCommentById(Comment comment);

}
