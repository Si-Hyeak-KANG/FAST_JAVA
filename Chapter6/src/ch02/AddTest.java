package ch02;

public class AddTest {

	public static void main(String[] args) {
		
		Add addL = (x, y) -> {return x+y;};//람다식 구현(함수)
		//매개 변수가 하나인 경우엔 자료형과 괄호 생략 가능
		//실행문이 한 문장인 경우 중괄호 생략 가능
		// 실행문이 한 문장이라도 반환문이면 생략 불가능. -> return을 지우면 됨.
		
		System.out.println(addL.add(2, 3));
	}

}
