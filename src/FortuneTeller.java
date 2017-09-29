import java.util.Scanner;
public class FortuneTeller {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		String firstName;
		String lastName;
		int age;
		int birthMonth;
		String favoriteRoygbivColor;
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
		favoriteRoygbivColor=input.nextLine();
		
		if 
		System.out.println("How many siblings do you have?");
		numberOfSiblings=input.nextInt();
		input.nextLine();
		
		
		double numberOne = 30;
		double numberTwo = 40;
		System.out.println("EVEN OR ODD");
		
		System.out.println(numberOne);
		numberOne = input.nextDouble();
		input.nextLine();
		System.out.println(numberTwo);
		numberTwo = input.nextDouble();
		input.nextLine();
		
		if ((numberOne/2==15) && (numberTwo/2==20)) {
			System.out.println(numberOne + "is odd");
		} else {
			System.out.println(numberTwo + "is even");
		}
		
//		
//		if(number%2==1) {
//			System.out.println(number + "is even");
//		}else {
//			System.out.println(number + "is odd");
		
		 
		
		
		
		

	}

}
