package org.example;

import org.example.queryString.MyRequest;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        queryStringParsing();
    }

    static void queryStringParsing(){
        MyRequest request = new MyRequest();
        String queryString = "https://www.ebrainsoft.com/?id=kmc774&favorite=001&favorite=002";
        request.parse(queryString);

        System.out.println(request.getParam("id"));
        System.out.println(request.getParams("favorite").getClass());
        System.out.println(request.getParams("favorite").size());
        System.out.println(request.getParams("favorite").get(0));
        System.out.println(request.getParams("favorite").get(1));
        System.out.println("----------------------------");
    }
}