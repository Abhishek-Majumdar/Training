import comm.pojo.Person;


public class TestEmployee1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person(12,"ABC");
		Person p2 = new Person(12,"ABC");
		
		if(p1.equals(p2)) {
			System.out.println("Both are equal.");
		}
		else {
			System.out.println("NOT EQUAL");
		}

	}

}
