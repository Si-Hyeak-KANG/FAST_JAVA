package ch19T;

public class CarFactoryTest {

	public static void main(String[] args) {

		CarFactory factory = CarFactory.getInstance();//�̱��� ����
		Car mySonata = factory.creatCar();
		Car yourSonata = factory.creatCar();
		
		System.out.println(mySonata.getCarNum()); // 10001���
		System.out.println(yourSonata.getCarNum());//10002���
	}

}
