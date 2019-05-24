package com.zeqing.comment.mappers;

import com.zeqing.comment.dto.Comment;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CommentMapper {

    List<Comment> queryCommentsByMovieId(@Param("movieId") Long movieId);

    int deleteCommentsById(@Param("id") Long id);

    int insertComment(@Param("comment") Comment comment);

    int updateCommentLikeCountAddById(@Param("id") Long id);

    int updateCommentById(@Param("comment") Comment comment);

}
