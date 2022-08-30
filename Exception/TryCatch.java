
public class TryCatch {

	public static void main(String[] args) {
		System.out.println(1);
		int [] scores = {10,20,30};
		try {
			System.out.println(scores[4]);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("잘못된 인덱스네요.");
		}
		try {
			System.out.println(2/0);
		} catch (ArithmeticException e) {
			System.out.println("잘못된 계산이네요.");
		}
		System.out.println(3);
	}

}
