package ch15;

public class Taxi {

	String taxiName;
	int money;
	
	public Taxi(String taxiName, int money) {
		this.taxiName = taxiName;
		this.money = money;
	}
	
	public void take(int money) {
		this.money += 10000;
	}
	
	public void showTaxiInfo() {
		System.out.println(taxiName + "�ý�" + " ������" + money + "�� �Դϴ�.");
	}
}
