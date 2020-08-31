package practice;

public class Time2 {
	private int seconds;
	private int minutes;
	private int hours;
	
	//constructors
	public Time2() {
		this.seconds = 0;
		this.minutes = 0;
		this.hours = 0;
	}
	
	public Time2(int h, int m, int s) {
		this.seconds = s;
		this.minutes = m;
		this.hours = h;
	}
	
	//print
	public void printTime() {
		System.out.print(pad(hours) + ":" + pad(minutes) + ":" + pad(seconds));
	}
	
	public String toString()
	   {
	      return pad(hours) + ":" + pad(minutes) + ":" + pad(seconds);
	   }
	private String pad(int value)
	   {
	      String sign = "";
	      if (value < 0)
	      {
	         sign = "-";
	         value = -1 * value;
	       }
	       if (value < 10) {
	          return sign + "0" + value;
	       } else {
	          return sign + value;
	       }
	    }
	
	//Methods
	public void tick()
	   {
	      if(seconds == 59) {
	    	  seconds = 0;
	    	  minutes ++;
	      }
	      else {
	    	  seconds++;
	      }
	      if(minutes == 60) {
	    	  minutes = 0;
	    	  hours++;
	      }
	      if(hours == 24) {
	    	  hours = 0;
	      }
	     
	   }
	
	public void add(Time2 offset) {
		this.seconds += offset.seconds;
		if(this.seconds >= 60) {
			this.seconds -= 60;
			this.minutes++;
		}
		
		this.minutes += offset.minutes;
		if(this.minutes >= 60) {
			this.minutes -= 60;
			this.hours++;
		}
		
		this.hours += offset.hours;
		if(this.hours >= 24) {
			this.hours -= 24;
		}
	}
}

