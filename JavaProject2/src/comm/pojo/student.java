package comm.pojo;

public class student {
	
	private String name;
	private int[] marks;
	private int roll_no;
	
	public student() {
		name = "John Doe";
		marks = new int[] {0,0,0};
		roll_no = 00;
	}
	
	public student(String name, int[] marks, int roll_no) {
		this();
		this.name = name;
		this.marks = marks;
		this.roll_no = roll_no;
	}
	
	public void display() {
		System.out.println("Name: " + name);
		System.out.print("Marks: ");
		for(int n: marks) {
			System.out.print(n + "\t");
		}
		System.out.println();
		System.out.println("Roll number " + roll_no );
	} 

}
