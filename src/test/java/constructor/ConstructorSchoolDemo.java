package constructor;

public class ConstructorSchoolDemo {
	
	public String rollNo, name;
	public String standard = "1st std";
	
	
	public ConstructorSchoolDemo() {
		
	}
	
//	public ConstructorSchoolDemo(String rollNo, String name, String age) {
//		System.out.println(rollNo+"   "+name+"   "+std);
//	}
	
	public ConstructorSchoolDemo(String rollNo, String name, String std) {
		standard = std;
		System.out.println(rollNo+"   "+name+"   "+std);
	}
	
	public static void main(String[] args) {
		ConstructorSchoolDemo student1 = new ConstructorSchoolDemo();
		student1.rollNo = "1";
		student1.name = "A";
//		student1.age = "10";
		
//		System.out.println(student1.rollNo+"   "+student1.name+"   "+student1.age);
		
		ConstructorSchoolDemo student2 = new ConstructorSchoolDemo();
		student2.rollNo = "2";
		student2.name = "B";
//		student2.age = "10";
		
//		System.out.println(student2.rollNo+"   "+student2.name+"   "+student2.age);
		
//		ConstructorSchoolDemo studentNew1 = new ConstructorSchoolDemo("1", "A", "10");
		
//		ConstructorSchoolDemo studentNew1 = new ConstructorSchoolDemo("1", "A");
		
	}
}
