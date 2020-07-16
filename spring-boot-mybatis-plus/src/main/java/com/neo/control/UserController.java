package com.neo.control;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.neo.mapper.UserMapper;
import com.neo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/h")
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/select")
    public User testSelectOne() {
        User user = userMapper.selectById(1L);
        System.out.println(user);
        return user;
    }

    @RequestMapping("/insert")
    public int testInsert() {
        User user = new User();
        user.setName("微笑");
        user.setAge(3);
        user.setEmail("neo@tooool.org");
        return userMapper.insert(user);
    }
    @RequestMapping("/queryUserForPage/{page}/{size}")
    public void queryUserForPage(@PathVariable Integer page, @PathVariable Integer size ){
        Page<User> objectPage = new Page<>(page, size);
        QueryWrapper<User> objectQueryWrapper = new QueryWrapper<>();
        LambdaQueryWrapper<User> eq = objectQueryWrapper.lambda().eq(User::getName, "neo");
        IPage<User> userIPage = userMapper.selectPage(objectPage, eq);
        userIPage.getRecords().forEach((o)-> System.out.println(o.toString()));
    }
}
