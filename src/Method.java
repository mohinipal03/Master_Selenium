
public class Method {
	

	/* why method -- 
	- if some number of lines of code needs to be executed again and again then a method can be created for reusability purpose
	- If method created inside main method then it will be run for sure
	- for incertinity can be created outside main method
	- To access other method inside or outside a class; an object creation of class will be needed 
	- Marking methods as static will make them accessable within class without creating object*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
		Method m = new Method();
		String name = m.methodGetData();
		System.out.println(name);
	}
	

	public String methodGetData() {
		System.out.println("hello world");
		return "mohini pal";
	}
	
	
}
