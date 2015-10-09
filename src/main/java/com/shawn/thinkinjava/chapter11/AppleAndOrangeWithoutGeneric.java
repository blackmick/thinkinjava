package com.shawn.thinkinjava.chapter11;

import java.util.*;

class Apple{
    private static long counter;
    private final long id=counter++;
    public long getId(){return id;};
}

class Orange{
}

public class AppleAndOrangeWithoutGeneric{
@SuppressWarnings("unchecked")
    public static void main(String [] args){
        ArrayList list = new ArrayList(10);
        for (int i= 0; i < 3; i++){
            list.add(new Apple());
        }

        list.add(new Orange());

        for(int idx = 0; idx < list.size(); idx++)
            System.out.println(((Apple)list.get(idx)).getId());
    }
}
