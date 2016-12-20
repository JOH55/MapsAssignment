import java.io.*;
import java.util.ArrayList;

/**
 * 
 * @author Chris Loftus 
 * @version 1.0 (25th February 2016)
 *
 */

public class Map {

	private ArrayList<Settlement> settlements;
	private ArrayList<Road> roads;

	public Map() {
		// INSERT CODE
		settlements = new ArrayList<Settlement>();
		roads = new ArrayList<Road>();
	}

	/**
	 * In this version we display the result of calling toString on the command
	 * line. Future versions may display graphically
	 */
	public void display() {
		System.out.println(toString());
	}

	public void addSettlement(Settlement newSettlement) throws IllegalArgumentException {
		// STEP 5: INSERT CODE HERE
		settlements.add(newSettlement);
				
	}

	// STEPS 7-10: INSERT METHODS HERE, i.e. those similar to addSettlement and required
	// by the Application class
	
	public void load() {
		// STEP 6: INSERT CODE HERE
		String fileName = "settlements.txt" ;
		BufferedReader Reader = null; 		 
		FileReader fileReader = null;
		try {
			fileReader = new FileReader(fileName);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		Reader = new BufferedReader(fileReader); 
		if(Reader != null){ 
			try {
				Reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		} 
		System.out.println(fileName + " was loaded");
	}

	public void save() {
		// STEP 6: INSERT CODE HERE
	}

	public String toString() {
		String result = "";
		// INSERT CODE HERE
		
		return result;
	}
}
