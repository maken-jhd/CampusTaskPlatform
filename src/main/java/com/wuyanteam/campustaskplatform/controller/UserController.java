package com.wuyanteam.campustaskplatform.controller;

import com.baomidou.mybatisplus.annotation.TableName;
import com.github.yulichang.query.MPJQueryWrapper;
import com.wuyanteam.campustaskplatform.entity.Task;
import com.wuyanteam.campustaskplatform.entity.User;
import com.wuyanteam.campustaskplatform.entity.UserDTO;
import com.wuyanteam.campustaskplatform.mapper.TaskMapper;
import com.wuyanteam.campustaskplatform.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController
{

    @Resource
    private TaskMapper taskMapper;
    @GetMapping("/mytask")
    public List searchMyTask()
    {
        List<UserDTO> list = taskMapper.selectJoinList(UserDTO.class, new MPJQueryWrapper<Task>()
                .select("take_time","state","reward","due_time","title")
                .select("username")
                .innerJoin("`user` on task.publisher_id = `user`.id")
                .eq("taker_id",2)
                .orderByAsc("take_time"));
        return list;
    }
}
