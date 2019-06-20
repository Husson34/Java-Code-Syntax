package Practice;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionPractice {

	public static void main(String[] args) {
		// 1.Create an arraylist of cars and retrieve all the values using 4 different ways.
		ArrayList<String> list=new ArrayList<String>();
		list.add("toyota");
		list.add("BMW");
		list.add("Accura");
		list.add("Honda");
		list.add("Kia");
		System.out.println(list);
		for (int i=0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
		for (Object i:list) {
			System.out.print("for each loop---"+i);
		}
		Iterator<String> it=list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		int i=0;
		while(list.size()>i) {
			String cars=list.get(i);
			System.out.println("while loop--- "+cars);
			i++;
			
		}
	}

}
