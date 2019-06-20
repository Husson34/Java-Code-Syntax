package Practice;

import java.util.ArrayList;
import java.util.Iterator;



public class CollectionsPractice2 {

	public static void main(String[] args) {
		// 2.Create an arrayList of words. Remove every word that ends with “e”.

		ArrayList<String> words=new ArrayList<String>();
		words.add("coffee");
		words.add("milk");
		words.add("water");
		words.add("soda");
		words.add("juice");
		
		Iterator<String> ewords=words.iterator();
			while (ewords.hasNext()) {
				String word=ewords.next();
				if (word.endsWith("e")) {
					ewords.remove();
				}
			}
			System.out.println(words);
		}
	}


