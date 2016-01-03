package com.action.manage;

import com.opensymphony.xwork2.ActionSupport;
import com.service.CommentService;

/**
 * Created by stiles on 16/1/3.
 */
public class DeleteCommentAction extends ActionSupport {
    CommentService commentService;

    public void setCommentService(CommentService commentService) {
        this.commentService = commentService;
    }

    String comment_id;

    public String getComment_id() {
        return comment_id;
    }

    public void setComment_id(String comment_id) {
        this.comment_id = comment_id;
    }

    @Override
    public String execute() throws Exception {
        if (commentService.remove(comment_id)) {
            return SUCCESS;
        } else {
            addFieldError("message", "数据库错误,无法删除");
            return INPUT;
        }
    }
}
