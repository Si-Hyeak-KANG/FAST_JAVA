package ch15;

public class TaxiTest {

	public static void main(String[] args) {

		Guest guestE = new Guest(20000, "Edward");
		
		Taxi taxi = new Taxi("�� ���� ���", 0);
		guestE.takeTaxi(taxi);
		
		guestE.showInfo();
		taxi.showTaxiInfo();
	}

}
