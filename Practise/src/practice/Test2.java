package practice;
import java.util.Arrays;
public class Test2 {

	/*private static int[] nums = {7, 10, 10, 15, 15, 15, 15, 10, 10, 10, 15, 10, 10};

	public static int findLongest(int target) {
	   int lenCount = 0; // length of current consecutive numbers
	   int maxLen = 0;   // max length of consecutive numbers
	   for (int k = 0; k < nums.length; k++) {
	      if (nums[k] == target) {
	         lenCount++;
	      } else lenCount = 0;
	      if (lenCount > maxLen) {
	         maxLen = lenCount;
	      }
	      
	   }
	   if (lenCount > maxLen) {
	      maxLen = lenCount;
	   }
	   return maxLen;
	}
	*/


   public static void main (String[] args)
   {
	   Sound s = new Sound();

	      System.out.println("The original array of samples is " + Arrays.toString(s.samples));
	      s.trimSilenceFromBeginning();
	      System.out.println("The new array of samples is " + Arrays.toString(s.trimSilenceFromBeginning()));
	      System.out.println("The length of the new array should be 12 and is " + s.samples.length);
   }
	 

}



 
