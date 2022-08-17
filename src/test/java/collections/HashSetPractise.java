package collections;

// *HashSet is an unordered collection and doesn't maintain any order.package collections;
//	*but we can predict it in LinkedHashSet

	/* HashSet
	 * 	It implements Set Interface. 
	 *  It is backed by a hash table, (actually a HashMap instance).
	 *  This class permits the null element.
	 * 	Its not synchronized
	 * 	Does not maintain order
	 * 	Declaring HashSet
	  		HashSet set = new HashSet();
			Set set0 = new HashSet();
			HashSet<String> set1 = new HashSet<String>();
			HashSet<String> set2 = new HashSet<String>(12);
			HashSet<String> set3 = new HashSet<String>(set2);
			HashSet<String> set4 = new HashSet<String>(12, 0.75f);
			Set s = Collections.synchronizedSet(new HashSet(...));
	 *	Useful methods in Hashset
	 * 		All the methods declared in Collection and Set interfaces are implemented in this class and along with that we have below methods
	 * 		clone();
	 * 			Since CLone() method returns Objects, we need to cast Object to HashSet
	 * 		 		
	 */

import java.util.HashSet;
import java.util.Iterator;
import java.util.stream.Stream;

public class HashSetPractise {

	static int a;
	static boolean b;
	public static void HashSetMethod()	{
		HashSet<Integer> sone= new HashSet<Integer>();
		HashSet<Integer> stwo= new HashSet<Integer>();
		HashSet<Integer> sthree= new HashSet<Integer>();
		
		System.out.println("Adding elements in Hashset");
//		Doesnot return the duplicate values when we print
		sone.add(1);
		sone.add(2);
		sone.add(3);
		sone.add(3);
		sone.add(4);
		System.out.println(sone);
		a=sone.size();
		System.out.println(a);
		
		stwo.add(5);
		stwo.add(6);
		stwo.add(7);
		
		
		System.out.println("Before adding all to one set");
		System.out.println(sone);
		System.out.println(stwo);
		b=sone.addAll(stwo);
		System.out.println(b);
		System.out.println("After adding all to one set");
		System.out.println(sone);
		System.out.println(stwo);
		
		sthree.add(100);
		sthree.add(200);
		System.out.println("Before clearing the data");
		System.out.println(sthree);
		sthree.clear();
		
		System.out.println("Before clearing the data");
		System.out.println(sthree);
		
		System.out.println("After cloning");
		Object o=sone.clone();
		System.out.println(o);
		
		b=sone.contains(2);
		System.out.println("sone contains value 2 "+b);
		
		b=sone.contains(0);
		System.out.println("sone doesnot contains value 0 "+b);
		
//		sthree.add(100);
//		sthree.add(200);
		
		System.out.println("Doubt");
		System.out.println(sone);
		System.out.println(sthree);
		b=sone.containsAll(sthree);
		System.out.println(b);
		
		System.out.println(sone);
		System.out.println(stwo);
		b=sone.containsAll(stwo);
		System.out.println(b);
		
		System.out.println("Should have Equals the element present in both the set");
		b=sone.equals(stwo);
		System.out.println(b);
		
		System.out.println("Hashcode for the set");
		a=sone.hashCode();
		System.out.println(a);
		
		System.out.println("To find whether set is empty or not");
		System.out.println(sone);
		b=sone.isEmpty();
		System.out.println(b);
		
		System.out.println(sthree);
		b=sthree.isEmpty();
		System.out.println(b);
		
		System.out.println("Using iterator to print values");
		Iterator<Integer> i=sone.iterator();
		while(i.hasNext()) {
			o=i.next();
			System.out.println(o);
		}
		
//		Stream<Integer> str=sone.parallelStream();
//		System.out.println(str);
		
		System.out.println("Removing values from Iterator");
		System.out.println(sone);
		b=sone.remove(2);
		System.out.println(b);
		
		sthree.add(100);
		sthree.add(200);
		System.out.println(sthree);
		b=sthree.removeAll(sthree);
		System.out.println(b);
		System.out.println("After removing"+sthree);
		
		System.out.println("Before retaining");
		System.out.println(sone);
		System.out.println(stwo);
		a=sone.size();
		System.out.println("size of sone  " +a);
		b=sone.retainAll(stwo);
		System.out.println(b);
		
		
		System.out.println("After retaining");
		System.out.println(sone);
		System.out.println(stwo);
		
		a=sone.size();
		System.out.println("size of sone after retaining  " +a);
		
//		sone.
//		sone.removeIf(null)
		
		
	}
	public static void main(String[] args) {
		HashSetMethod();
	}

}
