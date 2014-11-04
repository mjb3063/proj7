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

		Fraction [] fractionArray = new Fraction [3]; // makes object array

		Fraction fraction1 = new Fraction (n1, d1);
		Fraction fraction2 = new Fraction (n2, d2);
		fractionArray[0] = fraction1;
		fractionArray[1] = fraction2;

		char signChar = holdingArray[1].charAt(0); // this makes the sign a char
		int signInt = (int)signChar; // this converts the char to a ASCII int

		//System.out.println(signInt); // for testing purposes only

		if (signInt == 43) { // this is plus
			fractionArray[2] = fraction1.plus(fraction2);
		} // closes plus for
		else if(signInt == 45) { // this is minus
			fractionArray[2] = fraction1.minus(fraction2);
		} // closes minus for
		else if(signInt == 42) { // this is multiply
			fractionArray[2] = fraction1.times(fraction2);
		} // closes multiply for
		else { //this is divide
			fractionArray[2] = fraction1.divide(fraction2);
		} // closes divide for

		System.out.println("The answer is: " + fractionArray[2].toString());

	} // closes main


	public static String [] parseInputString (String inputString, String [] holdingArray) {

		String [] inputStringParse = new String [3];
		inputStringParse = inputString.split(" ");

		String newfraction1 = inputStringParse [0];
		String temp = inputStringParse [1];
		char sign = temp.charAt(0);
		String newfraction2 = inputStringParse [2];

// ******** for testing purposes 

		//System.out.println(inputStringParse[0]);
		//System.out.println(sign);
		//System.out.println(inputStringParse[2]);

// ******** for testing purposes ^^^^

		return inputStringParse; // this turns into holding array
	} // closes the parseInputString


	public static String [] getNandD (String inputString) {

		String [] numAndDom = inputString.split("/");

// ******** for testing purposes 

		//System.out.println(numAndDom [0]);
		//System.out.println(numAndDom [1]);

// ******* for testing purposes 

		return numAndDom;

	} // closes getNandD




} // closes app



