package practice;

public class SelfDivisor {
	  /** @param number the number to be tested
	    *         Precondition: number > 0
	    *  @return true if every decimal digit of
	    *          number is a divisor of number;
	    *          false otherwise
	    */
	   public  boolean isSelfDivisor(int number)
	   {
	     int currNumber = number;
	     int digit = 0;
	     while (currNumber > 0)
	     {
	        digit = currNumber % 10;
	        if (digit == 0) return false;
	        if (number % digit != 0) return false;
	        currNumber = currNumber / 10;
	     }
	     return true;
	   }

	   /**
	    * @param start starting point for values to be checked
	    * Precondition: start > 0
	    * @param num the size of the array to be returned
	    * Precondition: num > 0
	    * @return an array containing the first num
	    * integers >= start that are self-divisors
	    */
	   public  int[] firstNumSelfDivisors(int start,int num)
	   { 
		   int count = 0;
		   int i = start;
		   int[] retArray = new int[num];
		   while (count < num) {
			  if(isSelfDivisor(i) == true) {
				  retArray[count] = i;
				  count ++; 
			  }
			  i++;
		   }
		   return retArray;
	   }
}
