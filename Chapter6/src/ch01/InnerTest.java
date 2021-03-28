package ch01;

class OutClass{
	
	private int num = 10;
	private static int sNum = 20;
	private InClass inClass;
	
	public OutClass() {
		inClass = new InClass();
	}
	
	private class InClass {
		
		int iNum = 100;
		
		//static int sInNum = 500; //이너클래스 , 내부클래스에는 정적변수를 사용할 수 없음--> 정적내부 클래스에서 사용해야함.
		
		void inTest() {
			System.out.println("OutClass num = " + num +"(외부 클래스의 인스턴스 변수)");
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
			System.out.println("InClass inNum = " + iNum + "(내부 클래스의 인스턴스 변수)");
		}
	}
	public void usingClass() {
		inClass.inTest();
	}//outClass의 메서드
	
	static class InStaticClass {
		
		int iNum = 100;
		static int sInNum = 200;
		
		void inTest() {
			//System.out.println("OutClass num = " + num +"(외부 클래스의 인스턴스 변수)");//외부클래스의 인스턴스 변수 사용불가
			System.out.println("InClass num = " + iNum +"(내부 클래스의 인스턴스 변수)");
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
			System.out.println("InClass sNum = " + sInNum + "(내부 클래스의 스태틱 변수)");
		}
		
		static void sTest() {
			
			//System.out.println("InClass num = " + iNum +"(내부 클래스의 인스턴스 변수)"); 사용
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
			System.out.println("InClass sNum = " + sInNum + "(내부 클래스의 스태틱 변수)");
		}	//스태틱 클래스의 스태틱 메서드
	}//정적내부 클래스
}
public class InnerTest {
	public static void main(String[] args) {
		
		OutClass outClass = new OutClass();
		outClass.usingClass();
		
		System.out.println();
		
		//OutClass.InClass inner = outClass.new InClass();//문법적으로는 가능하지만 이렇게는 잘 안씀. --> InClass가 private 이면 오류
		//inner.inTest();
		
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		sInClass.inTest();
		System.out.println();
		
		OutClass.InStaticClass.sTest();
	}

}
