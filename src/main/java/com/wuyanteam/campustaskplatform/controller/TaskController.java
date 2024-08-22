package com.wuyanteam.campustaskplatform.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.github.yulichang.query.MPJQueryWrapper;
import com.wuyanteam.campustaskplatform.entity.Task;
import com.wuyanteam.campustaskplatform.entity.UTT;
import com.wuyanteam.campustaskplatform.mapper.TaskMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class TaskController {
    @Resource
    private TaskMapper taskMapper;

    //without judging whether the task has been taken
    @RequestMapping("/taskinformation")
    public IPage taskInformation(int task_id, int page) {
        IPage<UTT> iPage;

        iPage = taskMapper.selectJoinPage(new Page<>(page, 10), UTT.class, new MPJQueryWrapper<Task>()
                .select("username", "sex", "`level`", "phone")
                .select("publisher_id", "taker_id", "publish_time", "take_time", "state", "reward", "start_address", "end_address", "due_time", "title", "description", "campus")
                .innerJoin("`user` u on t.publisher_id = u.id")
                .eq("t.id", task_id));
        return iPage;
    }
}