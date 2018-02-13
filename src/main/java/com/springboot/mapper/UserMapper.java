package com.springboot.mapper;

import com.springboot.model.Person;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

/**
 * Created by guhao on 2018/2/13.
 */
    public interface UserMapper {

        @Select("SELECT * FROM Person WHERE id = #{id}")
        Person selectUser(int id);

        @Insert("INSERT INTO Person(id,name,age) VALUES(#{id}, #{name}, #{age})")
         void insertUser(Person person);

        @Update("UPDATE Person SET age=#{age},name=#{name} WHERE id =#{id}")
         void updateUser(Person person);

        @Delete("DELETE FROM Person WHERE id =#{id}")
         void deleteUser(int id);
    }

