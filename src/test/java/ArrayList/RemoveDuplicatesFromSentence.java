package ArrayList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Spliterator;

public class RemoveDuplicatesFromSentence {
	
	static String sentence = "You can have all of your step definitions in one file, or in multiple files. When you start with your project, all your step definitions will probably be in one file. As your project grows, you should split your step definitions into meaningful groups in different files.";
	
	public static void removeDuplicate(String sen) {
		String[] arr = sen.replace(",", "").replace(".", "").toLowerCase().split(" ");
		HashSet<String> hs = new HashSet<String>();
		hs.add(sen);
//		printArrayList(hs);
		int a = 0;
		HashMap<String,Integer> hasmap = new HashMap<String,Integer>();
		for( int i = 0 ; i < hs.size(); i++) {
			for(int j = 0 ; j < arr.length;j++) {
				if((hs..equalsIgnoreCase(arr[j])) {
					a++;
				}
			}
//			System.out.println(arr[i]+" : "+a);
			hasmap.put(ab, a);
		}
		for(Map.Entry<String, Integer> m : hasmap.entrySet()) {
			System.out.println(m.getKey()+" : "+m.getValue());			
		}
//		System.out.println("The given value of key");
		int a1 = 31;
		for(Map.Entry<String, Integer> m : hasmap.entrySet()) {
			if(m.getValue() == a1) {
				System.out.println(m.getKey());
			}
		}

	}
	
	public void convertArrayListToHashSet(ArrayList<String> li) {
		HashSet<String> hs = new HashSet<String>(li);
		printHashSet(hs);
	}
	
	public void convertArrayListToHashSet1(ArrayList<String> li, HashSet<String> hs) {
		hs = new HashSet<String>(li);
	}
	
	public static HashSet<String> returnHashSet() {
		HashSet<String> hs = new HashSet<String>();
		return hs;
	}
	
	public static void printArrayList(ArrayList<String> sen) {
		for(String eachArrayList : sen ) {
			System.out.println(eachArrayList);
		}
	}
	
	public static void printHashSetUsingIterator(HashSet<String> set) {
		Iterator<String> ite = set.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
		
	}
	
//	public static void printHashSetUsingSplitIterator(HashSet<String> set) {
//		Spliterator<String> st = set.spliterator();
//		while(st.) {
//			System.out.println(ite.next());
//		}
//		
//	}

	public static void main(String[] args) {
		removeDuplicate(sentence);

//		System.out.println(createHashSet());


	}

}
