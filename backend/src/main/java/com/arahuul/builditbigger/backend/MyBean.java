package com.arahuul.builditbigger.backend;

import com.example.JokesClass;

/**
 * The object model for the data we are sending through endpoints
 */
public class MyBean {

//    private String myData;
//
//    public String getData() {
//        return myData;
//    }
//
//    public void setData(String data) {
//        myData = data;
//    }

    private JokesClass obj;

    public MyBean(){
        obj=new JokesClass();
    }

    public String getJoke(){
        return obj.getRandomJoke();
    }


}