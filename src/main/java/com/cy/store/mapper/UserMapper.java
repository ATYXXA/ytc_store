package com.cy.store.mapper;

import com.cy.store.entity.User;

// @Mapper 一个项目中有很多个mapper接口，最好不要这么声明，而是直接去启动项目的入口application声明@MapperScan("com.cy.mapper")
public interface UserMapper {

    /**
     * 插入用户的数据
     * @param user 用户的数据
     * @return 受影响的行数(增删改都将受影响的行数作为返回值,可以根据返回值来判断是否执行成功)
     */
    Integer insert(User user);

    /**
     * 根据用户名来查询用户的数据
     * @param username 用户名
     * @return 如果找到对应的用户则返回这个用户的数据,如果没有找到则返回null
     */
    User findByUsername(String username);
}

