
public class Date {
	private String day;
	private int day_i;
	private int month;
	private int year;

	public void Display()
	{
		System.out.println(day + "," + day_i + "-" + month + "-" + year);
	}
	

	public Date()
	{
		day = "Sunday";
		day_i = 01;
		month = 01;
		year = 2018;
	}
	
	public Date(String day,int day_i, int month, int year)
	{
		this.day = day;
		this.day_i = day_i;
		this.month =  month;
		this.year = year;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public int getDay_i() {
		return day_i;
	}

	public void setDay_i(int day_i) {
		this.day_i = day_i;
	}
	
	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
}


