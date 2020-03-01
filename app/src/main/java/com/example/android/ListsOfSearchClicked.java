package com.example.android;

public class ListsOfSearchClicked extends SearchClicked {
    private String mainString;
    private String subMainString;

    public ListsOfSearchClicked(String text1, String text2){
        mainString = text1;
        subMainString = text2;
    }
    public String getText1(){
        return mainString;
    }
    public String getText2(){
        return subMainString;
    }

}
