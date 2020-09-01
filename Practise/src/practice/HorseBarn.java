package practice;

public class HorseBarn
{
   public Horse[] spaces;

   /** Constructor that takes the number of stalls
    * @param numStalls - the number of stalls in the barn
    */
   public HorseBarn(int numStalls)
   {
     spaces = new Horse[numStalls];
   }

   /** Returns the index of the space that contains the horse with the specified name.
    * * Precondition: No two horses in the barn have the same name.
    * @param name the name of the horse to find
    * @return the index of the space containing the horse with the specified name;
    * -1 if no horse with the specified name is in the barn.
    */
   public int findHorseSpace(String name)
   {
	   System.out.println("name = " + spaces[2].getName());
	   for(int i =0; i< spaces.length - 1; i++) {
		   if(spaces[i] != null && spaces[i].getName().equals(name)) {
			   return i;
		   }
	   }
	   return -1;
   }

   public String toString()
   {
     String result = "";
     Horse h = null;
     for (int i = 0; i < spaces.length; i++) {
       h = spaces[i];
       result = result + "space " + i + " has ";
       if (h == null) result = result + " null \n";
       else result = result + h.toString() + "\n";
     }
     return result;
   }

}
