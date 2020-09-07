package practice;
import java.util.List;
import java.util.ArrayList;

public class ClimbingClub
{
   /** The list of climbs completed by members of the club.
    * * Guaranteed not to be null. Contains only non-null references.
    */
  private List<ClimbInfo> climbList;

  /** Creates a new ClimbingClub object. */
  public ClimbingClub()
  {
     climbList = new ArrayList<ClimbInfo>();
  }

  /** Adds a new climb with name peakName and time climbTime to the end of the list of climbs
   *
   * @param peakName the name of the mountain peak climbed
   * @param climbTime the number of minutes taken to complete the climb
   */
  public void addClimb(String peakName, int climbTime)
  {
	  	ClimbInfo newClimb = new ClimbInfo(peakName,climbTime);
	  	climbList.add(newClimb);
  }
  public void addClimbInOrder(String peakName, int climbTime)
  {
	  ClimbInfo newClimb = new ClimbInfo(peakName,climbTime);
	  for(int i =0; i< climbList.size(); i++) {
		  if(peakName.compareTo(climbList.get(i).getName()) < 0) {
			  climbList.add(i, newClimb);
			  return;
		  }
	  }
	  climbList.add(newClimb);
  }

  public int distinctPeakNames()
  {
    if (climbList.size() == 0)
     {
        return 0;
     }

     ClimbInfo currInfo = climbList.get(0);
     String prevName = currInfo.getName();
     String currName = null;
     int numNames = 1;
     for (int k = 1; k < climbList.size(); k++)
     {
        currInfo = climbList.get(k);
        currName = currInfo.getName();
        if (prevName.compareTo(currName) != 0)
        {
           numNames++;
           prevName = currName;
        }
     }
    return numNames;
  }

  public String toString()
  {
    String output ="";
    for (ClimbInfo info : climbList)
    {
      output = output + info.toString() + "\n";
    }
    return output;
  }
}
