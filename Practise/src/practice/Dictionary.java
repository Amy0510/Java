package practice;

public class Dictionary extends Book {

	public Dictionary() {
		// TODO Auto-generated constructor stub
	}
	 public void methodOne()
	   {
	      super.methodOne();
	      System.out.print("C");
	   }

	   public void methodTwo()
	   {
	      super.methodTwo();
	      System.out.print("D");
	   }
	   
	   public String getDefinition() {
		   return "hello";
	   }

}
