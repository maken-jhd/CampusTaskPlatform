package com.wuyanteam.campustaskplatform.controller;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.github.yulichang.query.MPJQueryWrapper;
import com.wuyanteam.campustaskplatform.entity.Task;
import com.wuyanteam.campustaskplatform.entity.User;
import com.wuyanteam.campustaskplatform.entity.UserDTO;
import com.wuyanteam.campustaskplatform.mapper.TaskMapper;
import com.wuyanteam.campustaskplatform.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
    //分页查询
    @PostMapping("/mytask")
    public IPage searchMyTask(int myId,int page)
    {
        IPage<UserDTO> iPage = taskMapper.selectJoinPage(new Page<>(page,1),UserDTO.class, new MPJQueryWrapper<Task>()
                .select("reward","start_address","end_address","due_time","title")
                .select("username","sex")
                .innerJoin("`user` on publisher_id = `user`.id")
                .eq("taker_id",myId)
                .orderByAsc("reward"));
        System.out.println("====================");
        System.out.println(iPage);
        System.out.println("====================");
        return iPage;
    }

    //testcommit
//    @GetMapping("/mytask/{task_id}")
//    public List searchTaskDetail(int myId)
//    {
//        List<UserDTO> list = taskMapper.selectJoinList(UserDTO.class, new MPJQueryWrapper<Task>()
//                .select("take_time","state","reward","due_time","title")
//                .select("username")
//                .innerJoin("`user` on publisher_id = `user`.id")
//                .eq("taker_id",myId)
//                .orderByAsc("take_time"));
//        return list;
//    }
}
