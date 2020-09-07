package practice;
import java.util.List;
import java.util.ArrayList;

public class ScrambledStrings
{

   /** Scrambles a given word.
     *  @param word the word to be scrambled
     *  @return the scrambled word (possibly equal to word)
     *  Precondition: word is either an empty string or contains only uppercase letters.
     *  Postcondition: the string returned was created from word as follows:
     *   - the word was scrambled, beginning at the first letter and continuing from left to right
     *   - two consecutive letters consisting of "A" followed by a letter that was not "A" were swapped
     *   - letters were swapped at most once
     */
   public  String scrambleWord(String word)
   {
      String scrambled = "";
      int i = 0;

      while (i < word.length())
      {
         String letter1 = word.substring(i, i+1);
         String letter2 = "";
         if (i < word.length() - 1)
         letter2 = word.substring(i+1, i+2);

         if (letter1.equals("A") && !letter2.equals("A") && !letter2.equals(""))
         {
            scrambled += letter2 + letter1;
            i += 2;
         }
         else
         {
            scrambled += letter1;
            i += 1;
         }
     }
     return scrambled;
   }

   /********************** Part (b) *********************/

   /** Modifies wordList by replacing each word with its scrambled
     *  version, removing any words that are unchanged as a result of scrambling.
     *  @param wordList the list of words
     *  Precondition: wordList contains only non-null objects
     *  Postcondition:
     *   - all words unchanged by scrambling have been removed from wordList
     *   - each of the remaining words has been replaced by its scrambled version
     *   - the relative ordering of the entries in wordList is the same as it was
     *        before the method was called
     */

   public  void scrambleOrRemove(List<String> wordList)
   {
	   int i =0;
	   while(i<wordList.size()) {
		   String scrambled = scrambleWord(wordList.get(i));
		   if(scrambled.equals(wordList.get(i))) {
			   wordList.remove(i);
		   }
		   else {
			   wordList.set(i, scrambled);
			   i++;
		   }
	   }
   }
}
