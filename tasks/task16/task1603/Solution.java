package com.javarush.task.task16.task1603;

import java.util.ArrayList;
import java.util.List;

/* 
Список и нити
*/

public class Solution {
    public static volatile List<Thread> list = new ArrayList<Thread>(5);

    public static void main(String[] args) {
        //Add your code here - добавьте свой код тут
        SpecialThread s1 = new  SpecialThread();
        SpecialThread s2 = new SpecialThread();
        SpecialThread s3 = new SpecialThread();
        SpecialThread s4 = new SpecialThread();
        SpecialThread s5 = new SpecialThread();

        list.add(new Thread(s1));
        list.add(new Thread(s2));
        list.add(new Thread(s3));
        list.add(new Thread(s4));
        list.add(new Thread(s5));



    }

    public static class SpecialThread implements Runnable {
        public void run() {
            System.out.println("it's a run method inside SpecialThread");
        }
    }
}
