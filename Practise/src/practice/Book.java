package practice;

public class Book {
	public void methodOne()
	   {
	      System.out.print("A");
	      methodTwo();
	   }

	   public void methodTwo()
	   {
	      System.out.print("B");
	   }

	   public String getDefinition() {
		   return "Hello";
	   }
}
