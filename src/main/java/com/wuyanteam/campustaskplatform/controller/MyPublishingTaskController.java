package com.wuyanteam.campustaskplatform.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.github.yulichang.query.MPJQueryWrapper;
import com.wuyanteam.campustaskplatform.entity.Task;
import com.wuyanteam.campustaskplatform.entity.UTT;
import com.wuyanteam.campustaskplatform.mapper.TaskMapper;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/mypublishingtask")
public class MyPublishingTaskController
{
    @Resource
    private TaskMapper taskMapper;
    @PostMapping("/{state}")
    public IPage myPublishingTask(int myId, int page, String sortRule, boolean ifDesc, @PathVariable String state)
    {
        IPage<UTT> iPage;
        if(!ifDesc)
        {
            iPage = taskMapper.selectJoinPage(new Page<>(page, 10), UTT.class, new MPJQueryWrapper<Task>()
                    .select("take_time", "publish_time", "finish_time", "due_time", "title")
                    .select("username", "sex")
                    .innerJoin("`user` on taker_id = `user`.id")
                    .eq("taker_id", myId)
                    .eq("state",state)
                    .orderByAsc(sortRule));
        }
        else
        {
            iPage = taskMapper.selectJoinPage(new Page<>(page, 10), UTT.class, new MPJQueryWrapper<Task>()
                    .select("take_time", "publish_time", "finish_time", "due_time", "title")
                    .select("username", "sex")
                    .innerJoin("`user` on taker_id = `user`.id")
                    .eq("taker_id", myId)
                    .eq("state",state)
                    .orderByDesc(sortRule));
        }
        return iPage;
    }
}
