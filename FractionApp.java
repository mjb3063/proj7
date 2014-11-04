import java.util.*;


public class FractionApp {
	public static void main (String [] arg) {

		Scanner keyboard = new Scanner (System.in);	


		System.out.println("Enter the problem:");
		String inputString = keyboard.nextLine();
		
		String [] holdingArray = new String [3];
		holdingArray = parseInputString(inputString, holdingArray);
		String passTogetNandD1 = holdingArray [0];
		String [] numAndDom1 = getNandD(passTogetNandD1);
		String passTogetNandD2 = holdingArray [2];
		String [] numAndDom2 = getNandD(passTogetNandD2);

		int n1 = Integer.parseInt(numAndDom1[0]);
		int d1 = Integer.parseInt(numAndDom1[1]);
		int n2 = Integer.parseInt(numAndDom2[0]);
		int d2 = Integer.parseInt(numAndDom2[1]);

		Fraction fraction1 = new Fraction (n1, d1);
		Fraction fraction2 = new Fraction (n2, d2);


	} // closes main


	public static String [] parseInputString (String inputString, String [] holdingArray) {

		String [] inputStringParse = new String [3];
		inputStringParse = inputString.split(" ");

		String newfraction1 = inputStringParse [0];
		String temp = inputStringParse [1];
		char sign = temp.charAt(0);
		String newfraction2 = inputStringParse [2];

// ******** for testing purposes 

		System.out.println(inputStringParse[0]);
		System.out.println(sign);
		System.out.println(inputStringParse[2]);

// ******** for testing purposes ^^^^

		return inputStringParse; // this turns into holding array
	} // closes the parseInputString


	public static String [] getNandD (String inputString) {

		String [] numAndDom = inputString.split("/");

// ******** for testing purposes 

		System.out.println(numAndDom [0]);
		System.out.println(numAndDom [1]);

// ******* for testing purposes 

		return numAndDom;

	} // closes getNandD




} // closes app



