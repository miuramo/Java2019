
public class Animal {
	int speed;
	void move(){		
	}
	void eat(){
	}
	void cry(){		
	}
	public static void main(String[] args){
		Animal d = new Dog();
		Animal c = new Cat();
		d.cry();
		c.cry();
	}
}
class Dog extends Animal {
	void cry(){
//		sysout ALT+/  auto-complete
		System.out.println("wan-wan");
	}
}
class Cat extends Animal {
	void cry(){
		System.out.println("miao");
	}
}



