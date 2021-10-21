package ex08class;

class ChildProperty {
	
	//멤버변수
	int bead; //어린이가 보유한 구슬의 개수
	
	//생성자: 객체생성시 구스르이 개수를 전달 받아 초기화
	public ChildProperty(int i)
	{
		this.bead = bead;
	}
	
	//멤버메서드
	void showProperty() {
		System.out.printf("보유 구슬의 개수: %d\n", bead);
	}
	/*
	 해당 멤버메서드의 호출의 주체가 되는 객체가 beadCnt만큼 획득하고
	 매개변수로 전달되는 child객체는 구슬을 잃게 된다.
	 */
	void obtainBead(ChildProperty child, int beadCnt) {
		this.bead += beadCnt;
		child.bead -= beadCnt;
		System.out.println("##한 게임 종료##");
		
	}
	
}

public class QuMarbles_T
{

	public static void main(String[] args)
	{
		ChildProperty child1 = new ChildProperty(20);
		ChildProperty child2 = new ChildProperty(15);

		System.out.println("게임 전 구슬의 보유 개수");
		System.out.print("어린이1 : ");
		child1.showProperty(); 
		System.out.print("어린이2 : ");
		child2.showProperty(); 

		/*1차게임 : 어린이1은 어린이2의 구슬 5개 획득*/
		child1.obtainBead(child2, 5);

		/*2차게임 : 어린이2가 어린이1의 구슬 9개 획득*/
		child2.obtainBead(child1, 9);

		System.out.println("\n게임 후 구슬의 보유 개수");
		System.out.print("어린이1 : ");
		child1.showProperty(); 
		System.out.print("어린이2 : ");
		child2.showProperty();

	}

}
