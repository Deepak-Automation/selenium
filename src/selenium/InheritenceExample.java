package selenium;


class Animal{
	void eat(){
	System.out.println("Animal is eating");
	}
	void eat(String s){
	System.out.println("loaded method animal is eating");
	}
	
}

class Dog extends Animal{
	
	void eat(){
	 //super.eat();
	 System.out.println("Dog is eating");
	}
}

public class InheritenceExample {
	
	public static void main(String[] args) {
		
		Animal a = new Animal();
		Animal a1 = new Dog();
		Dog d1 = new Dog();
		a.eat();
		a1.eat("deep");
		d1.eat();
		
	}

}
