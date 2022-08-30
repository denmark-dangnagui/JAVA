class Greeting{
	//public, protected, default, private
		public static void hi() {
			System.out.println("Hi!");
		}
}

public class AccessLevelModifiiersMethod {
	public static void main(String[] args) {
		Greeting.hi();
	}
}

// 간단하 결과적으로 public private 은 같은 class 에 있을 때 쓸 수 있냐 없냐 차이라고 생각하면 될듯.