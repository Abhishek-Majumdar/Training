
public class TestDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d;
		d = new Date();
		d.Display();
		
		Date d1;
		d1 = new Date("Tuesday",18,02,2019);
		d1.Display();
		
		d.setDay("Friday");
		d.setMonth(12);
		d.Display();
	}

}
