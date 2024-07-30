package org.example;

import org.example.queryString.MyRequest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MyRequestTest {

    MyRequest request = new MyRequest();

    String queryString = "https://www.ebrainsoft.com/?id=kmc774&favorite=001&favorite=002";

    @BeforeEach
    void setup(){

        request.parse(queryString);
    }

    @Test
    @DisplayName("쿼리스트링이 들어오면 쿼리를 추출한다")
    void parse(){
        //given

        //when

        //then

        assertEquals(String[].class, request.getQuery().getClass());
    }

    @Test
    @DisplayName("key 값이 들어오면 value를 반환한다")
    void getParam(){
        //given

        //when

        //then

        assertEquals("kmc774", request.getParam("id"));

    }

    @Test
    @DisplayName("key값이 들어오면 value list를 반환한다")
    void getParams() {
        //given

        //when

        //then
        assertEquals(ArrayList.class, request.getParams("favoirte").getClass());
        assertEquals(2, request.getParams("favorite").size());
        assertEquals("001", request.getParams("favorite").get(0));
        assertEquals("002", request.getParams("favorite").get(1));
    }

}