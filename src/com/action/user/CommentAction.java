package com.action.user;

import com.model.Comment;
import com.model.Hotel;
import com.model.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.service.CommentService;

import java.util.Date;
import java.util.Map;

/**
 * Created by stiles on 16/1/2.
 */
public class CommentAction extends ActionSupport {
    CommentService commentService;

    public void setCommentService(CommentService commentService) {
        this.commentService = commentService;
    }

    String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String execute() throws Exception {
        if (message == null) {
            addFieldError("message", "请输入内容");
            return INPUT;
        }
        Map session = (Map) ActionContext.getContext().getSession();
        Hotel hotel = (Hotel)session.get("hotel");
        User user = (User)session.get("user");
        Comment comment = new Comment();
        comment.setHotel(hotel);
        comment.setUser(user);
        comment.setMessage(message);
        comment.setTime(new Date());
        if(commentService.add(comment)){
            return SUCCESS;
        }
        addFieldError("message", "评论失败");
        return INPUT;
    }
}
