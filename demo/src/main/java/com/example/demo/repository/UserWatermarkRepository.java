package com.example.demo.repository;

import com.example.demo.entity.UserWatermark;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by lichuan on 2018/1/2.
 */
@Repository
public interface UserWatermarkRepository extends CrudRepository<UserWatermark,String> {

    List<UserWatermark> findByUserId(String userId);

    @Query(value = "select * from user_watermark u where u.user_id = :userId",nativeQuery = true)
    List<UserWatermark> findByUserIdQueryBynativeQuery(@Param("userId")String userId);

    @Modifying
    @Query(value = "update UserWatermark u set u.userId = ?1 where u.id = ?2")
    void update(String userId,String id );
}
