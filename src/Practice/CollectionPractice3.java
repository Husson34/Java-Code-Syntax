package Practice;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionPractice3 {

	public static void main(String[] args) {
		// 3.Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water.

		
		ArrayList<String> words=new ArrayList<String>();
		words.add("coffee");
		words.add("milk");
		words.add("water");
		words.add("soda");
		words.add("juice");
		
		for (int i=0;i<words.size();i++) {
			String str=words.get(i);
				if (str.contains("e")||str.contains("a")){
				
					words.set(i,"water");
					
					
				}
			}
		System.out.println(words);
		
	}

}
