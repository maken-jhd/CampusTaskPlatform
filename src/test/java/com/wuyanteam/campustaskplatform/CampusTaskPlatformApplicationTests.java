package com.wuyanteam.campustaskplatform;

import com.github.yulichang.query.MPJQueryWrapper;
import com.wuyanteam.campustaskplatform.entity.User;
import com.wuyanteam.campustaskplatform.entity.UserDTO;
import com.wuyanteam.campustaskplatform.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class CampusTaskPlatformApplicationTests {

    @Resource
    private UserMapper userMapper;
    @GetMapping("/mytask")
    void searchMyTask()
    {
        System.out.println("UserMapper: " + userMapper);
        List<UserDTO> list = userMapper.selectJoinList(UserDTO.class, new MPJQueryWrapper<User>()
                .select("take_time","state","reward","due_time","title")
                .select("username")
                .innerJoin("`user` on task.publisher_id = `user`.id")
                .eq("taker_id",2)
                .orderByAsc("take_time"));
    }

}
