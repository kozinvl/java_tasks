package com.javarush.task.task15.task1530;

/**
 * Created by expertvl on 17.09.2017.
 */
public class LatteMaker extends DrinkMaker {
    @Override
    public void getRightCup() {
        System.out.println("Берем чашку для латте");
    }

    @Override
    public void putIngredient () {
        System.out.println("Делаем кофе");
    }

    @Override
    public void pour(){
        System.out.println("Заливаем молоком с пенкой");
    }


    @Override
    public void makeDrink () {
        super.makeDrink();
    }

}
