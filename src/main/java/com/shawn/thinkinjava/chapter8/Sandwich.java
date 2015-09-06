package com.shawn.thinkinjava.chapter8;

//import System.out;

class Meal{
	public Meal(){
		System.out.println("Meal");
	}
}

class Lanch extends Meal{
    public Lanch(){
        System.out.println("Lanch");
    }
}

class Sandwich extends Meal{
	public Sandwich(){
		System.out.println("Sandwich");
	}


	public static void main(String[] args){
		Sandwich sandwich = new Sandwich();
	}
}
