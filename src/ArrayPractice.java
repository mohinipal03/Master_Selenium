import java.util.List;

public class ArrayPractice {

	public static void main(String[] args) {
		
		int[] arr = new int [5]; 
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		
		int[] arr1 = {1,2,3,4};
		System.out.println(arr1[2]);
		
		//for loop
		for(int i=0; i<arr.length; i++) {
			//System.out.println(arr[i]);
			System.out.println(i);
			}
		
		String[] name = { "mohini", "sanjay", "peacock"};
		/*for(int i=0; i<name.length; i++) {
			System.out.println(name[i]);
		}*/
		
		for (String s : name) {
			System.out.println(s);
		}
		
	}


}
