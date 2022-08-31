interface Calculable{ // interface를 사용하면 클래스를 사용할 때 implements로 연결시켜 준다면, 만들어져야하 형식이 주어진 것이므로무조건 그 형식을 가지고 있어야 한다는 것.
	int sum(int v1, int v2);
	double PI = 3.14;
}
interface Printable{		// interface를 정의할 때 메쏘드는인자가 즉 설명이 없지만, 변수는 설명이 있어야 
	void print();
}
class Realcal implements Calculable, Printable{ // 하나의 class는 여러개의 interface를 구현 할 수 있다.
	public int sum (int v1, int v2) {
		return v1 + v2;
	}
	public void print() {
		System.out.println("This is Realcal!!");
	}
}
class dummycal implements Calculable{
	public int sum(int v1, int v2) {
		return 3;
	}
}

public class InterfaceApp {
	public static void main(String[] args) {
		Realcal c = new Realcal();
		System.out.println(c.sum(1, 4));
		c.print();
		System.out.println(c.PI);
	}

}

//하나의 클래스에는 하나의 인터페이스만 올 수 있나. 