package week03.theory;

import java.util.Scanner;

public class NumberSystems {

	public static void main(String[] args) {
		
		Scanner userIn = new Scanner(System.in);
		System.out.println("Binary/Decimal(1) # Binary/Hexadecimal(2) # Decimal/Hexadecimal(3)");
		
		int choice = userIn.nextInt();
		
		// BinDec
		if(choice == 1) {
			
			System.out.println("Binary to Decimal(1) # Decimal to Binary(2)");
			int choice_BD = userIn.nextInt();
			
			if(choice_BD == 1) {
				
				System.out.println("Please type an binary code(DO NOT type higher then 1 BYTE!): ");
				int binToDec = userIn.nextInt(); 
				
				int b1 = binToDec            % 10; // 2^0
				int b2 = binToDec / 10       % 10; 
				int b3 = binToDec / 100      % 10;
				int b4 = binToDec / 1000     % 10;
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
				
				System.out.println("Decimal Result: ");
				System.out.println(b1 + b2 + b3 + b4 + b5 + b6 + b7 + b8);
				
			}
			
			else if(choice_BD == 2) {
				
				System.out.println("Please type an decimal code(DO NOT type higher then 255!): ");
				int decToBin = userIn.nextInt();
				int a; //left side
				int b; //  I
				int c; //  I
				int d; //  I
				int e; //  I
				int f; //  I
				int g; //  I
				int h; //right side
					
				h = decToBin       % 2;
				g = decToBin / 2   % 2;
				f = decToBin / 4   % 2;
				e = decToBin / 8   % 2;
				d = decToBin / 16  % 2;
				c = decToBin / 32  % 2;
				b = decToBin / 64  % 2;
				a = decToBin / 128 % 2;
					
				System.out.println("Binary Result: " + a + b + c + d + e + f + g + h);
				
			}
			
			else {
				
				System.out.println("Error! Please use only 1 or 2.");
				
			}
		}
		
		
		// BinHex
		else if(choice == 2) {
			
			System.out.println("Binary to Hexadecimal(1) # Hexadecimal to Binary(2)");
			int choice_BH = userIn.nextInt();
			
			if(choice_BH == 1) {
				
				System.out.println("Please type an binary code(DO NOT type higher then 1 BYTE!): ");
				int binToHex = userIn.nextInt(); 
				
			 String H10 = "A";
				String H11 = "B";
				String H12 = "C";
				String H13 = "D";
				String H14 = "E";
				String H15 = "F";
				
				int r1 = binToHex            % 10; // 2^0
				int r2 = binToHex / 10       % 10; 
				int r3 = binToHex / 100      % 10;
				int r4 = binToHex / 1000     % 10;
				int l1 = binToHex / 10000    % 10;
				int l2 = binToHex / 100000   % 10;
				int l3 = binToHex / 1000000  % 10;
				int l4 = binToHex / 10000000 % 10; //2^7
				
				r1 = r1 * (int) Math.pow(2, 0);
				r2 = r2 * (int) Math.pow(2, 1);
				r3 = r3 * (int) Math.pow(2, 2);
				r4 = r4 * (int) Math.pow(2, 3);
				
				l1 = l4 * (int) Math.pow(2, 0);
				l2 = l2 * (int) Math.pow(2, 1);
				l3 = l3 * (int) Math.pow(2, 2);
				l4 = l4 * (int) Math.pow(2, 3);
				
				int hexaDecR = r1 + r2 + r3 + r4; //right side of the hex 
				int hexaDecL = l1 + l2 + l3 + l4; //left side of the bin
				
				System.out.println("Hexadecimal Result: ");
				
			}
			
			else if(choice_BH == 2) {
				
			}
			
			else {
				
				System.out.println("Error! Please use only 1 or 2.");
				
			}
			
		}
		
		
		// HexDec
		else if(choice == 3) {
			
		}
		
		else {
			System.out.println("Error! Please use only 1, 2 or 3.");
		}
	}

}
