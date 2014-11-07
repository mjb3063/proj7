import java.util.*;


public class Fraction {

	Scanner keyboard = new Scanner (System.in);

	int numerator;
	int denominator;
	
	public Fraction (int n, int d) {
		numerator = n;
		denominator = d;
	} // closes fraction 2 variable


	public Fraction (int n) {
		numerator = n;
		denominator = 1;
	} // closes fraction 1 variable 


	public Fraction () {
		numerator = 1;
		denominator = 1;
	} // closes fraction 0 variable


	public String toString () {
		return this.numerator + "/" + this.denominator;
	} // closes toString


	public boolean equals (Fraction f) {

		return ((this.numerator == f.numerator) && (this.denominator == f.denominator));
	} // closes Boolean


	public Fraction plus (Fraction f) {

		int newDenom = this.denominator * f.denominator;
		int newNum1 = this.numerator * f.denominator;
		int newNum2 = f.numerator * this.denominator;
		int num3 = newNum1 + newNum2;
		Fraction fraction3 = new Fraction (num3, newDenom);

		return fraction3;
	} // closes Plus


	public Fraction minus (Fraction f) {
		int newDenom = this.denominator * f.denominator;
		int newNum1 = this.numerator * f.denominator;
		int newNum2 = f.numerator * this.denominator;
		int num3 = newNum1 - newNum2;
		Fraction fraction3 = new Fraction (num3, newDenom);

		return fraction3;
	} // closes Minus


	public Fraction times (Fraction f) {
		int newDenom = this.denominator * f.denominator;
		int newNum = this.numerator * f.numerator;
		Fraction fraction3 = new Fraction (newNum, newDenom);
		return fraction3;
	} // closes Times


	public Fraction divide (Fraction f) {
		int newNum = this.numerator * f.denominator;
		int newDenom = this.denominator * f.numerator;
		Fraction fraction3 = new Fraction(newNum, newDenom);
		return fraction3;
	} // closes divide

	public void reduce () {
		int temp = 1;

		if (numerator < 1) {
			temp = -1;
			numerator = (numerator * (-1));
		} // closes temp to make to positive number

		//System.out.println("the numerator is now: " + numerator); // for testing purposes only

		for (int i = 9; i > 1; i--){
			if ((numerator % i == 0) && (denominator % i == 0)){
				numerator = numerator/i;
				denominator = denominator/i;
			} // closes if
		} //closes for
		
		if (temp == -1) {
			numerator = (numerator * (-1));
		} // changes back to neg number


	} // closes reduce
} // closes class FractionObject




