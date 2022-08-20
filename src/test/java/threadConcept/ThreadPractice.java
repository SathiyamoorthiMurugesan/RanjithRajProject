package threadConcept;

public class ThreadPractice extends Thread{
	
	public void run() {
		for(int i = 1; i<1000; i++) {
			System.out.print("Parent method Thread (child)");
		}
	}

	public static void main(String[] args) {
		ThreadPractice p = new ThreadPractice();
		p.start();
		
//		try {
//			p.join();
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
//		
//		Child1 c1 = new Child1();
//		c1.start();
//		
//		Child2 c2 = new Child2();
//		c2.start();
		
		for(int i = 1; i<1000; i++) {
			System.out.print("This is main Thread");
			System.out.println();
			System.out.println("*********************************");
		}
	}

}

class Child1 extends ThreadPractice {
	public void run() {
		for(int i = 1; i<1000; i++) {
			System.out.println("child1");
		}
	}
}

class Child2 extends Child1 {
	public void run() {
		for(int i = 1; i<1000; i++) {
			System.out.println("child2");
		}
	}
}