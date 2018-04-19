package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.Dept;
import com.atguigu.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;

/**
 * Created by luwan on 2018/4/17.
 */
@Controller
@RequestMapping("test")
public class TestController {
    @Autowired
    private DeptService service;

    @RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
    public Dept get(@PathVariable("id") Long id)
    {
        System.out.println("11111111");
        return service.get(id);
    }

    @RequestMapping(value = "/dept/hash", method = RequestMethod.GET)
    @ResponseBody
    public Object get()
    {
        System.out.println("11111111");
        HashMap<Object, Object> map = new HashMap<>();
        map.put("姓名","张三");
        return map;
    }


}
