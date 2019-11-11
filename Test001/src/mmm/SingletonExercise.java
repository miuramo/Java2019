package mmm;


import java.util.Calendar;
import java.util.Date;

public class SingletonExercise {

	public static void main(String[] args) throws InterruptedException {
		MSetting ms = MSetting.getInstance();
		int object_id = ms.hashCode();
		System.out.println(ms.getCreated().toString());
		//Thread.sleep(2200); // Eclipseで動作チェックするときに使うとよい
		MSetting ms2 = MSetting.getInstance();
		System.out.println(ms2.getCreated().toString());
		System.out.println(ms2.getLastAccessed().toString());

		int object_id2 = ms2.hashCode();
		if (object_id == object_id2) {
			System.out.println("Object is same.");
		} else {
			System.out.println("Object is different.");
		}
		if (ms.getCreated() == ms2.getCreated()) {
			System.out.println("CreatedDate is also same.");
		} else {
			System.out.println("CreatedDate is different.");
		}
		
		String s1 = "ABC";
		String s2 = new String("ABC");
		if (s1.equals(s2) /* s1 == s2 */ ){
			System.out.println("s1 と s2はおなじ");
		} else {
			System.out.println("s1 と s2は異なる");
		}
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		if (i1.equals(i2)) System.out.println("おなじ");
	}
}
class MSetting {
	private static MSetting instance;
	private MSetting(){
		created = Calendar.getInstance().getTime();
	}
	private Date created;
	private Date lastAccessed;
	public static MSetting getInstance(){
		// TODO: このあたりの、記述を追加・変更する必要がある
		instance = new MSetting();

		instance.lastAccessed = Calendar.getInstance().getTime();
		return instance;
	}
	public Date getCreated(){
		return created;
	}
	public Date getLastAccessed(){
		return lastAccessed;
	}
}
