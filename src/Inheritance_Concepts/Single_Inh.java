package Inheritance_Concepts;

class Animal {
    void eat() {
        System.out.println("Eating...");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Barking...");
    }
}
public class Single_Inh {

	public static void main(String[] args) {
		Dog obj= new Dog();
		obj.bark();
		obj.eat();
		

	}

}
