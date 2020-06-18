package FirstJavaP;

import java.util.Scanner;

public class InputsOutputs {

	public static void main(String[] args) {
		System.out.println("Enter your name");
		
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		
		if (s.equals("Teo")) {
			System.out.println("Welcome Teo");
		}else if (s.equals ("Stam")) {
			System.out.println("Welcome Stam");
		}else {
			System.out.println("You are not welcome " + s);
		}
	}

}
