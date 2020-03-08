package com.ds.driver_administrator.dao;

import com.ds.driver_administrator.pojo.Driver;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface DriverMapper {

    @Insert("insert into user(name,age) values(#{name},#{age})")
    int addUser(@Param("name") String name, @Param("age") String age);

    @Select("select * from user where id =#{id}")
    Driver findById(@Param("id") String id);

    @Update("update user set name=#{name} where id=#{id}")
    void updataById(@Param("id") String id, @Param("name") String name);

    @Delete("delete from user where id=#{id}")
    void deleteById(@Param("id") String id);

    @Select("select * from user")
    List<Driver> findAllUser();

}
