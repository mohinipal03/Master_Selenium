
public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* string is an object that represents sequence of characters
		Can be defined in two ways 
		1. String literal
		2. using new keyword 
		
		to access method inside a class object creation is needed ( if you give s. you will get many methods hence string is an object)
		
		*/
		
		String s0 = "Mohini Pal";
		String s1 = "Mohini Pal"; // won't create another object as both values are same hence will be using s
		String ss = "welcome"; // will create another object
		
		
		String s2 = new String("welcome");
		String s3 = new String("welcome"); // by giving new everytime will create new object
		
		String s = "My name is Mohini Pal";
		String[] splittedstring = s.split(" ");
		
		for(String name : splittedstring) {
			System.out.println(name);
		}
		
		for(int i= s.length()-1; i>=0; i--) {
			System.out.println(s.charAt(i));
		}

	}

}
