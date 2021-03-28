package ch01;

class Outer2 {
	
	int outNum = 100;
	static int sNum = 200;
	
	Runnable getRunnable(int i) {
		
		int num = 10; //매개변수 int i 와 int num 은 스택메모리
		
		return new Runnable() {
			
			int localNum = 1000;
			@Override
			public void run() {
			
				//i = 100; 값 변경불가
				System.out.println("i = " + i);
				System.out.println("num = " + num);
				System.out.println("localNum = " + localNum);
				
				System.out.println("outNum = " + outNum + "(외부 클래스 인스턴스 변수)");
				System.out.println("Outter.sNum = " + Outer2.sNum + "(외부 클래스 정적 변수)");
			}
			
		};
	} //클래스를 스레드화
	
	Runnable runnable = new Runnable() {

		@Override
		public void run() {

			System.out.println("Runnable class");
		}
		
	};//익명 내부 클래스
	
}

	public class AnonumousInnerTest {
	
		public static void main(String[] args) {

			Outer2 out = new Outer2();
			Runnable runner = out.getRunnable(100);
			
			runner.run();
			
			out.runnable.run();
		}
	
	}


