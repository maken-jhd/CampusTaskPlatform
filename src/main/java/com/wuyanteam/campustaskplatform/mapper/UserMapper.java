package com.wuyanteam.campustaskplatform.mapper;

import com.github.yulichang.base.MPJBaseMapper;
import com.wuyanteam.campustaskplatform.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper extends MPJBaseMapper<User> { }
