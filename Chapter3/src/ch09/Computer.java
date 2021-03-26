package ch09;

public abstract class Computer {
	//추상클래스는 상속을 위해 만듦.
	public abstract void display();
	public abstract void typing();
	
	void turnOn() {
	
		System.out.println("전원을 켭니다");
	}
	
	void turnOff() {
		
		System.out.println("전원을 끕니다");
	}
	
	
}
