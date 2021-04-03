import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class ToDoMain {
	private static Scanner userScan = new Scanner(System.in);
	

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File f = new File("Assignments.csv");
		ArrayList<Assignment> tasks = new ArrayList<Assignment>();
		String input = "";
		readFile(tasks, f);
		
		while(!input.equals("exit")){
			System.out.println("What would you like to do?");
			input = userScan.nextLine();
			
			if(input.equals("add")) {
				add(tasks);
			}
			if(input.equals("delete")) {
				delete(tasks);
			}
			if(input.equals("list")) {
				list(tasks);
			}
			if(input.equals("save")) {
				saveFile(tasks, f);
			}
		}
	}
	
	public static void add(ArrayList<Assignment> tasks) {
		System.out.println("What is the name of the task?");
		String name = userScan.nextLine();
		System.out.println("What is the class of the task?");
		String course = userScan.nextLine();
		
		System.out.println("What is the due date of the task?");
		long dueDate = userScan.nextLong();
		System.out.println("How many points is the task worth?");
		int points = userScan.nextInt();
		System.out.println("Is the task completed?");
		String taskComplete = userScan.nextLine();
		boolean taskFinish = false;
		if(taskComplete.equals("true")) {
			taskFinish = true;
		}
		
		Assignment a = new Assignment(name, course, dueDate, points, taskFinish );
		tasks.add(a);
		
	}
	public static void list(ArrayList<Assignment> tasks) {
		for(int i =0; i < tasks.size(); i++) {
			System.out.println((i+1) + ". " + tasks.get(i).toString());
		}
	}
	public static void delete(ArrayList<Assignment> tasks) {
		list(tasks);
		System.out.println("Which one would you like to delete?");
		int num = userScan.nextInt();
		
		tasks.remove(num-1);
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
