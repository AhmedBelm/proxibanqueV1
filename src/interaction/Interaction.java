package interaction;

import java.util.Scanner;

public class Interaction {

	String message;
	
	Scanner keyboardInput = new Scanner(System.in);

	public void display(String message) {
		System.out.println(message);
		
	}
		
		

	public String readData() {
		
		String answer = keyboardInput.nextLine();
		return answer;
		
		
	}

}	
	
	