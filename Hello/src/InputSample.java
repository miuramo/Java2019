import java.util.Scanner;

public class InputSample {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    int b = scan.nextInt();
    Frac f1 = new Frac(a,b); // ここで、コンストラクタを呼び、オブジェクトを生成する

    // （参考）privateなメンバー変数なので、コンパイルエラーになる。
    //  f1.bunsi = 1;  

    System.out.println( f1.toString() );
    scan.close();
  }
}

class Frac {
  private int bunsi, bumbo;

  Frac( int a, int b ){ // コンストラクタ
    setBunsi(a);
    setBumbo(b);
  }

  public void setBunsi(int a){
    if (a==0){
      // Javaで、実行時に「例外を発生させる」コード例は、以下です。
      // throw new RuntimeException("Bunsi is zero");
    }
    bunsi = a;
    this.checkSign();
  }
  public void setBumbo(int b){
    /* ここは、自分で考えてください */
  }
  public void checkSign(){ 
    /* 分子も分母も、マイナスだったら、符号を反転させてください */
  }

  public String toString(){
    return bunsi+"/"+bumbo;
  }

}
