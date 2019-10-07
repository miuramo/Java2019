package hello; // static: 静的   <=> dynamic: 動的

import java.util.ArrayList;

// import java.util.ArrayList;

public class HelloProgram {
	public static void main(String[] args){
		System.out.println("Hello");
		System.out.println(Onigiri.count);
//		Onigiri ume, okaka, syake;
		/*ume =*/ new Onigiri("UME");
		/*okaka =*/ new Onigiri("OKAKA");
		/*syake =*/ new Onigiri("SYAKE");
		for(Onigiri o : Onigiri.all){
			o.printGu();
		}
//		ume.printGu();    ume.hasNori = true;
//		okaka.printGu();  okaka.setNori(true);
//		syake.printGu();  Onigiri.printCount();
	}
}
class Onigiri {
	static int count = 0; // 生成したおにぎりの数をカウントする変数
	static void printCount(){
		System.out.println(count+ "個のおにぎりをつくりました");
	}
	static ArrayList<Onigiri> all;
	static { //クラスロード時に、実行される
		all = new ArrayList<Onigiri>();
	}
	Onigiri(String g){ //constructor コンストラクタ
		gu = g;
		count++; 
		System.out.println(count + "個のおにぎりをつくりました");
		all.add(this);
	}
	String gu;
	boolean hasNori;
	void setNori(boolean n){
		hasNori = n;
	}
	void printGu(){
		System.out.println("Gu = "+gu);
	}
}


