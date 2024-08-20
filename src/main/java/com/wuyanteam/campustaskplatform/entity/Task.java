package com.wuyanteam.campustaskplatform.entity;

public class Task
{
    private int id;
    private int publisher_id;
    private int taker_id;
    private String publish_time;
    private String state;
    private String take_time;
    private int reward;
    private String start_address;
    private String end_address;
    private String due_time;
    private String title;
    private String description;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPublisher_id() {
        return publisher_id;
    }

    public void setPublisher_id(int publisher_id) {
        this.publisher_id = publisher_id;
    }

    public int getTaker_id() {
        return taker_id;
    }

    public void setTaker_id(int taker_id) {
        this.taker_id = taker_id;
    }

    public String getPublish_time() {
        return publish_time;
    }

    public void setPublish_time(String publish_time) {
        this.publish_time = publish_time;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getTake_time() {
        return take_time;
    }

    public void setTake_time(String take_time) {
        this.take_time = take_time;
    }

    public int getReward() {
        return reward;
    }

    public void setReward(int reward) {
        this.reward = reward;
    }

    public String getStart_address() {
        return start_address;
    }

    public void setStart_address(String start_address) {
        this.start_address = start_address;
    }

    public String getEnd_address() {
        return end_address;
    }

    public void setEnd_address(String end_address) {
        this.end_address = end_address;
    }

    public String getDue_time() {
        return due_time;
    }

    public void setDue_time(String due_time) {
        this.due_time = due_time;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", publisher_id=" + publisher_id +
                ", taker_id=" + taker_id +
                ", publish_time='" + publish_time + '\'' +
                ", state='" + state + '\'' +
                ", take_time='" + take_time + '\'' +
                ", reward=" + reward +
                ", start_address='" + start_address + '\'' +
                ", end_address='" + end_address + '\'' +
                ", due_time='" + due_time + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
