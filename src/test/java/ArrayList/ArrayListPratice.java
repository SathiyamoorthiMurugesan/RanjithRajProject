package ArrayList;

import java.util.*;

public class ArrayListPratice {
	
	public static ArrayList<Integer> addValuesInList(){
		ArrayList carlist = new ArrayList();
		
		carlist.add("BMW");
		carlist.add("Audi");
		carlist.add("Benz");
		carlist.add("Lambo");
		carlist.add("Jaquar");
		carlist.add(2, "Tata");
		return carlist;
	}
	public static ArrayList<String> getSizeFromArrayList(ArrayList carlist) {
		System.out.println("*******Return the size of an car List*******");
		System.out.println("Valuse of car list are :"+carlist);
		System.out.println("Size of car list after addition: "+carlist.size());
		System.out.println();
		return carlist;
	}
	
	public static void removesGivenValueFromArrayList(ArrayList carlist){
		System.out.println("*******Remove values from the car List*******");
		System.out.println("Remove given index value from the car list: "+carlist.remove(2));
		System.out.println(carlist);
		System.out.println(carlist.remove("Toyoto"));
		System.out.println(carlist);
		System.out.println(carlist.removeAll(carlist));
		System.out.println(carlist);
	}
	
	public static void checkArrayListIsEmpty(ArrayList carlist) {
		System.out.println();
		System.out.println("*******Checking Car list is Empty or not*******");
		System.out.println("The present car list is empty : "+carlist.isEmpty());
		carlist.removeAll(carlist);
		System.out.println("The present car list is empty : "+carlist.isEmpty());
	}
	
	public static void checksGivenValuesContainsInArrayList(ArrayList carlist) {
		System.out.println();
		ArrayList newcarlist = new ArrayList();
		newcarlist.add("Tata");
		newcarlist.add("Lambo");
		newcarlist.add("BMW");
		newcarlist.add(1);
		System.out.println("*******Checks Given Values present in car List*******");
		System.out.println(carlist);
		System.out.println(newcarlist);
		boolean a = carlist.contains("volvo");
		System.out.println(a);
		boolean a1 = carlist.contains("Benz");
		System.out.println(a1);
		boolean b = carlist.containsAll(newcarlist);
		System.out.println(b);
		boolean c = newcarlist.containsAll(carlist);
		System.out.println(c);
		boolean d = newcarlist.equals(carlist);
		System.out.println(d);
		boolean e = carlist.equals(newcarlist);
		System.out.println(e);
		newcarlist.addAll(carlist);
		System.out.println(newcarlist);
		System.out.println(carlist.addAll(newcarlist));
		
		
	}

	public static void main(String[] args) {
		getSizeFromArrayList(addValuesInList());
		removesGivenValueFromArrayList(addValuesInList());
		checkArrayListIsEmpty(addValuesInList());
		checksGivenValuesContainsInArrayList(addValuesInList());
	}

}
