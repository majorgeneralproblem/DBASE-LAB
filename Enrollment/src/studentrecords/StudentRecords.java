package studentrecords;

import java.util.Scanner;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StudentRecords {
	// DBController Object
	static DBController controller = new DBController(); 
	// Database URL
    static final String DBASE_URL = "jdbc:mysql://localhost/records?autoReconnect=true&useSSL=false";
    // Database credentials
    static final String USERNAME = "root";
    static final String PASSWORD = "";
    //Scanner Object
	static Scanner kb = new Scanner(System.in);
	
	public static void main(String[] args){
		try {
		controller.dbaseConnect(DBASE_URL,USERNAME,PASSWORD);
		mainMenu();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void mainMenu() {
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
		Date date = new Date();
		int choice = 0;
		do {
			System.out.println();
			System.out.println("----------"+dateFormat.format(date)+"----------");
			System.out.println("+----------------------------+");
	        System.out.println("|   M E N U  O P T I O N S   |");
	        System.out.println("+----------------------------+");
	        System.out.println("| 1. Accounts                |");
	        System.out.println("| 2. Subjects                |");
	        System.out.println("| 3. Classes                 |");
	        System.out.println("| 4. Enrollment              |");
	        System.out.println("| 5. Exit Program            |");
	        System.out.println("+----------------------------+");
	        do {
	        	System.out.print("Enter your choice: ");
		        try {
		        	choice = Integer.parseInt(kb.nextLine());
		        } catch (Exception e) {
		        	System.out.println("error: input a valid value...");
		        	System.out.print("Press enter key to continue...");
		        	kb.nextLine();
		        }
	        } while(choice < 1 || choice > 5);
	        
	        switch (choice){
	        	case 1:
	        		accountsMenu(choice);
	        		break;
	        	case 2:
	        		subjectsMenu(choice);
	        		break;
	        	case 3:
	        		classesMenu(choice);
	        		break;
	        	case 4:
	        		enrollmentMenu(choice);
	        		break;
	        }
	        
		} while(choice != 5);
        kb.close();
	}
	
	public static void accountsMenu(int choice){
		do {
			System.out.println();
			System.out.println("+----------------------------+");
	        System.out.println("|   M E N U  O P T I O N S   |");
	        System.out.println("+----------------------------+");
	        System.out.println("| 0. Back                    |");
	        System.out.println("| 1. Add Account             |");
	        System.out.println("| 2. Check Account           |");
	        System.out.println("| 3. Update Account          |");
	        System.out.println("| 4. Delete Account          |");
	        System.out.println("+----------------------------+");
	        do {
	        	System.out.print("Enter your choice: ");
		        try {
		        	choice = Integer.parseInt(kb.nextLine());
		        } catch (Exception e) {
		        	System.out.println("error: input a valid value...");
		        	System.out.print("Press enter key to continue...");
		        	kb.nextLine();
		        }
	        } while(choice < 0 || choice > 4);
	        
	        try {
	        	switch (choice){
		        	case 1:
		    	        System.out.println("+----------------------------+");
		    	        System.out.println("|         Add Account        |");
		    	        System.out.println("+----------------------------+");
		    	        System.out.println("Enter ID number: ");
		    	        int idno = Integer.parseInt(kb.nextLine());
		    	        System.out.println("Enter last name: ");
		    	        String lname = kb.nextLine();
		    	        System.out.println("Enter first name: ");
		    	        String fname = kb.nextLine();
		    	        System.out.println("Enter middle initial: ");
		    	        String midInitial = kb.nextLine();
		    	        System.out.println("Enter gender: ");
		    	        String gender = kb.nextLine();
		    	        System.out.println("Enter contact number: ");
		    	        String contactNumber = kb.nextLine();
		    	        System.out.println("Enter email: ");
		    	        String email = kb.nextLine();
		        		controller.createAccount(idno, lname, fname, midInitial, gender, contactNumber, email);
		        		break;
		        	case 2:
		        		//To-Do
		        		break;
		        	case 3:
		        		//To-Do
		        		break;
		        	case 4:
		        		//To-Do
		        		break;
	        	}
	        } catch (Exception e) {
	        	e.printStackTrace();
	        }
	        
		} while (choice != 0);
	}
	
	public static void subjectsMenu(int choice){
		do {
			System.out.println();
			System.out.println("+----------------------------+");
	        System.out.println("|   M E N U  O P T I O N S   |");
	        System.out.println("+----------------------------+");
	        System.out.println("| 0. Back                    |");
	        System.out.println("| 1. Add Subject             |");
	        System.out.println("| 2. Check Subject           |");
	        System.out.println("| 3. Update Subject          |");
	        System.out.println("| 4. Delete Subject          |");
	        System.out.println("+----------------------------+");
	        do {
	        	System.out.print("Enter your choice: ");
		        try {
		        	choice = Integer.parseInt(kb.nextLine());
		        } catch (Exception e) {
		        	System.out.println("error: input a valid value...");
		        	System.out.print("Press enter key to continue...");
		        	kb.nextLine();
		        }
	        } while(choice < 0 || choice > 4);
	        
	        try {
	        	switch (choice){
		        	case 1:
		        		//To-Do
		        		break;
		        	case 2:
		        		//To-Do
		        		break;
		        	case 3:
		        		//To-Do
		        		break;
		        	case 4:
		        		//To-Do
		        		break;
	        	}
	        } catch (Exception e) {
	        	e.printStackTrace();
	        }
		} while (choice != 0);
		
	}
	
	public static void classesMenu(int choice){
		do {
			System.out.println();
			System.out.println("+----------------------------+");
	        System.out.println("|   M E N U  O P T I O N S   |");
	        System.out.println("+----------------------------+");
	        System.out.println("| 0. Back                    |");
	        System.out.println("| 1. Add Class               |");
	        System.out.println("| 2. Check Class             |");
	        System.out.println("| 3. Update Class            |");
	        System.out.println("| 4. Delete Class            |");
	        System.out.println("+----------------------------+");
	        do {
	        	System.out.print("Enter your choice: ");
		        try {
		        	choice = Integer.parseInt(kb.nextLine());
		        } catch (Exception e) {
		        	System.out.println("error: input a valid value...");
		        	System.out.print("Press enter key to continue...");
		        	kb.nextLine();
		        }
	        } while(choice < 0 || choice > 4);
	        try {
	        	switch (choice){
		        	case 1:
		        		//To-Do
		        		break;
		        	case 2:
		        		//To-Do
		        		break;
		        	case 3:
		        		//To-Do
		        		break;
		        	case 4:
		        		//To-Do
		        		break;
	        	}
	        } catch (Exception e) {
	        	e.printStackTrace();
	        }
		} while (choice != 0);
	}
	
	public static void enrollmentMenu(int choice){
		do {
			System.out.println();
			System.out.println("+----------------------------+");
	        System.out.println("|   M E N U  O P T I O N S   |");
	        System.out.println("+----------------------------+");
	        System.out.println("| 0. Back                    |");
	        System.out.println("| 1. Enroll                  |");
	        System.out.println("| 2. Check Enrollment        |");
	        System.out.println("| 3. Update Info             |");
	        System.out.println("| 4. Unenroll                |");
	        System.out.println("+----------------------------+");
	        do {
	        	System.out.print("Enter your choice: ");
		        try {
		        	choice = Integer.parseInt(kb.nextLine());
		        } catch (Exception e) {
		        	System.out.println("error: input a valid value...");
		        	System.out.print("Press enter key to continue...");
		        	kb.nextLine();
		        }
	        } while(choice < 0 || choice > 4);
	        try {
	        	switch (choice){
		        	case 1:
		        		//To-Do
		        		break;
		        	case 2:
		        		//To-Do
		        		break;
		        	case 3:
		        		//To-Do
		        		break;
		        	case 4:
		        		//To-Do
		        		break;
	        	}
	        } catch (Exception e) {
	        	e.printStackTrace();
	        }
		} while (choice != 0);
	}
	
}
