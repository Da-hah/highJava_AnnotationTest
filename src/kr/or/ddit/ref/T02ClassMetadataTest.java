package kr.or.ddit.ref;

import java.lang.reflect.Modifier;

public class T02ClassMetadataTest {
	public static void main(String[] args) {
		
		//클래스 오브젝트 생성하기
		Class<?> clazz = SampleVo.class; // >> SampleVo의 클래스 정보에 접근하기 위해 클래스 정보를 담은 오브젝트를 생성
		
		System.out.println("심플클래스명 : "+ clazz.getSimpleName());
		System.out.println("클래스명 : "+clazz.getName());
		System.out.println("상위클래스명 : " + clazz.getSuperclass().getName());
		
		//패키지 정보 가져오기
		Package pkg = clazz.getPackage();
		System.out.println("패키지 정보 : " + pkg.getName());
		
		//해당 클래스에서 구현하고 있는 인터페이스 목록 가져오기
		Class<?>[] interfaces = clazz.getInterfaces();
		
		System.out.println("인터페이스 목록 => ");
		for(Class<?> inf : interfaces) {
			System.out.println(inf.getName()+" | ");
		}
		System.out.println();
		
		//클래스의 접근제어자 정보 가져오기
		int modFlag = clazz.getModifiers();
		
		System.out.println("접근제어자 정보 : " + Modifier.toString(modFlag));
		
	}
}
