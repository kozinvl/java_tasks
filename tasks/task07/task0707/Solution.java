package com.javarush.task.task07.task0707;

import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList <String> list = new ArrayList<>();
        list.add("vasya pupkin");
        list.add("kolyan");
        list.add("vova");
        list.add("bear BO");
        list.add("kent");
        System.out.println(list.size());
        for (Object o : list) {
            System.out.println(o);
        }

    }
}
