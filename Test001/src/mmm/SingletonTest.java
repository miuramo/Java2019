package mmm;

public class SingletonTest {

	public static void main(String[] args)  {
//		Desktop dp = Desktop.getDesktop();
//		dp.browse(new URI("http://www.google.com/"));
		MySetting ins = MySetting.getInstance();
		System.out.println(ins.getAge());
		ins = MySetting.getInstance();
		System.out.println(ins.getAge());
	}
}

class MySetting {
	private static MySetting instance;
	private MySetting(){
	}
	private int age = 0;
	public static MySetting getInstance(){
		if (instance==null){
			instance = new MySetting();
		}
		instance.age++;
		return instance;
	}
	public int getAge(){
		return age;
	}
}
