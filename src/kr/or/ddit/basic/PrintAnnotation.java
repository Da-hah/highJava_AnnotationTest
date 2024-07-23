package kr.or.ddit.basic;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
 		Annotation에 대하여 ...
 		프로그램 소스코드 안에 다른 프로그램을 위한 정보로를 미리 약속된 형식으로 포함시킨것(JDK1.5부터 지원)
 		
 		주석처럼 프로그램에 영향을 미치지 않으면서도 다른 프로그램에게 유용한 정보를 제공함
 		
 		종류 : 1. 표준애너테이션 
 			 2. 메타애너테이션(애너테이션을 위한 애너테이션, 즉 애너테이션을 정의할 때 사용하는 애너테이션)
 	 	
 	 	애너테이션 타입 정의하기
 	 	@interface 애너테이션이름{
 	 		요소타입 타입요소이름();  //반환값이 있고 매개변수는 없는 추상메서드의 형태
 	 	}
 	 	
 	 	애너테이션 요소의 규칙
 	 	1. 요소타입은 기본형, String, enum, annotation, Class만 허용
 	 	2. ()안에 매개변수를 선언할 수 없다.
 	 	3. 예외를 선언할 수없다.
 	 	4. 요소타입에 제너릭타입글자를 사용할 수 없다.
 */

@Target({ElementType.METHOD}) // 적용 가능 대상 지정함 , 여러개 지정하고 싶으면 중괄호로 감싸고 중괄호 안에서 콤마로 구분한다.
@Retention(RetentionPolicy.RUNTIME) // 유지되는 기간 지정함, 디폴트는 class  
public @interface PrintAnnotation {
	String value() default "-"; //디폴트 값을 지정해주고 싶을때 default 키워드 사용 
	int count() default 20;
}
