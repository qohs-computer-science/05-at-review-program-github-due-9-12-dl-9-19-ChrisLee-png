/*
 * TODO: Christopher Lee
 * TODO: 9/10/25
 * TODO: Pd 6
 * TODO: Program will ask the user for their name, age, favorite 3+ digit number, and GPA  (cumulative, weighted). The program will then print out a set of messages based on them.
 */
//Yes, I know the file name should be something like ReviewProgram - working on it!
import java.util.Scanner;
public class HelloWorld {

	public static void main(String[] args) {
		//TODO: Implement Program Requirements Here
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter your name: ");
    	String name = scanner.nextLine();
		System.out.println("Please enter your age: ");
    	int age = scanner.nextInt();
		System.out.println("Please enter your favorite 3+ digit number: ");
    	int num = 0;
		while(num/100<1){
			num = scanner.nextInt();
		}
		System.out.println("Please enter your GPA(cumulative): ");
    	int gpaC = scanner.nextInt();
		while(gpaC>4||gpaC<0){
			gpaC = scanner.nextInt();
		}
		System.out.println("Please enter your GPA(weighted): ");
    	double gpaW = -1;
		while(gpaW>5||gpaW<0){
			gpaW = scanner.nextDouble();
		}
		scanner.close();
		System.out.println( "\nWelcome " + name + " to this program");
		if(age>17)
			System.out.println("\nCongratulations, you are 18 and able to vote");
		else	
			System.out.println("\nYou have " + (18-age) + " years until you’re 18 and able to vote");

		if(gpaW>4.49)
			System.out.println("\nCongratulations, you have a high A\n");
		else if(gpaW>3.99)
			System.out.println ("\nCongratulations, you have an A \n");
		else if(gpaW>3.49)
			System.out.println("\nCongratulations, you have a high B \n");
		else if(gpaW>2.99)
			System.out.println("\nCongratulations, you have a B \n");
		else 
			System.out.println("\nYou’re trying your hardest\n");
	int e = name.length();
	while(e<=num){
		System.out.print( e + ",");
		e+= name.length();
	}
	}

}
