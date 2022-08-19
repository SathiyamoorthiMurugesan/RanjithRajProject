package wrapper;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Spliterator;

public class RemoveDuplicatesFromSentence {
	
	static String sentence = "You can have all of your step definitions in one file, or in multiple files. When you start with your project, all your step definitions will probably be in one file. As your project grows, you should split your step definitions into meaningful groups in different files.";
	
	public static void removeDuplicate(String sen) {
		String[] arr = sen.replace(",", "").replace(".", "").toLowerCase().split(" ");
		HashSet<String> hs = new HashSet<String>();
		for(String eachString : arr) {
			hs.add(eachString);
		}
//		System.out.println(hs);
		printHashSet(hs);
	}
	
	public void convertArrayListToHashSet(ArrayList<String> li) {
		HashSet<String> hs = new HashSet<String>(li);
		printHashSet(hs);
	}
	
	public void convertArrayListToHashSet1(ArrayList<String> li, HashSet<String> hs) {
		hs = new HashSet<String>(li);
	}
	
	public static HashSet<String> createHashSet() {
		HashSet<String> has = new HashSet<String>();
		has.add("Book");
		has.add("Pencil");
		has.add("Pen");
		has.add("Eraser");
		
		return has;
	}
	
	public static HashSet<String> returnHashSet() {
		HashSet<String> hs = new HashSet<String>();
		return hs;
	}
	
	public static void printHashSet(HashSet<String> sen) {
		for(String eachHashSet : sen ) {
			System.out.println(eachHashSet);
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
//		removeDuplicate(sentence);
		printHashSet(createHashSet());
//		System.out.println(createHashSet());
		printHashSetUsingIterator(createHashSet());

	}

}
