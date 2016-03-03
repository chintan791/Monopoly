import java.util.Random;
import java.util.Scanner;

public class Monopoly {

	public static void main(String[] args) {
	
		System.out.println("roll a dice");
		
		Scanner keyboard = new Scanner(System.in);
		
		int dice1, dice2; 
		
		System.out.println("First number is:");
		dice1 = keyboard.nextInt();
		
		System.out.println("Second number is:");
		dice2 = keyboard.nextInt();
		
		int counter=1;
		
		while (dice1==dice2)
		{
			if (dice1 == dice2 )
				
			
			System.out.println("First number is:");
			dice1 = keyboard.nextInt();
			
			System.out.println("Second number is:");
			dice2 = keyboard.nextInt();
				
			counter++ ;
			
			 if (counter >= 3)
				break;
			
		}	
		
		
		if (dice1 != dice2)
		{
				System.out.println("Next Player");
				
			
		}
		
		else 
			
		{
		
		
		
				System.out.println("Go To Jail");
				 
		}	
				
		}


}
