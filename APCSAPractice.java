1.
a)
public boolean simulate(){
	int totalDist=0;
	for(int i =0; i< maxHops; i++){
		totalDist+=hopDistance();
		if(totalDist >= goalDistance) return true;
		if(totalDist < 0) return false;
	}
	return false;
}


b)
public double runSimulations(int num){
	int successSim = 0;
	for(int i =0; i<num; i++){
		if(simulate() == true) successSim ++;
	}
	return (double)(successSim/num);
}


2. 
a) 
public WordPairList(String[] words){
	for(int i =0; i<words.length-1; i++){
		for(int j = i+1; j<words.length; j++){
			WordPair w = new WordPair(words[i], words[j]);
			allPairs.add(w);
		}
	}
}

b)
public int numMatches(){
	int matchCount = 0;
	for(int i =0; i<allPairs.size(); i++){
		if(allPairs.get(i).getFirst.equals(allPairs.get(i).getSecond) matchcount++;
			
	return matchCount;






3. 
class CodeWordChecker implements StringChecker{
	private int minLength;
	private int maxLenght;
	private String notOccur;

	public CodeWordChecker(int minLen; int maxLen; String c){
		this.minLength = minLen;
		this.maxLength = maxLen;
		this.notOccur= c;
	}

	public CodeWordChecker(String c){
		minLength = 6;
		maxLength = 20;
		this.notOccur = c;
	}
	
	public boolean isValid(String code){
		if(code.length() < minLength || code.Length() > maxLenght) return false;
		if(code.indexOf(notOccur) != -1) return false;
		return truel
	}
}


4.  
a)
public static int[] getColumn(int [] [] arr2D, int c){
	int column = new int[arr2D.length];
	for(int i =0; i<column.length; i++){
		column[i] = arr2D[i][c];
	}
	return column;
}

b)
pulbic static boolean isLatin(int[] [] square){
	if(containsDuplicates(square[0])) return false;
	for(int i = 0; i< square.length; i++){
		if(!hasAllValues(square[0], square[i]) return false;
		if(!hasAllValues(square[0], getColumn(square, i)) return false;
	}
	return true;
}
	

		

