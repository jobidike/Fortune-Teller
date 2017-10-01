import java.util.Scanner;
public class FortuneTeller {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		String firstName;  //Part one
		String lastName;
		int age;
		int birthMonth;
		String roygbivColor;
		int numberOfSiblings;
		
		
		System.out.println("What is your first name?");
		firstName=input.nextLine();
		System.out.println("What is your last name?");
		lastName=input.nextLine();
		System.out.println("Enter your age.");
		age=input.nextInt();
		input.nextLine();
		System.out.println("Enter your birth month.");
		birthMonth=input.nextInt();
		input.nextLine();
		System.out.println("What is your favorite Roygbiv color?");
		roygbivColor=input.nextLine();
		
		
		if (roygbivColor.toLowerCase().contains("blue")) {//Make all lowercase
			System.out.println("That's great!");
		} else if (roygbivColor.toLowerCase().contains("help")) {
			System.out.println("You can choose from these colors: Red, Orange, Green, Blue, Yellow, Violet, Indigo");
		} else {
			System.out.println("Alot of colors to choose from, huh?");
		}
		
		System.out.println("How many siblings do you have?");
		numberOfSiblings=input.nextInt();
		input.nextLine();  
		
		//Part two
		
		
		System.out.println("EVEN OR ODD");
		int numberAge;
		
		System.out.println("Enter an Integar number:");
		numberAge=input.nextInt();
		input.nextLine();
		int retirementYearsEven=20;
		int retirementYearsOdd=25;
		
		if (numberAge % 2 ==0) {
			System.out.println(numberAge + "is even");	
		} else {
			System.out.println(numberAge + "is odd");
			
		}
		
		//Part three
		
		
		
		
		int monthOfBirth = 0;
		
		System.out.println("Please enter your birth month.");
		monthOfBirth=input.nextInt();
		input.nextLine();
		
		switch (monthOfBirth) {
		case 1: case 2: case 3: case 4:
			System.out.println("You have a balance of 1000000.00 left in your bank account");
			break;
		case 5: case 6: case 7: case 8:
			System.out.println("You have a balance of  450000.00 left in your bank account");
			break;
		case 9: case 10: case 11: case 12:
			System.out.println("You have a balance of 175000.00 left in your bank account");
		break;
		default: 
			System.out.println("Bank balance of 0.00");
		}
		
			
		 
		
		
		
		

	}

}
