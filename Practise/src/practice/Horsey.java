package practice;

public class Horsey implements Horse {
   private String name;
   private int weight;

   public Horsey(String theName, int theWeight)
   {
      this.name = theName;
      this.weight = theWeight;
   }

   public String getName() { return this.name;}

   public int getWeight() { return this.weight; }

   public String toString()
   {
      return "name: " + this.name + " weight: " + this.weight;
   }

}



