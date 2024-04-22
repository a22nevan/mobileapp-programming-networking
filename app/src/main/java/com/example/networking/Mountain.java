package com.example.networking;

import com.google.gson.annotations.SerializedName;

public class Mountain {

    private String name;
    private String location;
    private int height;


    public Mountain(){

        name = "Saknar namn";
        location = "Saknar plats";
        height = 1;
    }

    public Mountain(String n, String l, int h){

        name = n;
        location = l;
        height = h;
    }

    public Mountain(String name){
        this.name = name;
    }

    public void setName(String n){
        name = n;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString(){
        return name;
    }
}
