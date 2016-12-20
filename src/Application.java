

import java.util.Scanner;

/**
 * Main class to test the Road and Settlement classes
 * 
 * @author Joshua Hodges
 * @version 2.0
 *
 */
public class Application {

	private Scanner scan;
	private Map map;

	public Application() {
		scan = new Scanner(System.in);
		map = new Map();
	}

	private void runMenu() {
		// STEP 1: ADD MENU CODE HERE	
		
		String menuOption = null;

		String quit = "q";
		String state = null;
		
		while(state != quit){	
		printMenu();
		menuOption = scan.next();
		
		switch(menuOption){
		
		case "1":
			String nm = addName();
			int pop = addPopulation();
			SettlementType k = this.askForSettlementClassifier();			
			Settlement added = new Settlement(nm,pop,k);
			map.addSettlement(added);
			System.out.println(" ");
			System.out.println("Settlement " + nm + " was added.");
			break;
			
		case "2":
			String remove = scan.next();
			break;
		case "3":
			
			break;
		case "4":
			
			break;
		case "5":
			
			break;
		case "6":
			map.save();
			System.out.println("Map has been saved");
			break;
		case "q":
			state = "q";
			break;
		
		}
		
		
		}
		
		
		
	}

	// STEP 1: ADD PRIVATE UTILITY MENTHODS HERE. askForRoadClassifier, save and load provided
	

	private int addPopulation() {
		// TODO Auto-generated method stub
		System.out.println("What is the Population of the Settlement?");
		int popInput = scan.nextInt();
		scan.reset();
		return popInput;
	}

	private String addName() {
		// TODO Auto-generated method stub
		System.out.println("What is the name of the Settlement?");
		String nameInput = scan.next();
		scan.reset();
		return nameInput;
		
	}
	
	private SettlementType askForSettlementClassifier() {
		SettlementType result = null;
		boolean valid;
		do{
			valid = false;
			System.out.print("Enter the Settlement Type: ");
			for (SettlementType cls: SettlementType.values()){
				System.out.print(cls + " ");
			}
			String choice = scan.next().toUpperCase();
			try {
				result = SettlementType.valueOf(choice);
				valid = true;
			} catch (IllegalArgumentException iae){
				System.out.println(choice + " is not one of the options. Try again.");
			}
		}while(!valid);
		return result;
	}

	private Classification askForRoadClassifier() {
		Classification result = null;
		boolean valid;
		do{
			valid = false;
			System.out.print("Enter a road classification: ");
			for (Classification cls: Classification.values()){
				System.out.print(cls + " ");
			}
			String choice = scan.next().toUpperCase();
			try {
				result = Classification.valueOf(choice);
				valid = true;
			} catch (IllegalArgumentException iae){
				System.out.println(choice + " is not one of the options. Try again.");
			}
		}while(!valid);
		return result;
	}
	
	private void save() {
		map.save();
	}

	private void load() {
		map.load();
	}

	private void printMenu() {
		// STEP 1: ADD CODE HERE
		System.out.println("");
		System.out.println("Press 1 to add a Settlement.");
		System.out.println("Press 2 to remove a Settlement.");
		System.out.println("Press 3 to add a Road.");
		System.out.println("Press 4 to remove a Road.");
		System.out.println("Press 5 to display the Map.");
		System.out.println("Press 6 to save the Map.");
		System.out.println("Press q to quit the menu.");
		System.out.println("What would you like to do?");
		System.out.println("");
		
	}

	public static void main(String args[]) {
		Application app = new Application();
		app.load();
		app.runMenu();
		app.save();
	}

}
