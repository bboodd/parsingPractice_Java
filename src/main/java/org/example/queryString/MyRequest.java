package org.example.queryString;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MyRequest {

    private String[] query;

    public void parse(String queryString) {
        String[] arr = queryString.split("\\?")[1].split("&");

        this.query = arr;
    }

    public String[] getQuery() {

        return this.query;
    }


    public String getParam(String key) {

        String value = "";

        for(String s : this.query){
            String findKey = s.split("=")[0];
            String findValue = s.split("=")[1];

            if(key.equals(findKey)) value = findValue;

        }

        return value;
    }

    public List<String> getParams(String key){
        List<String> list = new ArrayList<String>();

        for(String s : this.query){
            String findKey = s.split("=")[0];
            String findValue = s.split("=")[1];

            if(key.equals(findKey)) list.add(findValue);

        }

        return list;
    }
}
