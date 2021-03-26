package ch04;

import ch02.MyArray;
//Last in First out
public class MyArrayStack {

	MyArray arrayStack;//¸â¹ö º¯¼ö´Â ÀÚµ¿ initialize -> °´Ã¼: null int : 0 boolean : false
	int top;
	
	public MyArrayStack() {
		top = 0;
		arrayStack = new MyArray();
	}
	
	public MyArrayStack(int size) {
		top = 0;
		arrayStack = new MyArray(size);
	}
	
	public void push(int data) {
		//¹è¿­·ù´Â ²Ë Ã¡´ÂÁö ¸ÕÀú Ã¼Å©
		if ( isFull() ) {
			System.out.println("Stack is full");
			return;
		}
		arrayStack.addElement(data);
		top++;
	}
	
	public int pop() {
		if( isEmpty()) {
			
			
			System.out.println("stack is empty");
			return MyArray.ERROR_NUM;
		}
		return arrayStack.removeElement(--top);
	}
	
	public int peek() {
		if( isEmpty()) {
			
			
			System.out.println("stack is empty");
			return MyArray.ERROR_NUM;
		}
		return arrayStack.getElement(--top);
	}
	
	public boolean isFull() {
		
		if(top == arrayStack.ARRAY_SIZE) {
			return true;//²Ë Ã¡´Ù.
		}
		else return false;
	}
	
	public boolean isEmpty() {
		
		if( top == 0) {
			
			return true;
		}
		else return false;
	}
	
	
	public void printAll() {
		arrayStack.printAll();
	}
	
}
