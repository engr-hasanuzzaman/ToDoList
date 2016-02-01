package com.nascenia.android.data;

import java.util.Date;

/**
 * Created by sumon on 2/1/16.
 */
public class ToDo {
    private String title;
    private Date createdDate;
    private  Date performDate;
    private  Boolean status;

    public ToDo(String title){
        this.title = title;
        this.createdDate = new Date();
        this.status = false;
    }

    public  String getTitle(){
            return  this.title;
    }

    public  boolean getStatus(){
        return  this.status;
    }
}
