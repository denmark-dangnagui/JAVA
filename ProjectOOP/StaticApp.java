class foo{
	public static String classVar = "I class var";
	public String instanceVar = "I instance var";
	
	
	public static void classMethod() {
		System.out.println(classVar);
//		System.out.println(instanceVar); // Error
	}
	public void instanceMethod() {
		System.out.println(classVar); // instance메소드에서도 static을 사용한 class변수는 사용가능하다.
		System.out.println(instanceVar);
	}
}

public class StaticApp {
	public static void main(String[] args) {
		System.out.println(foo.classVar);  // OK
//		System.out.println(foo.instanceVar); // Error
		
		foo.classMethod();
//		foo.instanceMethod(); // 단순히 인스턴스 메쏘드를 클래스를 통해서 호출할 수는 없다.
		
		foo f1 = new foo();
		foo f2 = new foo();
		
		System.out.println(f1.classVar);
		System.out.println(f1.instanceVar);
		
		f1.classVar = "changed by f1";
		System.out.println(foo.classVar); // changed by f1
		System.out.println(f2.classVar); // changed by f1
		
		f1.instanceVar = "changed by f1";
		System.out.println(f1.instanceVar); // change by f1
		System.out.println(f2.instanceVar); // I instance var
		
		// --> 위에 것들을 글로 설명하면 아래의 글이 됨.
		
		// instance의 주체가 되는 class의 변수가 바뀐다면, 모든 instance안에 있는 class 변수, 메쏘드의 값은 바뀐다.
		// 그런데 instance 안에서의 instance변수나 메쏘드는바뀐다고 주체가 되는 class안에서까지 변하지는 않지만,
		// instance안에 있는 class의 변수나 메쏘드들은 class를 가리키고 있는 것이므로,instance에서 변한다면 
		// 주체가 되는 class에서도 바뀐다. 즉 가리키고 있는 것이므로, 하나의 instance에서 class 변수나 메쏘드를 바꾼다면,
		// 주체가 되는 class의 값이 바뀌는 것이므로, 모든 instance들이 가지고 있는 class의 값이 바뀌는 것. 
		
		
		// 즉 결과적으로, static이 있으면, class 소속
		// static이 없으면 , instance 소속이다.
		
	}

}
