package com.wuyanteam.campustaskplatform.entity;

public class Task
{
    private int id;
    private int publisherId;
    private int takerId;
    private String publishTime;
    private String state;
    private String takeTime;
    private int reward;
    private String startAddress;
    private String endAddress;
    private String dueTime;
    private String title;
    private String description;

    private String finishTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPublisherId() {
        return publisherId;
    }

    public void setPublisherId(int publisherId) {
        this.publisherId = publisherId;
    }

    public int getTakerId() {
        return takerId;
    }

    public void setTakerId(int takerId) {
        this.takerId = takerId;
    }

    public String getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(String publishTime) {
        this.publishTime = publishTime;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getTakeTime() {
        return takeTime;
    }

    public void setTakeTime(String takeTime) {
        this.takeTime = takeTime;
    }

    public int getReward() {
        return reward;
    }

    public void setReward(int reward) {
        this.reward = reward;
    }

    public String getStartAddress() {
        return startAddress;
    }

    public void setStartAddress(String startAddress) {
        this.startAddress = startAddress;
    }

    public String getEndAddress() {
        return endAddress;
    }

    public void setEndAddress(String endAddress) {
        this.endAddress = endAddress;
    }

    public String getDueTime() {
        return dueTime;
    }

    public void setDueTime(String dueTime) {
        this.dueTime = dueTime;
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

    public String getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(String finishTime) {
        this.finishTime = finishTime;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", publisherId=" + publisherId +
                ", takerId=" + takerId +
                ", publishTime='" + publishTime + '\'' +
                ", state='" + state + '\'' +
                ", takeTime='" + takeTime + '\'' +
                ", reward=" + reward +
                ", startAddress='" + startAddress + '\'' +
                ", endAddress='" + endAddress + '\'' +
                ", dueTime='" + dueTime + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", finishTime='" + finishTime + '\'' +
                '}';
    }
}
