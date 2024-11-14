package week03.theory;

import java.util.Scanner;

public class NumberSystems {
	
//  _              $$\     $$\ $$\       $$\                               
// | |             $$ |    $$ |$$ |      \__|                              
// | |__  _   _  $$$$$$\   $$ |$$$$$$$\  $$\  $$$$$$\   $$$$$$\  $$$$$$$\  
// | '_ \| | | | \_$$  _|  $$ |$$  __$$\ $$ |$$  __$$\ $$  __$$\ $$  __$$\ 
// | |_) | |_| |   $$ |    $$ |$$ |  $$ |$$ |$$ |  \__|$$ /  $$ |$$ |  $$ |
// |_.__/ \__, |   $$ |$$\ $$ |$$ |  $$ |$$ |$$ |      $$ |  $$ |$$ |  $$ |
//         __/ |   \$$$$  |$$ |$$ |  $$ |$$ |$$ |      \$$$$$$  |$$ |  $$ |
//        |___/     \____/ \__|\__|  \__|\__|\__|       \______/ \__|  \__|

	
	public static void main(String[] args) {
		
		Scanner userIn = new Scanner(System.in);
		System.out.println("Binary/Decimal(1) # Binary/Hexadecimal(2) # Decimal/Hexadecimal(3)");
		
		int choice = userIn.nextInt();
		
		// BinDec
		if(choice == 1) {
			
			System.out.println("Binary to Decimal(1) # Decimal to Binary(2)"); //
			int choice_BD = userIn.nextInt();
			
			if(choice_BD == 1) {
				
				System.out.println("Please type an binary code(DO NOT type higher then 1 BYTE!): ");
				int binToDec = userIn.nextInt(); 
				
				//ERROR
				if(binToDec > 11111111) {
					
					System.out.println("Error Please Type 1Byte code.");
					
					return;
					
				}
				
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
				
				final int result = b1 + b2 + b3 + b4 + b5 + b6 + b7 + b8;
				
				System.out.println("Decimal Result: ");
				System.out.println(result);
				
			}
			
			else if(choice_BD == 2) {
				
				System.out.println("Please type an decimal code(DO NOT type higher then 256!): ");
				int decToBin = userIn.nextInt();
				
				//ERROR
				if(decToBin > 256) {
					
					System.out.println("Error Please Type Between 0 and 256");
					
					return;
					
				}
				
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

				//ERROR
				if(binToHex > 11111111) {
					
					System.out.println("Error Please Type 1Byte code.");
					
					return;
					
				}
				
				int b1 = binToHex            % 10; // 2^0
				int b2 = binToHex / 10       % 10; 
				int b3 = binToHex / 100      % 10;
				int b4 = binToHex / 1000     % 10;
				int b5 = binToHex / 10000    % 10;
				int b6 = binToHex / 100000   % 10;
				int b7 = binToHex / 1000000  % 10;
				int b8 = binToHex / 10000000 % 10; //2^7
						
				b1 = b1 * (int) Math.pow(2, 0);
				b2 = b2 * (int) Math.pow(2, 1);
				b3 = b3 * (int) Math.pow(2, 2);
				b4 = b4 * (int) Math.pow(2, 3);
				b5 = b5 * (int) Math.pow(2, 4);
				b6 = b6 * (int) Math.pow(2, 5);
				b7 = b7 * (int) Math.pow(2, 6);
				b8 = b8 * (int) Math.pow(2, 7);
				
				int decimalResult = b1 + b2 + b3 + b4 + b5 + b6 + b7 + b8;
				
				String hexDecimal = Integer.toHexString(decimalResult);
				hexDecimal = hexDecimal.toUpperCase();
				
				System.out.println("Hexadecimal Result: " + hexDecimal);
							
			}
			
			else if(choice_BH == 2) {
			
				System.out.println("Please type an Hexadecimal code(DO NOT type higher then FF!): ");
				
				String hexInput = userIn.next();
				int hexToBin = Integer.parseInt(hexInput, 16);
				
				System.out.println("Binary Result: " + hexToBin);
				
			}
			
			else {
				
				System.out.println("Error! Please use only 1 or 2.");
				
			}
			
		}
		
		
		// HexDec
		else if(choice == 3) {
			
			System.out.println("Decimal to Hexadecimal(1) # Hexadecimal to Decimal(2)");
			int choice_HD = userIn.nextInt();
			
			if(choice_HD == 1) {
				
				System.out.println("Please type an decimal code(DO NOT type higher then 256!): ");
				int decToHex = userIn.nextInt(); 
				
				//ERROR
				if(decToHex > 256) {
					
					System.out.println("Error Please Type Between 0 and 256");
					
					return;
					
				}
				
				String hexDecimal = Integer.toHexString(decToHex);
				hexDecimal = hexDecimal.toUpperCase();
				
				System.out.println("Hexadecimal Result: " + hexDecimal);
				
			}
			
			else if(choice_HD == 2) {
				
				System.out.println("Please type an Hexadecimal code(DO NOT type higher then FF!): ");
				
				String hexInput = userIn.next();
				int hexToDec = Integer.parseInt(hexInput, 16);
				
				System.out.println("Decimal Result: " + hexToDec);
				
			}
			
			else {
				
				System.out.println("Error! Please use only 1 or 2.");
				
			}
			
		}
		
		else {
			System.out.println("Error! Please use only 1, 2 or 3.");
		}
	}

}
