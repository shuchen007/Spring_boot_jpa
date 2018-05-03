package com.example.demo.web;


import com.example.demo.entity.UserWatermark;
import com.example.demo.service.UserWatermarkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by lichuan on 2018/1/2.
 */
@RestController
@RequestMapping(value = "/user")
public class DemoController {

    @Autowired
    private UserWatermarkService userWatermarkService;


    @RequestMapping(value = "/hello")
    public String say(){
        return  "Hello World!!";
    }

    @RequestMapping(value = "/show/{userId}")
    public List<UserWatermark> getUserWaterMark(@PathVariable("userId") String  userId){
        //List<UserWatermark> list = userWatermarkService.findByUserId(userId);
        List<UserWatermark> list = userWatermarkService.findByUserIdQueryBynativeQuery(userId);
        return list;
    }

    @RequestMapping(value = "/upate")
    public List<UserWatermark> update(){
        String userId = "test3";
        String id = "6839050340034110a40fbc81175ff444";

        userWatermarkService.update(userId,id);

        List<UserWatermark> list = userWatermarkService.findByUserIdQueryBynativeQuery(userId);
        return  list;

    }
}
