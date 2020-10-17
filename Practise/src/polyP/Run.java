package polyP;
import java.util.*; 	

public class Run {

	public Run() {
		// TODO Auto-generated constructor stub
	}

	public static void twoSum(int nums[], int target) {
		int[] indexes = new int [2];
		for(int index = 0; index < nums.length; index++) {
			for(int secondIndex = index+1; secondIndex < nums.length; secondIndex++) {
				if(nums[index] + nums[secondIndex] == target) {
					indexes[0] = index;
					indexes[1] = secondIndex;
					break;
				}
			}
		}
		
		for(int i =0; i<2; i++) {
			System.out.println(indexes[i]);
		}
	}
	
	   public static void main(String[] args)
	   {
		   
	      int[] arr1 = {10, 6, 3, 2, 8};
	      twoSum(arr1, 16);
	      
	   }

}
