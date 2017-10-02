import java.util.Scanner;
public class FortuneTeller {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		String firstName;  
		String lastName;
		int age;
		int birthMonth;
		String favColor;
		int numSiblings;
		int retirementYears=0;
		String bankBalance;
		String location=null;
		String transportation=null;
		
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
		System.out.println("What is your favorite ROYGBIV color? If you are unsure what ROYGBIV is then enter help. ");
		favColor=input.nextLine();
		
		if (favColor.toLowerCase().contains("blue")) {//Make all lowercase
			System.out.println("That's great!");
		} else if (favColor.toLowerCase().contains("help")) {
			System.out.println("You can choose from these colors: red, orange, green, blue, yellow, violet, indigo");
		} else if (favColor.toLowerCase().contains("red")) {
			System.out.println("Nice color!");
		} else if (favColor.toLowerCase().contains("orange")) {
			System.out.println("Great!");
		} else if (favColor.toLowerCase().contains("green")) {
			System.out.println("Nice color!");
		} else if (favColor.toLowerCase().contains("yellow")) {
			System.out.println("Great!");
		} else if (favColor.toLowerCase().contains("violet")) {
			System.out.println("Good job!");
		} else if (favColor.toLowerCase().contains("indigo")) {
			System.out.println("Nice pick!");
		} else {
			System.out.println("There's alot of colors, huh?");
		}
		
		System.out.println("How many siblings do you have?");
		numSiblings=input.nextInt();
		input.nextLine();  
		
		//Odd OR EVEN
		System.out.println("EVEN OR ODD");
		int numberAge;
		
		System.out.println("Enter an Integar number:");
		numberAge=input.nextInt();
		input.nextLine();
		
		if (numberAge % 2 ==0) {
			System.out.println(numberAge + "is even");
			retirementYears=20;
		} else {
			System.out.println(numberAge + "is odd");
			retirementYears=25;
		}
		
		//Vacation Home Location
		System.out.println("Enter your number of siblings to see the location of your vacation home:");
		numSiblings=input.nextInt();
		
		if (numSiblings == 0) {
			System.out.println("Rio de Janeiro, Brazil");
			location=("Rio de Janeiro, Brazil");
		} else if (numSiblings == 1) {
			System.out.println("San Diego, California");
			location=("San Diego, California");
		} else if (numSiblings == 2) {
			System.out.println("Havana, Cuba");
			location=("Havana, Cuba");
		} else if (numSiblings == 3) {
			System.out.println("Miami, Florida");
			location=("Miami, Florida");
		} else if (numSiblings > 3) {
			System.out.println("Toronto, Canada");
			location=("Toronto, Canada");
		} else {
			System.out.println("Pyongyang, North Korea");
			location=("Pyongyang, North Korea");
		}
		
		//Mode of Transportation
		System.out.println("Enter your favorite color to see your mode of transportation:");
		input.nextLine();
		favColor=input.nextLine();
		
		if (favColor.equalsIgnoreCase("red")){
            System.out.println("Uber");
            transportation=("Uber");
            } else if (favColor.equalsIgnoreCase("orange")) {
            	System.out.println("Train");
              transportation=("Train");
            } else if (favColor.equalsIgnoreCase("yellow")) {
                System.out.println("Yacht");
                transportation=("Yacht");
              } else if (favColor.equalsIgnoreCase("green")) {                
                System.out.println("Private Jet");
                transportation=("Private Jet");
              } else if (favColor.equalsIgnoreCase("blue")) {
                System.out.println("Range Rover");
                transportation=("Range Rover");
              } else if (favColor.equalsIgnoreCase("indigo")) {
                System.out.println("Skateboard");
                transportation=("Skateboard");
              } else if (favColor.equalsIgnoreCase("violet")) {
                System.out.println("Bicycle");
                transportation=("Bicycle");
             }
		
		//Bank Balance
		
		System.out.println("Please enter your birth month to see your bank balance.");
		birthMonth=input.nextInt();
		
		switch (birthMonth) {
		case 1: case 2: case 3: case 4:
			System.out.println("$1,000,000.00");
			bankBalance=("$1,000,000.00");
			break;
		case 5: case 6: case 7: case 8:
			System.out.println("$450,000.00");
			bankBalance=("$450,000.00");
			break;
		case 9: case 10: case 11: case 12:
			System.out.println("$175,000.00 ");
			bankBalance=("$175,000.00");
			break;
		default: 
			System.out.println("$0.00");
			bankBalance=("$0.00");
		}
		input.nextLine();
		System.out.println("Here is your fortune!");
		System.out.printf(firstName + " " + lastName + " will retire in " + retirementYears + " years with " + bankBalance + " in the bank, a vacation home in " + location +  " , and travel by " + transportation + ".");
		
		
		
		

	}

}
