package comm.myabstract;

public class Circle extends shape {

	private int radius;
	
	public Circle() {
		// TODO Auto-generated constructor stub
		radius = 10;
	}

	public Circle(int radius, String name) {
		super(name);
		this.radius = radius;
	}
	
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return (3.14*radius*radius);
	}

}
