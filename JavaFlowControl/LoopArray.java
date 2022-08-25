
public class LoopArray {

	public static void main(String[] args) {
		
		/*
	 	<li>egoing</li>
	 	<li>jinhuck</li>
	 	<li>yubin</li>	 
		 */
		
		String[] users = new String[2];
		users[0] ="egoing";
		users[1] ="jinhuck";
		
		
		
		for(int i = 0 ; i<users.length; i++) {
			System.out.println(users[i]+",");
		}	
	}
}