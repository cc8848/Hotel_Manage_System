package com.action.hotel;

import com.model.Comment;
import com.model.Hotel;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.service.CommentService;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;

/**
 * Created by stiles on 16/1/3.
 */
public class HotelViewCommentsAction extends ActionSupport {
    CommentService commentService;

    public void setCommentService(CommentService commentService) {
        this.commentService = commentService;
    }

    @Override
    public String execute() throws Exception {
        Map session = ActionContext.getContext().getSession();
        Hotel hotel = (Hotel) session.get("hotel");
        if (hotel == null) {
            session.put("error", "未登录,请先登录");
            return ERROR;
        }

        List<Comment> list = commentService.findByHotel(hotel);
        DateFormat format = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss");
        for (Comment comment :
                list) {
            comment.setTimeString(format.format(comment.getTime()));
        }
        Map request = (Map) ActionContext.getContext().get("request");
        request.put("list", list);
        return SUCCESS;
    }
}
