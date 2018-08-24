import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

import com.annotations.MyAnnotation;
import com.annotations.MyDate;

public class TestAnnotation {
	
	@MyDate(day = 5, month = "DEC", year = 2018)
	public static void display() {
		System.out.println("Display");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestAnnotation test = new TestAnnotation();
		Class class1 = test.getClass();
		
		Method[] methods = class1.getMethods();
		for(Method method : methods) {
			Annotation[] annotations = method.getAnnotations();
		
			for(Annotation anno: annotations) {
				if(anno.annotationType().equals(MyDate.class))
					{
						MyDate m = (MyDate)anno;
						int day = m.day();
						System.out.println("Day: " + day);
					}
				}
			}
				

	}

}
