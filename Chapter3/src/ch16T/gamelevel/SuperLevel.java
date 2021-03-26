package ch16T.gamelevel;

public class SuperLevel extends PlayerLevel{

	@Override
	public void run() {
		System.out.println("빨리 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("높이 jump 합니다.");
	}

	@Override
	public void turn() {
		System.out.println("턴 합니다.");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("******상급자 레벨입니다.******");
	}


}
