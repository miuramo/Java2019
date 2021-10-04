
public class Animal {
	int speed;
	void move(){		
	}
	void eat(){
	}
	void bark(){		
	}
	public static void main(String[] args){
		Animal d = new Dog();
		Animal c = new Cat();
		d.bark();
		c.bark();
	}
}
class Dog extends Animal {
	void bark(){
//		sysout ALT+/  auto-complete
		System.out.println("wan-wan");
	}
}
class Cat extends Animal {
	void bark(){
		System.out.println("miao");
	}
}



