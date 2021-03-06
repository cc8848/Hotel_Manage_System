<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8" %>
<%@ page contentType="text/html; charset=utf-8" %>
<s:set name="headUser" value="#session['user']"/>
<s:set name="headHotel" value="#session.hotel"/>
<s:set name="headAdmin" value="#session.admin"/>
<nav class="navbar navbar-default">
    <div class="container-fluid">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse"
                    data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">旅店管理系统</a>
        </div>

        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav">
                <li class="active">
                    <a href="#">Home<span class="sr-only">(current)</span></a>
                </li>
                <li><a href="/hotelmanager/index.jsp">主页</a></li>
                <li class="dropdown">
                    <a href="" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true"
                       aria-expanded="false">用户<span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="/hotelmanager/userPage/login.jsp">登陆</a></li>
                        <li><a href="/hotelmanager/userPage/register.jsp">注册</a></li>
                        <li><a href="/hotelmanager/userPage/roomsInfo.action">查看房间</a></li>
                        <li><a href="/hotelmanager/userPage/ordersInfo.action">查看订单</a></li>
                        <li><a href="/hotelmanager/userPage/viewComments.action">查看自己的评论</a></li>
                    </ul>
                </li>

                <li class="dropdown">
                    <a href="" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true"
                       aria-expanded="false">旅店<span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="/hotelmanager/hotelPage/login.jsp">登陆</a></li>
                        <li><a href="/hotelmanager/hotelPage/register.jsp">注册</a></li>
                        <li><a href="/hotelmanager/hotelPage/addRooms.jsp">添加房间</a> </li>
                        <li><a href="/hotelmanager/hotelPage/hotelRoomsInfo.action">查看房间</a> </li>
                        <li><a href="/hotelmanager/hotelPage/hotelOrdersInfo.action">查看预定信息</a> </li>
                        <li><a href="/hotelmanager/hotelPage/hotelViewComments.action">查看用户评论</a> </li>
                    </ul>
                </li>


                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true"
                       aria-expanded="false">管理员<span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="/hotelmanager/managerPage/manageLogin.jsp">登陆</a></li>
                        <li><a href="/hotelmanager/managerPage/manageCommentsPage.action">管理所有评论</a></li>
                    </ul>
                </li>
            </ul>
            <ul class="nav navbar-nav navbar-right">
                <s:if test="#headUser!=null">
                    <li>
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">
                            <s:property value="#headUser.nickname"/>
                            <span class="caret"></span>
                        </a>
                    </li>
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">个人信息 <span class="caret"></span></a>
                        <ul class="dropdown-menu">
                            <li><a href="/hotelmanager/logout.action">注销</a></li>
                        </ul>
                    </li>
                </s:if>
                <s:elseif test="#headHotel!=null">
                    <li>
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">
                            <s:property value="#headHotel.hotelName"/>
                            <span class="caret"></span>
                        </a>
                    </li>
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">个人信息 <span class="caret"></span></a>
                        <ul class="dropdown-menu">
                            <li><a href="/hotelmanager/logout.action">注销</a></li>
                        </ul>
                    </li>
                </s:elseif>
                <s:elseif test="#headAdmin!=null">
                    <li>
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">
                            <s:property value="#headAdmin.username"/>
                            <span class="caret"></span>
                        </a>
                    </li>
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">个人信息 <span class="caret"></span></a>
                        <ul class="dropdown-menu">
                            <li><a href="/hotelmanager/logout.action">注销</a></li>
                        </ul>
                    </li>
                </s:elseif>
            </ul>
        </div><!-- /.navbar-collapse -->
    </div><!-- /.container-fluid -->
</nav>