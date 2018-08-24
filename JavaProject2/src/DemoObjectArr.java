
public class DemoObjectArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person[] personobj = new Person[3];
		personobj[0] = new Person();
		personobj[1] = new Person(18, "Richard");
		personobj[2] = new Person(25, "Timothy");
		
//		for(int i=0; i<3; i++) {
//			personobj[i].display();
//		}
		
		for(Person obj: personobj) {
			obj.display();
		}
	}
}
