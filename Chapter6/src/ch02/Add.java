package ch02;


@FunctionalInterface //에노테이션(annotation) 컴파일러에게 정보전달
public interface Add {
	
	public int add(int x, int y);

}//함수형 인터페이스 , Functional Interface
// 단 하나의 메서드만 선언해야함. 
