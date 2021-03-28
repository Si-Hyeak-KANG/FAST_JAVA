package ch07;

public class GenericPrinterTest {

	public static void main(String[] args) {

		Powder powder = new Powder();
		
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();//어떤 자료형 쓸지 지정 ,,, <> 는 다이아몬드 연산자라고 한다. 
		//java10부터는 var powderPrinter = new GenericPrinter(); 지역변수 자료형 추론 사용감가능 
		//타입을 지정을 안할 시 --> 아래에 powderPrinter는 object형으로 인식
		powderPrinter.setMaterial(powder);
		
		Powder p = powderPrinter.getMaterial();
		System.out.println(powderPrinter.toString());
		
	}

}
