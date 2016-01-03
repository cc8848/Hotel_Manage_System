package com.action.manage;

import com.model.Admin;
import com.model.Comment;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.service.CommentService;
import com.tool.Pager;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;

/**
 * Created by stiles on 16/1/3.
 */
public class ManageCommentsPageAction extends ActionSupport {
    CommentService commentService;

    public void setCommentService(CommentService commentService) {
        this.commentService = commentService;
    }

    private int pageNow = 1;
    private int pageSize = 20;

    public int getPageNow() {
        return pageNow;
    }

    public void setPageNow(int pageNow) {
        this.pageNow = pageNow;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    @Override
    public String execute() throws Exception {
        Map session = ActionContext.getContext().getSession();
        Admin admin = (Admin) session.get("admin");
        if (admin == null) {
            session.put("error", "未登录,请先登录");
            return ERROR;
        }

        List<Comment> list = commentService.findAll(pageNow, pageSize);
        DateFormat format = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss");
        for (Comment comment :
                list) {
            comment.setTimeString(format.format(comment.getTime()));
        }

        Map request = (Map) ActionContext.getContext().get("request");
        Pager page = new Pager(getPageNow(), commentService.findSize());
        request.put("list", list);
        request.put("page", page);

        return SUCCESS;
    }
}
