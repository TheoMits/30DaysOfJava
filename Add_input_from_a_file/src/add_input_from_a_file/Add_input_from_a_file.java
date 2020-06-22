package add_input_from_a_file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Add_input_from_a_file {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner sc = new Scanner(new File("C:\\Users\\2j\\Desktop\\test.txt"));
		
		List<String> test = new ArrayList<String>();
		
		while(sc.hasNextLine()) {
			test.add(sc.nextLine());
		}
		
		for(int i=0; i<test.size();i++) {
			System.out.println("name: " + test.get(i));
		}
		
		sc.close();
	}

}
