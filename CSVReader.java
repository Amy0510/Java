import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class CSVReader {

	public static void main(String[] args) throws FileNotFoundException{
		ArrayList<Assignment> assignments = new ArrayList<Assignment>();
		File f = new File("Assignments.csv");
		
		readFile(assignments, f);
		
		for(int i = 0; i < assignments.size(); i++) {
			System.out.println(assignments.get(i));
		}
		
		saveFile(assignments,f);
	}
	
	public static void readFile(ArrayList<Assignment> assignments, File f) throws FileNotFoundException {
		Scanner fileScan = new Scanner(f);
		
		//will repeat until no more lines to scan
		while(fileScan.hasNextLine()) {
			String line = fileScan.nextLine();
			Scanner lineScan = new Scanner(line);
			//This will change what the scanner to determine the next word
			//ie 1,2,3,4,5
			//the scanner will interpret as 1 2 3 4 5
			//normally set to .useDelimiter("\\s*"); aka any amount of whitespace
			//As the scanner uses whitespace as its delimiter
			//This allows the scanner to keep words together even when they
			//are separated by whitespace
			//
			lineScan.useDelimiter(",");
			
			//Saves each value to be used to construct object
			String name = lineScan.next();
			String course = lineScan.next();
			long date = lineScan.nextLong();
			int points = lineScan.nextInt();
			boolean completed = lineScan.nextBoolean();
			
			assignments.add(new Assignment(name, course, date, points, completed));
			lineScan.close();
		}
		fileScan.close();
	}

	public static void saveFile(ArrayList<Assignment> assignments, File f) throws FileNotFoundException {
		String text = "";
		for(int i = 0; i < assignments.size(); i++) {
			Assignment temp = assignments.get(i);
			text+=temp.getName()+",";
			text+=temp.getCourse()+",";
			text+=temp.getDueDate()+",";
			text+=temp.getPoints()+",";
			text+=temp.getCompleted()+",";
			text+="\n";
		}
		PrintStream fileWriter = new PrintStream(f);
		fileWriter.print(text);
		fileWriter.close();
	}
}
