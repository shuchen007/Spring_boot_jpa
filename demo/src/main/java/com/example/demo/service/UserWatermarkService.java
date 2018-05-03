package com.example.demo.service;

import com.example.demo.entity.UserWatermark;

import java.util.List;

/**
 * Created by lichuan on 2018/1/2.
 */
public interface UserWatermarkService {

    public List<UserWatermark> findByUserId(String userId);

    public void save(UserWatermark userWatermark);

    public  List<UserWatermark> findByUserIdQueryBynativeQuery(String userId);

    public  void update(String userId,String id );


}
