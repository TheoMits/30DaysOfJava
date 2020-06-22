package reading_from_a_file;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Rd_fm_fl {

	public static void main(String[] args) throws FileNotFoundException  {  
		File file = new File("C:\\Users\\2j\\Desktop\\test.txt");
		Scanner in = new Scanner(file);
		
		while (in.hasNextLine()) {
			System.out.println(in.nextLine());
		}
		in.close();

	}

}
