package com.mitsubishi.pesb.controller;

import com.mitsubishi.pesb.dao.CommonDao;
import com.mitsubishi.pesb.dao.UserDao;
import com.mitsubishi.pesb.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
public class UserController extends BaseController{

    @Autowired
    private UserDao userDao;
    @Autowired
    private CommonDao commonDao;


    @RequestMapping("save")
    public String save() {
        UserModel demoInfo = new UserModel();
        demoInfo.setName("张三");
        demoInfo.setAge(20);
        userDao.save(demoInfo);

        demoInfo = new UserModel();
        demoInfo.setName("李四");
        demoInfo.setAge(30);
        userDao.save(demoInfo);

        return "ok";
    }

    @RequestMapping("find")
    public List<UserModel> find() {
        return (List<UserModel>) userDao.findAll();
    }

    @RequestMapping("findByName")
    public List<UserModel> findByName() {
        return userDao.findByName("张三");
    }

    @RequestMapping("findByNameAndAge")
    public List<UserModel> findByNameAndAge() {
        return userDao.findByNameAndAge("张三",20);
    }

    @RequestMapping("findNative")
    public List<Map<String, Object>> findNative() {
        List<Map<String, Object>> byName = commonDao.findByName();
        return byName;
    }


}
