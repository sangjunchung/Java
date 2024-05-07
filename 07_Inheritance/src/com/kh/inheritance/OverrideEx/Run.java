package com.kh.inheritance.OverrideEx;
/*
	Animal - sound
	 	ㄴ Puppy - sound
	 	ㄴ Cat - sound
	 	ㄴ Cow - sound
	 	ㄴ Rabbit - sound
 
*/
public class Run {

	public static void main(String[] args) {
		Puppy puppy1 = new Puppy("뽀삐");
		puppy1.sound();
		
		Cat cat1 = new Cat("고등어");
		cat1.sound();
		
		Cow cow1 = new Cow("한우");
		cow1.sound();
		
		Rabbit rabbit1 = new Rabbit("토깽");
		rabbit1.sound();
		
		Pig pig1 = new Pig("한돈");
		pig1.sound();

	}

}
