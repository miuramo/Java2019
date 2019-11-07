package mmm;

public class TemplateMethodTest {

	public static void main(String[] args) {
		Life my = new MyLife();
		my.live();
	}
}

abstract class Life {
	final public void live(){
		born(); study(); work(); die();
	}
	abstract void born();
	abstract void study();
	abstract void work();
	abstract void die();	
}

class MyLife extends Life {
//	public void live(){		
//	}
	@Override
	void born() {
		System.out.println("xxでうまれる");
	}
	@Override
	void study() {
		System.out.println("xxで勉強する");
	}
	@Override
	void work() {
		System.out.println("xxではたらく");
	}
	@Override
	void die() {
		System.out.println("xxで亡くなる");
	}
}

