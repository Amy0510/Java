package practice;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
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
	// test a
	    ClimbingClub hikerClub = new ClimbingClub();
	    hikerClub.addClimb("Monadnock", 274);
	    hikerClub.addClimb("Whiteface", 301);
	    hikerClub.addClimb("Algonquin", 225);
	    hikerClub.addClimb("Monadnock", 344);
	    System.out.print(hikerClub);
	    hikerClub.distinctPeakNames();
	    System.out.println("The order printed above should be Monadnock, Whiteface, Algonquin, Monadnock");
   }
	 

}



 
