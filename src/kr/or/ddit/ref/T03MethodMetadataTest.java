package kr.or.ddit.ref;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * 클래스에 선언된 메서드의 메타정보 가져오기
 */
public class T03MethodMetadataTest {
	public static void main(String[] args) throws ClassNotFoundException {
		//Class 객체 생성
		Class<?> klass = Class.forName("kr.or.ddit.ref.SampleVo");
		
		//클래스에 선언된 모든 메서드 정보 가져오기
		Method[] methodArr = klass.getDeclaredMethods(); //선언한 메서드 갖고오기 
		
		for(Method m : methodArr) {
			System.out.println("메서드 명 : " + m.getName());
			System.out.println("메서드 리턴타입 : " + m.getReturnType());
			
			//해당 메서드의 접근제어자 정보 가져오기
			int modFlag = m.getModifiers();
			System.out.println("메서드 접근제어자 : " + Modifier.toString(modFlag));
			
			//해당 메서드의 파라미터 정보 가져오기 
			Class<?>[] paramArr = m.getParameterTypes();
			System.out.println("메서드 파라미터 타입 =>");
			for(Class<?> clazz : paramArr) {
				System.out.println(clazz.getName() + " | ");
			}
			System.out.println();
			
			// 해당 메서드에서 던지는 예외 타입 가져오기
			Class<?>[] exTypeArr = m.getExceptionTypes();
			System.out.println("메서드에서 던지는 예외타입 목록");
			for(Class<?> clazz : exTypeArr) {
				System.out.println(clazz.getName()+" | ");
			}
			System.out.println();
			
			//해당 메서드에 존재하는 Annotation 타입 정보 가져오기 
			Annotation[] annos = m.getDeclaredAnnotations();
			System.out.println("Annotation 타입 => ");
			for(Annotation anno : annos) {
				System.out.println(anno.annotationType().getName()+" | ");
			}
			System.out.println();
			System.out.println("-------------------------------------------------");
		}
	}
}
