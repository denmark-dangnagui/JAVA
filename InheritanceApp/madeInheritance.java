class cal{
	int v1,v2;
	cal(int v1, int v2){
		this.v1 = v1;
		this.v2 = v2;	
	}
}
class cal3 extends cal{

	cal3(int v1, int v2) {  // 부모 클래스가 인자를 받는다면, 자식 클래스도 부모가 쓰는 메쏘드를 사용하므로, 
		super(v1, v2);		// 자식 클래스도 super를 통해 부모의 인자를 받아오는 자신과 같은 이름으로 메쏘드를 만들어 받아야 사용할 수 있다.
		System.out.println("Cal3 init!!");
	}
	
}

public class madeInheritance {

	public static void main(String[] args) {
		cal c = new cal(2,1);
		cal3 c3 = new cal3(2,1);
		
	}

}
