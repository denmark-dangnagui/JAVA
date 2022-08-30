public class MyOOP {	
	public static void main(String[] args) {
		
		print p1 = new print("****");
		p1.A();
		p1.A();
		p1.B();
		p1.B();
		
		print p2 = new print("----");
		p2.A();
		p2.A();
		p2.B();
		p2.B();
		
		p1.A();
		p2.A();
		p1.A();
		p2.A();
	
		
		// class는 static을 사용해서 변수나 메쏘드를 선언할 때 같이 사용해야 되지만,
		// instance는 반대로 static을 변수와 메쏘드에 사용하지 않고 선언을 해야 사용할 수 있다.
		// 더불어서 instance를 사용하게 된다면, 하나의 class에서 변수를 자주 바꿔줘야 되는 상황이 생긴다면,
		// 코드는 굉장히 지저분해지고 가독성이 떨어지게 될 것 이다. 그렇기 때문에 
		// instance를 사용해서 코드의 가독성을 높이고 깔끔하게 사용하게 된다면, 훨씬 좋은 코드를 만들 수 있다.
	}

}