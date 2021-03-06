package com.gistmap.mapper;

import com.gistmap.entity.User;
import org.apache.ibatis.annotations.Mapper;


/**
 * @Desc : 用户Mapper
 * @User : gistmap
 * @Date : 2017/9/6  22:20
 */

@Mapper
public interface UserMapper {
    User get();

    User findByEmail(String email);

    void save(User user);

    User findByUserName(String username);
}
