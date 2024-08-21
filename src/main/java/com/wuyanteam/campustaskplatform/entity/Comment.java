package com.wuyanteam.campustaskplatform.entity;

public class Comment
{
    private int id;
    private int commentatorId;
    private int taskId;
    private int receiverId;
    private String  publishTime;
    private int likeNum;
    private int floorNum;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCommentatorId() {
        return commentatorId;
    }

    public void setCommentatorId(int commentatorId) {
        this.commentatorId = commentatorId;
    }

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public int getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(int receiverId) {
        this.receiverId = receiverId;
    }

    public String getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(String publishTime) {
        this.publishTime = publishTime;
    }

    public int getLikeNum() {
        return likeNum;
    }

    public void setLikeNum(int likeNum) {
        this.likeNum = likeNum;
    }

    public int getFloorNum() {
        return floorNum;
    }

    public void setFloorNum(int floorNum) {
        this.floorNum = floorNum;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", commentatorId=" + commentatorId +
                ", taskId=" + taskId +
                ", receiverId=" + receiverId +
                ", publishTime='" + publishTime + '\'' +
                ", likeNum=" + likeNum +
                ", floorNum=" + floorNum +
                '}';
    }
}
