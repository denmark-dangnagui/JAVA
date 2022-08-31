class Cal{
	public int sum(int v1, int v2) {
		return v1 + v2;
	}
	// java는 한클래스에서 같은 이름의 메쏘드를 가질 수 있는데 형태가 바뀌면 같은 이름의 메쏘드를 가질 수 있는데
	// 이것을 Overloading이라고한다.  -> 상속과 연관 없
	public int sum(int v1, int v2, int v3) {
		return this.sum(v1,v2) + v3;
	}
	
	
} 
class Cal3 extends Cal{
	public int minus(int v1, int v2) {
		return v1 - v2;
	}
	public int sum(int v1, int v2) {  
		System.out.println("Cal3!!");
		return super.sum(v1, v2); // super를 통해서 부모클래스를 호출 해서 계승한다.
	}
  // 부모클래스가 가지고 있는 똑같은 이름의 메쏘드를 보수함. 이러한 것을 'Overriding'이라고 한다 즉 재정의라고 함.
}
//상속을 통해서 코드의 재사용성을 높이고, 유지보수의 편의성을 높이고, 가독성을 높이고,
// 코드의 양을 줄이는 목적을 가지고 있다.
public class InheritanceApp {
	public static void main(String[] args) {
		Cal c = new Cal();
		System.out.println(c.sum(2, 1, 1));
		
		Cal3 c3 = new Cal3();
		System.out.println(c3.minus(2,1));
		System.out.println(c3.sum(2, 1));
	}
}
// this 는 자식클래 super는 부모클래