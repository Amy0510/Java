package practice;

public class GrayImage {
	   public static final int BLACK = 0;
	   public static final int WHITE = 255;

	   /** The 2-dimensional representation of this image.
	    *  Guaranteed not to be null.
	    *  All values in the array are within the range
	    *  [BLACK, WHITE], inclusive.
	    */
	   private int[][] pixelValues;

	   /** constructor that takes a 2D array */
	   public GrayImage(int[][] theArray)
	   {
	      pixelValues = theArray;
	   }

	   /** @return the total number of white pixels in
	    *    this image.
	    * Postcondition: this image has not been changed.
	    */
	   public int countWhitePixels()
	   {
		   int count = 0;
		   for(int i = 0; i < pixelValues.length; i++) {
			   for(int j =0; j < pixelValues[i].length; j++) {
				   if(pixelValues[i][j] == WHITE) {
					   count++;
				   }
			   }
		   }
		   return count;
	   }
	   public void processImage()
	   {
		   for(int i = 0; i < pixelValues.length-2; i++) {
			   for(int j =0; j < pixelValues[i].length-2; j++) {
				   if(pixelValues[i][j] - pixelValues[i+2][j+2] >0) {
					   pixelValues[i][j] -= pixelValues[i+2][j+2];
				   }
				   else {
					   pixelValues[i][j] = BLACK;
				   }
			   }
		   }
	   }

	   public void printValues()
	   {
	     for (int r = 0; r < pixelValues.length; r++)
	     {
	       for (int c = 0; c < pixelValues[0].length; c++)
	       {
	         System.out.print(pixelValues[r][c] + ", ");
	       }
	       System.out.println();
	     }
	   }
}
