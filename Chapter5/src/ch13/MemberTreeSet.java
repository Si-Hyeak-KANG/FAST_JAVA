package ch13;


import java.util.Iterator;
import java.util.TreeSet;

public class MemberTreeSet {

	private TreeSet<Member> treeSet;
	
	public MemberTreeSet() {
		treeSet = new TreeSet<Member>(new Member());//comparable일 경우엔 treeset = new TreeSet<>() 이렇게 해도 구현 가능
		//Comparator일 경우에는 디폴트 컨스트럭터를 지정해줘야 함.
	}
		
	public void addMember(Member member) {
		treeSet.add(member);
	}
	
	public boolean removeMember(int memberId) {
		
		
		Iterator<Member> ir = treeSet.iterator();
		
		while(ir.hasNext()) {
			
			Member member = ir.next();
			int tempId = member.getMemberId();
			
			if( tempId == memberId) {
				treeSet.remove(member);
				return true;
			}
		}
		
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
	
	public void showAllMember() {
		for( Member member : treeSet) {
			System.out.println(member); //*(-1); --> 내림차순
		}
		System.out.println();
	}
}




