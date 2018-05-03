package com.example.demo.service.impl;

import com.example.demo.entity.UserWatermark;
import com.example.demo.repository.UserWatermarkRepository;
import com.example.demo.service.UserWatermarkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by lichuan on 2018/1/2.
 */
@Service
@Transactional
public class UserWatermarkServiceImpl implements UserWatermarkService {

    @Autowired
    private UserWatermarkRepository userWatermarkRepository;

    @Override
    public List<UserWatermark> findByUserId(String userId) {
        return userWatermarkRepository.findByUserId(userId);
    }

    @Override
    public void save(UserWatermark userWatermark) {
        userWatermarkRepository.save(userWatermark);
    }

    @Override
    public List<UserWatermark> findByUserIdQueryBynativeQuery(String userId) {
        return userWatermarkRepository.findByUserIdQueryBynativeQuery(userId);
    }

    @Override
    public void update(String userId, String id) {
        userWatermarkRepository.update(userId,id);
    }


}
