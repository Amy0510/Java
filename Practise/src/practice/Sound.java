package practice;


public class Sound
{
    // the array of values in this sound; guaranteed not to be null
    public int[] samples = {0, 0, 0, 0, -14, 0, -35, -39, 0, -7, 16, 32, 37, 29, 0, 0};

    /** Changes those values in this sound that have an amplitude greater than limit
     *  Values greater than limit are changed to limit.
     *  @param limit the amplitude limit
     *         Precondition: limit >= 0
     *  @return the number of values in this sound that this method changed
     */
    public int limitAmplitude(int limit){
    	int count = 0;
    	for(int i =0; i< samples.length; i++) {
    		if(samples[i] > limit) {
    			samples[i] = limit;
    			count++;
    		}
    		else if(samples[i] < -limit) { 
    			samples[i] = -limit;
    			count++;
    		}
    	}
    	return count;
    	
    }

    public int[] trimSilenceFromBeginning()
    {
      /*int count = samples.length;
      int i =0;
      while(samples[i] == 0) {
    	  count--;
    	  i++;
      }
      int[] newSamples = new int[count];
      i = 0;
      for(int x = samples.length-count; x<= samples.length-1; x++) {
    	  newSamples[i] = samples[x];
    	  i++;
      }
      return newSamples;*/
    	
    	int i =0;
    	while(this.samples[i] == 0) {
    		i++;
    	}
    	int[] newSamples = new int[this.samples.length - i];
    	for(int j = 0; j<newSamples.length; j++) {
    		newSamples[j] = samples[j+i];
    	}
    	return newSamples;
    	
      
    }
}
