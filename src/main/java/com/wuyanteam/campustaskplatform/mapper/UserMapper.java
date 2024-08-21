package com.wuyanteam.campustaskplatform.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wuyanteam.campustaskplatform.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper extends BaseMapper<User>
{
    @Select("SELECT\n" +
            "task.take_time,\n" +
            "task.state,\n" +
            "task.reward,\n" +
            "task.due_time,\n" +
            "task.title,\n" +
            "`user`.username\n" +
            "FROM\n" +
            "task\n" +
            "INNER JOIN `user` ON task.publisher_id = `user`.id\n" +
            "WHERE\n" +
            "task.taker_id\n" +
            "ORDER BY\n" +
            "task.take_time ASC\n")
    @Results(
            {
                @Result(column = )
            }
    )

}
