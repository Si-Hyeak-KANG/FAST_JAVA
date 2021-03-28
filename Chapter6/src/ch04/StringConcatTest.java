package ch04;

public class StringConcatTest {

	public static void main(String[] args) {

		String s1 = "Hello";
		String s2 = "World";
		
		StringConcatImpl strImpl = new StringConcatImpl();
		strImpl.makeString(s1, s2);
		
		StringConcat concat = (s, v)->System.out.println(s +"," + v);
		concat.makeString(s1, s2);
		
		StringConcat concat2 = new StringConcat() {

			@Override
			public void makeString(String s1, String s2) {
				System.out.println(s1 + "....." + s2);
			}
			
			
		};
		concat2.makeString(s1, s2);
	}

}
//자바에서는 객체 없이 메서드가 호출 될 수 없음
//람다식을 구현하면 익명 내부 클래스가 만들어지고, 이를 통해 익명 객체가 생성됨.
//람다식은 자바8 이후 가능