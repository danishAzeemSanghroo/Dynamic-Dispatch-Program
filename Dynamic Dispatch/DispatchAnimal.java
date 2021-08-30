import java.util.*;
class Animal{
	void sound(){
	System.out.println("Loud/slow");
	}
	void legs(){
	System.out.println("Four legs");
	}
	void eyes(){
	System.out.println("Two");
	}
}
class Cat extends Animal{
	void sound(){
	System.out.println("MiyaOOOo mIyaaoOn MiyaaooN");
	}
}
class Dog extends Animal{
	void sound(){
	System.out.println("Bhaoouu..bahauuuu..bhaauuuUuUuu");
	}
}
class Human extends Animal{
	void sound(){
	System.out.println("Spoken language");
	}
	void legs(){
	System.out.println("Two");
	}
}
class Display{
	static void show(Animal a){
	a.sound();
	a.legs();
	a.eyes();
	}
}
class DispatchAnimal{
	public static void main(String arg[]){
	/*Cat c=new Cat();
	Dog d=new Dog();
	Human h=new Human();
	Display.show(c);
	Display.show(d);
	Display.show(h);*/
	/*Animal a;
	Cat c=new Cat();
	a=c;
	Display.show(a);*/
	Animal a=new Dog();
	Display.show(a);
	}
}