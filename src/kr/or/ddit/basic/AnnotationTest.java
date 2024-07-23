package kr.or.ddit.basic;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class AnnotationTest {
	public static void main(String[] args) {
		
		Method[] methodArr = Service.class.getDeclaredMethods();
		
		for(Method m : methodArr) {
			System.out.println("메서드 명 : " + m.getName());
			
			Annotation[] annos = m.getDeclaredAnnotations();
			
			for(Annotation anno : annos) {
				if(anno.annotationType().getSimpleName().equals("PrintAnnotation")) {
					PrintAnnotation printAnno = (PrintAnnotation)anno;
					int count = printAnno.count();
					String value = printAnno.value();
					
					for(int i=0; i < count; i++) {
						System.out.print(value);
					}
				}
			}
			System.out.println();
		}
	}
}
