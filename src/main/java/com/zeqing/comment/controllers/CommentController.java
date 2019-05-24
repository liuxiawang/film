package com.zeqing.comment.controllers;

import com.zeqing.comment.dto.Comment;
import com.zeqing.comment.services.ICommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// 查询电影的评论信息
// 根据评论信息Id删除评论
// 新增一条评论信息
// 评论点赞数+1
// 修改评论的评分与评价内容

@RestController
@RequestMapping(value = "/v1/comment")
public class CommentController {

    @Autowired
    private ICommentService commentService;

    @RequestMapping(value = "/query", method = RequestMethod.GET)
    public List<Comment> queryCommentsByMovieId(@RequestParam("movieId") Long movieId) {
        return commentService.queryCommentsByMovieId(movieId);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public boolean deleteCommentsById(@RequestParam("id") Long id) {
        commentService.deleteCommentsById(id);
        return true;
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public boolean insertComment(@RequestBody Comment comment) {
        commentService.insertComment(comment);
        return true;
    }

    @RequestMapping(value = "/addLikeCount", method = RequestMethod.GET)
    public boolean updateCommentLikeCountAddById(@RequestParam("id") Long id) {
        commentService.updateCommentLikeCountAddById(id);
        return true;
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public boolean updateCommentById(@RequestBody Comment comment) {
        commentService.updateCommentById(comment);
        return true;
    }
}
