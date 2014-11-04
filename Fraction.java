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
		return this.numerator + " / " + this.denominator;
	} // closes toString


	public boolean equals (Fraction f) {

		return ((numerator == f.numerator) && (denominator == f.denominator));
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

	private void reduce (Fraction f) {

	
	} // closes reduce


} // closes class FractionObject




