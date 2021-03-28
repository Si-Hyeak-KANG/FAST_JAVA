package ch01;

class OutClass{
	
	private int num = 10;
	private static int sNum = 20;
	private InClass inClass;
	
	public OutClass() {
		inClass = new InClass();
	}
	
	private class InClass {
		
		int iNum = 100;
		
		//static int sInNum = 500; //�̳�Ŭ���� , ����Ŭ�������� ���������� ����� �� ����--> �������� Ŭ�������� ����ؾ���.
		
		void inTest() {
			System.out.println("OutClass num = " + num +"(�ܺ� Ŭ������ �ν��Ͻ� ����)");
			System.out.println("OutClass sNum = " + sNum + "(�ܺ� Ŭ������ ����ƽ ����)");
			System.out.println("InClass inNum = " + iNum + "(���� Ŭ������ �ν��Ͻ� ����)");
		}
	}
	public void usingClass() {
		inClass.inTest();
	}//outClass�� �޼���
	
	static class InStaticClass {
		
		int iNum = 100;
		static int sInNum = 200;
		
		void inTest() {
			//System.out.println("OutClass num = " + num +"(�ܺ� Ŭ������ �ν��Ͻ� ����)");//�ܺ�Ŭ������ �ν��Ͻ� ���� ���Ұ�
			System.out.println("InClass num = " + iNum +"(���� Ŭ������ �ν��Ͻ� ����)");
			System.out.println("OutClass sNum = " + sNum + "(�ܺ� Ŭ������ ����ƽ ����)");
			System.out.println("InClass sNum = " + sInNum + "(���� Ŭ������ ����ƽ ����)");
		}
		
		static void sTest() {
			
			//System.out.println("InClass num = " + iNum +"(���� Ŭ������ �ν��Ͻ� ����)"); ���
			System.out.println("OutClass sNum = " + sNum + "(�ܺ� Ŭ������ ����ƽ ����)");
			System.out.println("InClass sNum = " + sInNum + "(���� Ŭ������ ����ƽ ����)");
		}	//����ƽ Ŭ������ ����ƽ �޼���
	}//�������� Ŭ����
}
public class InnerTest {
	public static void main(String[] args) {
		
		OutClass outClass = new OutClass();
		outClass.usingClass();
		
		System.out.println();
		
		//OutClass.InClass inner = outClass.new InClass();//���������δ� ���������� �̷��Դ� �� �Ⱦ�. --> InClass�� private �̸� ����
		//inner.inTest();
		
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		sInClass.inTest();
		System.out.println();
		
		OutClass.InStaticClass.sTest();
	}

}
