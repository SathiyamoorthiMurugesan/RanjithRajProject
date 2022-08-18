package string;

import javax.security.auth.RefreshFailedException;

public class StringPratice {
	


	public static int getLengthOfaString(String a) {
		System.out.println("****LENGHT****");
		int x = a.length(); 
		return x;
	}
	
	public static boolean checkStringIsEmpty(String a) {
		System.out.println("****IsEmpty****");
		System.out.println(a.isEmpty());
		return a.isEmpty();	
	}
	
	public static char getCharAt(String a) {
		System.out.println("****CharAt****");
		char x = a.charAt(8);
		return x;
	}
	
	public static boolean checkTwoStringEquals(String a, String b) {
		System.out.println("****Equals****");
		return a.equals(b);
	}
	
	public static boolean checkStringEqualsIgnoreCae(String a, String b) {
		System.out.println("****EqualsIgnoreCase****");
		return a.equalsIgnoreCase(b);
	}
	
	public static boolean checkTwoStringContentEquals(String a, String b) {
		System.out.println("****ContentEquals****");
		return a.contentEquals(b);
	}
	
	public static int CompareTwoString() {
		String s1 = "He is a Navaranjith";
		String s2 = "he is a Navaranjith";
		String s3 = "Me is a Navaranjith";
		String s4 = "He is a Navaranjith";
		String s5 = "A";
		String s6 = "a";
		
		System.out.println("****CompareTo****");
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		System.out.println(s2.compareTo(s3));
		System.out.println(s1.compareTo(s4));
		return s6.compareTo(s5);
	}
	
	public static int checkCompareToIgnoreCase() {
		String s1 = "He is a Navaranjith";
		String s2 = "he is a Navaranjith";
		String s3 = "Me is a Navaranjith";
		String s4 = "He is a Navaranjith";
		String s5 = "A";
		String s6 = "a";
		
		System.out.println("****CompareToIgnoreCase****");
		System.out.println(s1.compareToIgnoreCase(s2));
		System.out.println(s1.compareToIgnoreCase(s3));
		System.out.println(s2.compareToIgnoreCase(s3));
		System.out.println(s1.compareToIgnoreCase(s4));
		return s6.compareToIgnoreCase(s5);
	}
	
	public static boolean getStartWith(String a,String b) {
		System.out.println("****StartWith****");
		return a.startsWith(b);
	}
	
	public static boolean getEndWith(String a,String b) {
		System.out.println("****EndWith****");
		return a.endsWith(b);
	}
	
	public static int getHasCode(String a) {
		System.out.println("****HasCode****");
		return a.hashCode();
	}
	
	public static int getIndexOf(String a) {
		System.out.println("****IndexOf****");
		System.out.println(a.indexOf("l"));
		System.out.println(a.indexOf("is"));
		System.out.println(a.indexOf("z"));
		System.out.println(a.indexOf("a", 10));
		return a.indexOf("he", 10);
	}
	
	public static int getLastIndexOf(String a) {
		System.out.println("****LastIndexOf****");
		System.out.println(a.lastIndexOf("a"));
		System.out.println(a.lastIndexOf("is"));
		System.out.println(a.lastIndexOf("a", 10));
		return a.lastIndexOf("he", 10);
	}
	
	public static String getSubString(String a) {
		System.out.println("****SubString****");
		String b = a.substring(5);
		System.out.println(b);
		return a.substring(2, 10);
	}
	
	public static CharSequence getSubSequence(String a) {
		System.out.println("****SubSequence****");
		CharSequence b = a.subSequence(2, 18);
		return b;
	}
	
	public static String getConcatString(String a) {
		System.out.println("****concat****");
		String b = " is a boy";
		String c = a.concat(b);
		return c;
	}
	
	public static String getReplaceChar(String a) {
		System.out.println("****Replace****");
		String b = "Nava ranjith";
		System.out.println(b.replace("r", "R"));
		return a.replace("boy", "cricketer.");
	}
	
	public static boolean checkMatchesOfaString(String a) {
		System.out.println("****Matches****");
		String b = "Navaranjith";
		return a.matches(b);
	}
	
	public static boolean checkContains(String a) {
		System.out.println("****Contains****");
		String b = "he";
		String c = "a girls";
		System.out.println(a.contains(c));
		return a.contains(b);
	}
	
	public static String getSplit(String a) {
		System.out.println("****Split****");
		String[] b = a.split(" ");
		int x = b.length;
		for(int i = 0; i< x;i++) {
			System.out.print(b[i]+" ");
		}
		System.out.println();
		return b[5];
	}
	
	public static String joinTwoString(String a) {
		System.out.println("****Join****");		
		String[] b = a.split(" ");
		String c = String.join("*", b);
		return c;
	}
	
	public static String changeStringToUppercase(String a) {
		System.out.println("****UpperClass****");
		String b = a.toUpperCase();
		return b;
	}
	
	public static String changeStringToLowercase() {
		System.out.println("****LowerClass****");
		String a = "NAVARANJITH";
		String b = a.toLowerCase();
		return b;
	}
	
	public static String getTrim() {
		System.out.println("****Trim****");
		String a = "   They are going to play football   ";
		String b = a.trim();
		return b;
	}
	
	public static String getStrip() {
		System.out.println("****Strip****");
		String a = "   They are going to play football    ";
		String b = a.strip();
		String c = a.stripLeading();
		String d = a.stripTrailing();
		String e = a.stripIndent();
		System.out.println(b);
		System.out.println(c);
		return d;
	}
	
	public static boolean getIsBlank() {
		System.out.println("****Blank****");
		String a = " ";
		String b = "";
		String c = "Navaranjith";
		System.out.println(a.isBlank());
		System.out.println(a.isEmpty());
		System.out.println(b.isBlank());
		System.out.println(b.isEmpty());
		System.out.println(c.isBlank());
		return c.isEmpty();
	}
	
	public static void getToString() {
		System.out.println("****toString****");
		int[] a = {10,50,20,30};
		System.out.println(a.toString());
	}

	public static void main(String[] args) {
		String str = "Navaranjith";
		String str1 = "navaranjith";
		String s = "N";
		String s1 = "h";
		String s2 = "d";
		String s3 = "She is a girl and he is a boy.";
		
		System.out.println(getLengthOfaString(str));
		System.out.println(checkStringIsEmpty(str));
		System.out.println(getCharAt(str));
		System.out.println(checkTwoStringEquals(str,str1));
		System.out.println(checkStringEqualsIgnoreCae(str,str1));
		System.out.println(checkTwoStringContentEquals(str,str1));
		System.out.println(CompareTwoString());
		System.out.println(checkCompareToIgnoreCase());
		System.out.println(getStartWith(str,s));
		System.out.println(getEndWith(str,s1));
		System.out.println(getHasCode(s2));
		System.out.println(getIndexOf(s3));
		System.out.println(getLastIndexOf(s3));
		System.out.println(getSubString(str1));
		System.out.println(getSubSequence(s3));
		System.out.println(getConcatString(str));
		System.out.println(getReplaceChar(s3));
		System.out.println(checkMatchesOfaString(str));
		System.out.println(checkContains(s3));
		System.out.println(getSplit(s3));
		System.out.println(joinTwoString(s3));
		System.out.println(changeStringToUppercase(str1));
		System.out.println(changeStringToLowercase());
		System.out.println(getTrim());
		System.out.println(getStrip());
		System.out.println(getIsBlank());
		getToString();
	}

}
