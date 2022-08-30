
public class TryCatch {

	public static void main(String[] args) {
		System.out.println(1);
		int [] scores = {10,20,30};
		
		try {
//			System.out.println(scores[4]);
			System.out.println(2/0);
		} catch (Exception e) {
			System.out.println("먼가 이상합니다. 오류가 발생했습니다.");
		}
		System.out.println(3);
	}
}
    