package kr.or.ddit.ref;

/**
 * Class 오브젝트(클래스정보를 담고 있는 객체)를 생성해보기
 */
public class T01ClassObjectCreationTest {
/*
 	Java Reflection 에 대하여
 	1. 리플렉션은 런타임 시점에 클래스 또는 멤버변수, 메서드, 생성자 등에 대한 정보를 가져오거나 수정할 수 있고, 
 	   새로운 객체를 생성하거나 메서드를 실행할 수 있다.
 	   (컴파일 시점에 해당 정보를 알 수 없는 경우 (소스코드의 부재)에 유용하게 사용될 수 있다.)
 	2. 리플렉션 API는 java.lang.reflect 패키지와 java.lang.Class를 통해 제공된다.
 	3. java.lang.Class의 주요 메서듸
 		- getName(), getSuperClass(), getInterfaces(), getModifiers() 등
 	4. java.lang.reflect 패키지의 주요 클래스
 		- Field, Method, Constructor, Modifier 등.
 */
	
	public static void main(String[] args) throws ClassNotFoundException {
		// 방법 1 : Class.forName() 메서드 이용하기
		Class<?> klass = Class.forName("kr.or.ddit.ref.T01ClassObjectCreationTest");
		
		// 방법 2 : getClass() 메서드 이용하기 
		klass = new T01ClassObjectCreationTest().getClass();
		
		// 방법 3 : .class 이용하기
		klass = T01ClassObjectCreationTest.class;
	}
}
