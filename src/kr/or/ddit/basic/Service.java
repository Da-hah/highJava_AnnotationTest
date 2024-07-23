package kr.or.ddit.basic;


public class Service {
//	@PrintAnnotation // annotation을 지정할 수 있는 타입을 메서드로 지정해 두었기 때문에 필드멤버에 붙였을 때 오류 발생! 
//	private String name;
	
	@PrintAnnotation //내가 정의한 annotation
	public void method1() {
		System.out.println("메서드1이 호출되었습니다.");
	}
	@PrintAnnotation("%") // 묵시적으로 value만 썼을때는 오류 발생 x  
	public void method2() {
		System.out.println("메서드2이 호출되었습니다.");
	}
	@PrintAnnotation(value = "#", count = 25)
	public void method3() {
		System.out.println("메서드3이 호출되었습니다.");
	}
}
