package week03.theory;

import java.util.Scanner;

public class NumberSystems {

	public static void main(String[] args) {
		
		Scanner userIn = new Scanner(System.in);
		System.out.println("Binary/Decimal(1) # Binary/Hexadecimal(2) # Decimal/Hexadecimal(3)");
		
		int choice = userIn.nextInt();
		
		if(choice == 1) {
			
			System.out.println("Binary to Decimal(1) # Decimal to Binary(2)");
			int choice_BD = userIn.nextInt();
			
			if(choice_BD == 1) {
				
				System.out.println("Please type an binary code(DO NOT type higher then 1 BYTE!): ");
				int binToDec = userIn.nextInt(); 
				
				int b1 = binToDec            % 10; // 2^0
				int b2 = binToDec / 10       % 10; 
				int b3 = binToDec / 100      % 10;
				int b4 = binToDec / 1000     % 10; // Expml. 10101010
				int b5 = binToDec / 10000    % 10;
				int b6 = binToDec / 100000   % 10;
				int b7 = binToDec / 1000000  % 10;
				int b8 = binToDec / 10000000 % 10; //2^7
						
				b1 = b1 * (int) Math.pow(2, 0);
				b2 = b2 * (int) Math.pow(2, 1);
				b3 = b3 * (int) Math.pow(2, 2);
				b4 = b4 * (int) Math.pow(2, 3);
				b5 = b5 * (int) Math.pow(2, 4);
				b6 = b6 * (int) Math.pow(2, 5);
				b7 = b7 * (int) Math.pow(2, 6);
				b8 = b8 * (int) Math.pow(2, 7);
				
				System.out.println(b1 + b2 + b3 + b4 + b5 + b6 + b7 + b8);
				
			}
			
			else if(choice_BD == 2) {
				
			}
			
			else {
				System.out.println("Error! Please use only 1 or 2.");
			}
		}
		
		else if(choice == 2) {
			
		}
		
		else if(choice == 3) {
			
		}
		
		else {
			System.out.println("Error! Please use only 1, 2 or 3.");
		}
	}

}
