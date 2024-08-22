package com.wuyanteam.campustaskplatform.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.wuyanteam.campustaskplatform.entity.User;
import com.wuyanteam.campustaskplatform.mapper.UserMapper;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    UserMapper userMapper;
    //用户个人信息
    @PostMapping("/info")
    public List searchByName(int myId)
    {
        QueryWrapper<User> queryWrapper = new QueryWrapper();
        queryWrapper.eq("id",myId)
                .select("id","username","sex","age","stu_id","exp","level","like_count",
                "real_name","address","balance","take_num","publish_num","qq","email","phone");
        return userMapper.selectList(queryWrapper);
    }
}
