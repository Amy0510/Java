package practice;
import java.util.List;
import java.util.ArrayList;
import java.text.*;
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


	 /*public static void moveSmallest(ArrayList<Integer> list)
	    {
	        int smallestIndex = list.get(0);
	        for (int i =1; i< list.size(); i++)
	        {
	            if (list.get(i) < smallestIndex)
	            {
	                smallestIndex = i;
	            }
	        }
	        list.add(0, list.remove(smallestIndex));
	    }*/
	
	

	    public static void main(String[] args)
	    {
	    	Book b = new Dictionary();
	    	b.getDefinition();
	    }
	 

}



 
