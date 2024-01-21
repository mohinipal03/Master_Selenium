import java.util.ArrayList;
import java.util.List;

public class enchanced_loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr2 = { 1,2,4,5,6,7,8,9,10,122};
		
		//multiple of 2 in output
		for(int i=0; i<arr2.length; i++) {
			
			if (arr2[i]%2==0) {
				System.out.println(arr2[i]);
				//break;
				}
			else
				System.out.println(arr2[i]+ " is odd value");
		}
		
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("Manual");
		al.add("dynamic");
		System.out.println(al.get(0));
		
		for(int i=0 ; i<al.size(); i++) {
			System.out.println(al.get(i));
		}
		
		
		for(String man : al) {
			System.out.println(man);
		}
		
		
		System.out.println(al.contains("Manual"));
		
		
		// converting array to arrayList
		String[] name = { "Mohini", "Lovely", "chotu"};
		//List<String> nameArrayList = Arrays.asList(name);
		
	}

}
