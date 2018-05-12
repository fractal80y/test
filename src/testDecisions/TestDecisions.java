/**
 * 
 */
package testDecisions;

import java.util.Scanner;

/**
 * @author Kkeogh
 *
 */
public class TestDecisions {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner myscanner = new Scanner(System.in);
		
		TestDecisions myobj = new TestDecisions();
		
		myobj.sortNums(myscanner);
		
		// test alphaToNumbers method with a few different inputs
		System.out.println(myobj.alphaToNumbers('A'));
		System.out.println(myobj.alphaToNumbers('C'));
		System.out.println(myobj.alphaToNumbers('f'));
		System.out.println(myobj.alphaToNumbers('D'));
		System.out.println(myobj.alphaToNumbers('e'));
		System.out.println(myobj.alphaToNumbers('g'));
		System.out.println(myobj.alphaToNumbers('H'));
		System.out.println(myobj.alphaToNumbers('M'));
		System.out.println(myobj.alphaToNumbers('Z'));

	}

	private int alphaToNumbers(char c) {
		int num;
		switch (c) {
		case 'A':
		case 'a':
		case 'B': 
		case 'b':
		case 'C':
		case 'c':
		case 'F':
		case 'f':   num = 10;
					break;
		case 'D':
		case 'd':
		case 'E':
		case 'e':
		case 'G':
		case 'g':	num=12;
					break;
		case 'H':
		case 'h':
		case 'J':
		case 'j':
		case 'M':
		case 'm':	num=6;
					break;
		default :   num=20;
					
				
		}
		return num;
		
	}

	private void sortNums(Scanner myscanner) {
		int num1, num2, num3;
		// ask user for 3 numbers
		System.out.print ("Please enter number 1 : ");
		num1 = myscanner.nextInt();
		System.out.print ("Please enter number 2 : ");
		num2 = myscanner.nextInt();
		System.out.print ("Please enter number 3 : ");
		num3 = myscanner.nextInt();
		
		// sort 3 numbers 
		// possibilities are: 
		// if num1 is less than num2 and num1 is less than num3 : 
		//   num1 < num2 < num3
		//   num1 < num3 < num2
		// if num2 is less than num3 and num2 is less than num1 :
		//   num2 < num3 < num1
		//   num2 < num1 < num3
		// if num3 is less than num1 and num3 is less than num2 :
		//   num3 < num1 < num2
		//   num3 < num2 < num1
		
		if ((num1 < num2) && (num1 < num3))
			if (num2 < num3) 
				System.out.println(num1 + " < " + num2 + " < " + num3);
			else 
				System.out.println(num1 + " < " + num3 +" < " + num2);
		else if ((num2 < num3) && (num2 < num1))
			if (num3 < num1)
				System.out.println(num2 + " < "+ num3 +" < " + num1);
			else 
				System.out.println(num2 + " < "+ num1 + " < " + num3);
		else // should be num3 < num1 and num3 < num2 if we get to here
			if (num1 < num2) 
				System.out.println(num3 + " < " + num1 + " < " + num2);
			else
				System.out.println(num3 + " < " + num2 + " < " + num1);
		
		
	}

}
