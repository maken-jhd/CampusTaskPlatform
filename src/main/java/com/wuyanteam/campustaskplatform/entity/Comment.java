package com.wuyanteam.campustaskplatform.entity;

public class Comment
{
    private int id;
    private int pulisher_id;
    private int task_id;
    private int receiver_id;
    private String  publish_time;
    private int like_num;
    private int floor_num;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPulisher_id() {
        return pulisher_id;
    }

    public void setPulisher_id(int pulisher_id) {
        this.pulisher_id = pulisher_id;
    }

    public int getTask_id() {
        return task_id;
    }

    public void setTask_id(int task_id) {
        this.task_id = task_id;
    }

    public int getReceiver_id() {
        return receiver_id;
    }

    public void setReceiver_id(int receiver_id) {
        this.receiver_id = receiver_id;
    }

    public String getPublish_time() {
        return publish_time;
    }

    public void setPublish_time(String publish_time) {
        this.publish_time = publish_time;
    }

    public int getLike_num() {
        return like_num;
    }

    public void setLike_num(int like_num) {
        this.like_num = like_num;
    }

    public int getFloor_num() {
        return floor_num;
    }

    public void setFloor_num(int floor_num) {
        this.floor_num = floor_num;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", pulisher_id=" + pulisher_id +
                ", task_id=" + task_id +
                ", receiver_id=" + receiver_id +
                ", publish_time='" + publish_time + '\'' +
                ", like_num=" + like_num +
                ", floor_num=" + floor_num +
                '}';
    }
}
