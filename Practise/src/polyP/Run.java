package polyP;
import java.util.*; 	

public class Run {

	public Run() {
		// TODO Auto-generated constructor stub
	}

	public static void selectionSort(int[] elements)
	   {
	      for (int j = 0; j < elements.length - 1; j++)
	      {
	         int minIndex = j;
	         for (int k = j + 1; k < elements.length; k++)
	         {
	            if (elements[k] < elements[minIndex])
	            {
	               minIndex = k;
	            }
	         }
	         int temp = elements[j];
	         elements[j] = elements[minIndex];
	         elements[minIndex] = temp;
	         System.out.println(Arrays.toString(elements));
	       }
	   }

	   public static void main(String[] args)
	   {
	      int[] arr1 = {10, 6, 3, 2, 8};
	      System.out.println(Arrays.toString(arr1));
	      selectionSort(arr1);
	      System.out.println(Arrays.toString(arr1));
	   }

}
