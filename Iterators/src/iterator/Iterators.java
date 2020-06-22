package iterator;

import java.util.Iterator;
import java.util.LinkedList;

public class Iterators {

	public static void main(String[] args) {
			LinkedList<String> names = new LinkedList<String>();
			names.push("John"); 
			names.push("Teo"); 
			names.push("Paul");
			
			Iterator<String> it = names.iterator();
				
			while(it.hasNext()) {
				System.out.println(it.next() + "(while)");
			}
			
			for(String s: names) {
				System.out.println(s + "(for)");
			}
		}
		
}
