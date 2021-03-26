package ch15;

public class Guest {
	int money;
	String guestName;
	
	public Guest(int money, String guestName) {
		this.money = money;
		this.guestName = guestName;
	}
	
	public void takeTaxi(Taxi taxi) {
		taxi.take(10000);
		this.money -= 10000;
	}
	
	public void showInfo() {
		System.out.println(guestName + "���� ���� ���� " + money + "�� �Դϴ�.");
	}
}


