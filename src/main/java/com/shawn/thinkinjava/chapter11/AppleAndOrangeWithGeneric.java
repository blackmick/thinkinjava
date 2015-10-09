package com.shawn.thinkinjava.chapter11;

import java.util.*;

public class AppleAndOrangeWithGeneric{
    public static void main(String[] args){
        ArrayList<Apple> apples = new ArrayList<Apple>(10);

        for (int i=0;i<3;i++){
            apples.add(new Apple());
        }

        //apples.add(new Orange());

        for (Apple apple : apples){
            System.out.println(apple.getId());
        }
    }
}