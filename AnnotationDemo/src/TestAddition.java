import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

import com.annotations.AdditionAnno;
import com.annotations.MyAnnotation;
import com.annotations.MyDate;

public class TestAddition {
	
	@AdditionAnno(num1 = 50, num2 = 35)
//	public static void display() {
//		System.out.println("Display");
//
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestAddition test = new TestAddition();
		Class class1 = test.getClass();
		
		Method[] methods = class1.getMethods();
		for(Method method : methods) {
			Annotation[] annotations = method.getAnnotations();
		
			for(Annotation anno: annotations) {
				if(anno.annotationType().equals(AdditionAnno.class))
					{
						AdditionAnno m = (AdditionAnno)anno;
//						int day = m.day();
						System.out.println("Sum: " + (m.num1()+m.num2()) );
					}
				}
			}
				

	}

}
