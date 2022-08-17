/* ArrayList
 * 
	 * 	It implements List Interface
	 * 	Its a resizeable array
	 * ArrayList maintains the insertion order i.e order of the object in which they are inserted. 
	 * 	Each ArrayList has a capacity and it will increase automatically if we add values more than the given capacity
	 * 	Initial size of ArrayList is 10 if no size is mentioned while declaring ArrayList
	 * 	ArrayList can be declared as below
	  		ArrayList li = new ArrayList(); //since it is a non-generic ArrayList, we can add any object such as Integer, String etc.,
			List list = new ArrayList();  //since it is a non-generic ArrayList, we can add any object such as Integer, String etc.,
			List<Integer> list1 = new ArrayList<Integer>(); //Generic ArrayList, we can only add Integer
			ArrayList<Integer> AI = new ArrayList<Integer>();
			ArrayList<String> AS = new ArrayList<String>(10); //Generic ArrayList, we can only add String
			ArrayList<String> AS1 = new ArrayList<String>(AS);
			***Using Arrays class**
			List<String> progList = Arrays.asList("Java","Android","Python","C++");  
	 * 	Useful methods in ArrayList
	 * 		All the methods declared in Collection and List interfaces are implemented in this class and along with that we have below methods
	 * 		trimToSize();
	 * 		ensureCapacity(int minCapacity);--10
	 * 		grow(int minCapacity);--min cap+1?
	 * 		grow();
	 * 		newCapacity(int minCapacity);
	 * 		hugeCapacity(int minCapacity);
	 * 		clone();
	 * 			Since CLone() method returns Objects, we need to cast Object to ArrayList
	 * 		toArray();
	 * 		add(E e, Object[] elementData, int s);
	 * 		equalsRange(List<?> other, int from, int to) ;
	 * 		equalsArrayList(ArrayList<?> other);
	 * 		fastRemove(Object[] es, int i);
	 * 		removeRange(int fromIndex, int toIndex);
	 * 		iterator();
	 * 			hasNext();
	 * 			next();
	 * 			remove();
	 * 			forEachRemaining(Consumer<? super E> action);
	 * 			checkForComodification();
	 * 		ListIterator<E>();
	 * 			- This method returns ListIterator Class
	 * 			- it has below methods
	 * 			hasPrevious();
	 * 			nextIndex();
	 * 			previousIndex();
	 * 			previous();
	 * 			set(E e);
	 * 			add(E e);
	 * 		subList(int fromIndex, int toIndex) 
	 * 			- this method returns SubList class
	 * 			- This sublist class has all the list methods
	 * 			- and its own constructors
	 *		SplitIterator() -->doubt
	 *			- This method returns ArrayListSpliterator class
	 *			- This class has some methos such as getFense(), trySplit(), etc..
	 *
	 */
	
//	ArrayList
//	LinkedList
//	HashSet
//	LinkedHashSet
//	TreeSet
//	HashMap
//	LinkedHashMap
//	TreeMap

package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a= new ArrayList<Integer>(10);
		System.out.println(a.size());
		a.add(10);
		a.add(20);
		a.add(30);
		System.out.println(a);
		System.out.println(a.size());
		
		Iterator<Integer> ite = a.iterator();
		while(ite.hasNext()) 
		{
			System.out.println(ite.next());
		}
		
	}

}
