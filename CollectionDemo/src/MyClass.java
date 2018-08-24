import com.beans.Book;

public class MyClass<T> {
	
	private T data;

	public MyClass() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MyClass(T data) {
		super();
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}


	public static void main(String[] args) {
		
		MyClass<Integer> class1 = new MyClass<>();
		
		MyClass<Double> class2 = new MyClass<>();
		
		MyClass<Book> class3 = new MyClass<>();
		
	}
}
