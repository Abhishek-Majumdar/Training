package comm.myabstract;

abstract public class shape {
	private String name;
	
	public shape() {
		name = "no name";
	}
	
	public shape(String name) {
		super();
		this.name = name;
	}
	
	public void description() {
		System.out.println("name: " + name);
	}
	abstract public double area();

}
