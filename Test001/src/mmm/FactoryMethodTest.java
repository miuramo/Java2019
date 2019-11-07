package mmm;

import java.util.Calendar;

public class FactoryMethodTest {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.getClass().getName());
	}
}
