import comm.myabstract.Circle;
import comm.myabstract.shape;

public class testCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shape s = new Circle(10,"Circle");
		double a = s.area();
		System.out.println("area: " + a);
		s.description();
	}

}
