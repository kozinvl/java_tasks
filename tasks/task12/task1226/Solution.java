package com.javarush.task.task12.task1226;

/* 
Лазать, летать и бегать
*/

public class Solution {

    public class Cat implements Climb, Run {
        public void climb(){
            System.out.printf("d");
        }
        public void run(){
            System.out.println("x");
        }

    }

    public class Dog implements Run{
        public void run () {
            System.out.println("run");
        }
    }

    public class Tiger extends Cat {
    }

    public class Duck implements Fly, Run {
        public void fly() {}
        public void run() {}
    }



    public interface Fly {
        void fly ();
     }
    public interface Climb {
        void climb ();
    }

    public interface Run {
         void run();
    }


}
