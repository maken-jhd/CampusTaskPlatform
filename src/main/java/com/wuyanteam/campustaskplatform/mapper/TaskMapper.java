package com.wuyanteam.campustaskplatform.mapper;

import com.github.yulichang.base.MPJBaseMapper;
import com.wuyanteam.campustaskplatform.entity.Task;
import com.wuyanteam.campustaskplatform.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TaskMapper extends MPJBaseMapper<Task> {
}
