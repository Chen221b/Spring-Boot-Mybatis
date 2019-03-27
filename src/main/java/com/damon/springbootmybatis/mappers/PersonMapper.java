package com.damon.springbootmybatis.mappers;

import com.damon.springbootmybatis.damain.Person;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/*
* getNameById() 注解配置
* getPersonById() xml配置
 */
@Mapper
public interface PersonMapper {

    @Select("select id, name from person where id = #{id}")
    Person getNameById(@Param("id") Integer id);

    Person getPersonById(Integer id);
}
