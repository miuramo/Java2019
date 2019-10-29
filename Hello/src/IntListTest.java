import java.util.ArrayList;
import java.util.Scanner;

public class IntListTest {

	public static void main(String[] args) {
		new IntListTest();
	}

	Scanner scan;
	IntListTest(){
		scan = new Scanner(System.in);
		AvgIL intlist = new AvgIL();
		System.out.println("Input integer or n|sum|avg|list|exit");
		while(true) {
			String in = scan.next();
			if ( in.equals("exit") ) {
				System.exit(0);
			} else if ( in.equals("list") ) {
				intlist.show();
			} else if ( in.equals("n") ) {
				System.out.println("n="+intlist.size());
			} else if ( in.equals("sum") ) {
				System.out.println("sum="+intlist.getSum());
			} else if ( in.equals("avg") ) {
				System.out.println("avg="+intlist.getAvg());
			} else if ( in.matches("[0-9]+") ){ // Int value
				int num = Integer.parseInt(in);
				intlist.add(num);
//				System.out.println("sum="+intlist.getSum()+" avg="+intlist.getAvg()+" n="+intlist.size());
			}
		}
	}
}

class IntList {
	protected ArrayList<Integer> intlist; // storage of int values
	IntList(){
		intlist = new ArrayList<Integer>();
	}
	public void add(int n) {
		intlist.add(n);
	}
	public int size() {
		return intlist.size();
	}	
	public void show() {
		for(int k: intlist) {
				System.out.print(k+" ");
		}
		System.out.println("");
	}
}

class SumIL extends IntList {
	private float sum = 0;

	public void add(int n) {
		super.add(n);
		// update sum
		sum = 0;
		for(int k: intlist) {
			sum += k;
		}
	}
	public float getSum() {
		return sum;
	}
}

class AvgIL extends SumIL {
	private float avg = 0;

	public void add(int n) {
		super.add(n);
		// update avg
		avg = -99999; 
	}
	public float getAvg() {
		return avg;
	}
}
