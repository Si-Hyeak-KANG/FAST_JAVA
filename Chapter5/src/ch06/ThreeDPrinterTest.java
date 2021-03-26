package ch06;

public class ThreeDPrinterTest {

	public static void main(String[] args) {

		Powder powder = new Powder();
		ThreeDPrinter3 printer = new ThreeDPrinter3();
		
		printer.setMaterial(powder);
		
		Powder p = (Powder)printer.getMaterial();//강제 형변환,,번거러움-> generic제네릭 클래스 사용	
		}

}
