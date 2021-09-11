

/* Alexis Olivo
 * ITSE-2317 2801
 * September 11th 2021
   Math Tutor program that give the user two numbers to add or subtract */
import java.util.Scanner;

public class MathTutor {

	public static void main(String[] args) {
		
		// initialization
		Scanner input = new Scanner(System.in); //to receive user input
		
		int num1 = 0; //first number
		int num2 = 0; //second number
		int compAnswer = 0; //computer's answer
		int userAnswer = 0; //user's answer
		int choice = 0; //user's menu choice
		
		int min = 1; //random number minimum
		int max = 500; //random number maximum
		
		//loop to determine the user's choice and then commence program
		do {
			System.out.print("Would you like to add, subtract, or quit? Press 1 to add, 2 to subtract, and 9 to quit: ");
			choice = input.nextInt(); //collect's user's choice
			System.out.println(" ");
			
			if (choice == 1){
				num1 = (int)Math.floor(Math.random()*(max-min+1)+min); //random numbers
				num2 = (int)Math.floor(Math.random()*(max-min+1)+min);
				
				compAnswer = num1 + num2; //getting sum
				
				System.out.printf("%n%d + %d = : ", num1, num2); //displaying numbers + requesting answer
				userAnswer =input.nextInt();
				
				if (userAnswer == compAnswer){
					System.out.println("Congrats! You got it right!\n");
					}
				else {
					System.out.printf("%nOops! Wrong answer! The answer is: %d", compAnswer);
					System.out.println("\n");
				}
				
				
			}
			else if (choice == 2){
				num1 = (int)Math.floor(Math.random()*(max-min+1)+min); //random numbers
				num2 = (int)Math.floor(Math.random()*(max-min+1)+min);
				
				compAnswer = num1 - num2; //getting sum
				
				System.out.printf("%n%d - %d = : ", num1, num2); //displaying numbers + requesting answer
				userAnswer = input.nextInt();
				
				if (userAnswer == compAnswer){
					System.out.println("Congrats! You got it right!\n");
					}
				else {
					System.out.printf("%nOops! Wrong answer! The answer is: %d", compAnswer);
					System.out.println("\n");
				}

			}
		}
		while (choice != 9); //will end loop when user enters 9
		
		System.out.println("Thanks for playing!");
}
}