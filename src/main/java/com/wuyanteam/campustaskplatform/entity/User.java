package com.wuyanteam.campustaskplatform.entity;

public class User
{
    private int id;
    private String username;
    private String password;
    private String sex;
    private int age;
    private String acc_crt_time;
    private int stu_id;
    private int exp;
    private int level;
    private String campus;
    private int like_count;
    private String real_name;
    private String address;
    private int balance;
    private String last_login_time;
    private int take_num;
    private int publish_num;

    private String qq;

    private String email;

    private String phone;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAcc_crt_time() {
        return acc_crt_time;
    }

    public void setAcc_crt_time(String acc_crt_time) {
        this.acc_crt_time = acc_crt_time;
    }

    public int getStu_id() {
        return stu_id;
    }

    public void setStu_id(int stu_id) {
        this.stu_id = stu_id;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }

    public int getLike_count() {
        return like_count;
    }

    public void setLike_count(int like_count) {
        this.like_count = like_count;
    }

    public String getReal_name() {
        return real_name;
    }

    public void setReal_name(String real_name) {
        this.real_name = real_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getLast_login_time() {
        return last_login_time;
    }

    public void setLast_login_time(String last_login_time) {
        this.last_login_time = last_login_time;
    }

    public int getTake_num() {
        return take_num;
    }

    public void setTake_num(int take_num) {
        this.take_num = take_num;
    }

    public int getPublish_num() {
        return publish_num;
    }

    public void setPublish_num(int publish_num) {
        this.publish_num = publish_num;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", acc_crt_time='" + acc_crt_time + '\'' +
                ", stu_id=" + stu_id +
                ", exp=" + exp +
                ", level=" + level +
                ", campus='" + campus + '\'' +
                ", like_count=" + like_count +
                ", real_name='" + real_name + '\'' +
                ", address='" + address + '\'' +
                ", balance=" + balance +
                ", last_login_time='" + last_login_time + '\'' +
                ", take_num=" + take_num +
                ", publish_num=" + publish_num +
                ", qq='" + qq + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
