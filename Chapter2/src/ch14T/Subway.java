package ch14T;

public class Subway {

	int lineNumber;
	int passengerCount;
	int money;
	
	public Subway(int linerNumber) {
		this.lineNumber = linerNumber;
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showSubwayInfo() {
		System.out.println(lineNumber + "�� ����ö�� �°���" + passengerCount + "�� �̰�, ������" + money + "�� �Դϴ�.");
	}
}
