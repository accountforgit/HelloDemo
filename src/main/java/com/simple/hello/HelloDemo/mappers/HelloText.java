package com.simple.hello.HelloDemo.mappers;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

/**
 * Created by win_user on 23/05/2017.
 */
public interface HelloText {
    @Select("select text from hellotext")
    public String getHelloText();

    @Update("update hellotext set text=#{text}'")
    void updateHelloText(String text);
}
