package com.wuyanteam.campustaskplatform.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.wuyanteam.campustaskplatform.entity.User;
import com.wuyanteam.campustaskplatform.mapper.UserMapper;
import com.wuyanteam.campustaskplatform.service.UserService;
import com.wuyanteam.campustaskplatform.utils.JWTUtils;
import com.wuyanteam.campustaskplatform.utils.Result;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    UserMapper userMapper;
    @Resource
    private UserService userService;
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

    //登录
    @PostMapping("/login")
    public Result<User> loginController(@RequestParam String username, @RequestParam String password) {
        User user=userService.LoginService(username,password);
        if(user!=null){
            String token= String.valueOf(JWTUtils.generateToken(username));
            return Result.success(user,token);
        }else{
            return Result.error("123","账号或密码错误!");
        }
    }
    //注册
    @PostMapping("/register")
    public Result<User> registerController(@RequestBody User newUser) {
        if(newUser!=null){
            User user=userService.RegisterService(newUser);
        if(user!=null){
            return Result.success(user,"注册成功！");
        }else{
            return Result.error("456","用户名已存在！");
        }
        }
        else{
            return Result.error("456","传入用户为空");
        }
    }
    }
}
