import java.util.ArrayList;

public class Polygon {
	int hen;
	public Polygon(int h){
		hen = h;
	}
	public double area(){
		return 0;
	}
	public static void main(String[] args){
		ArrayList<Polygon> shapes;
		shapes = new ArrayList<Polygon>();
		shapes.add(new Triangle(3));
		shapes.add(new Square(3));
		shapes.add(new Hexagon(3));
		for(Polygon p : shapes){
			System.out.println( p.area() );  
		}
	}
}
