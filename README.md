proj7
=====
Implementation Requirements:
Your project will contain two classes: Fraction and FractionApp. Specifics of the Defining Class:

Fraction will be a general class that represents a fraction
(used to create Fraction objects). 

It will have instance variables for the numerator and denominator, 
3 constructors to initialize their values (given below),
and define the following methods (for maximum point
s, you must use method signatures given):

public Fraction(int n, int d) // #1) create Fraction object with passed in num, denom

public Fraction(int n) // #2) create Fraction object w/passed in num, denom=1

public Fraction() // #3) create Fraction object with num =1, denom=1
Last constructor not used in the current FractionApp class, but is included for later compatibility

public String toString() // used to display fraction in format num/denom (ex: 2/3)

public boolean equals (Fraction f) // true if the num/denum of 2 reduced fractions are equal

public Fraction plus(Fraction f) // adds 2 fractions and returns reduced fraction result

public Fraction minus(Fraction f) // subtracts 2 fractions / returns reduced fraction result

public Fraction times(Fraction f) // multiplies 2 fractions / returns reduced fraction result

public Fraction divide(Fraction f) // divides 2 fractions / returns reduced fraction result

private void reduce ( ) // modifies num/denom so fraction reduced to lowest terms
(Suggestion: Call this method at the end of Constructor #1 )

The toString method returns a string that can be used to display the reduced fraction in the format
numerator/denominator (i.e. 2/3 or 3/1). Do not print within the toString method. The plus method should
return a new Fraction object that is THIS Fraction (i.e. fraction object invoking the method) plus f
(i.e. thefraction object pass to the method). Theminus,times, and divide method will be similar, but with a different operation. At some point, each Fraction should be reduced to lowest terms. Where or how you do this is up
to you, but make sure they are reduced before they are displayed.

Specifics of the Application Class: 

Your driver program (FractionApp) should contain only a main method – optional methods are acceptable
as long as they are not a required part of the Fraction class (such as a parseString method)
but try to keep to a minimum.  Create an array that will hold 3 Fraction objects – the first element will 
hold the first value in the equation as a reduced fraction; the second element will hold the second value as a 
reduced fraction; and the third element will hold the result of the operation as a reduced fraction.

Get user input for the expression, which will have two positive or negative values (two fractions, two
whole numbers, or a combination of both), and an operation, separated by a space. It should then create two
Fraction objects by parsing the string input, call the appropriate operation method (plus, minus, times,
or divide), and display the results by calling toString for each Fraction. Lastly, use your equals
method to determine if the two values in the expression are equal – display “Fraction1 equals Fraction2”
or “Fraction2 does NOT equal Fraction2”. (A loop is not required for this project).

You may assume that the user will enter the expression using the following format:
4/8 – 3/12 or 3 + 2/3 or 12/16 * 4 or -2/3 / 64/96 Notice that there are no spaces between the numerat
or, ‘/’, and denominator. There are spaces surrounding the operation (-, +, *, /). Several executions of t
he program are given below. 

Documentation: You must put a description of the project at the top of the file and at the top of each method. 
Please usethis template for the top of the file:

/**
* (description of the project)
*
* @author (your name)
* @version (which number project this is)
*/

Please use this template for the top of each method:

/**
* (description of the method)
*
* @param (describe first parameter)
* @param (describe second parameter)
* (list all parameters, one per line)
* @return (describe what is being returned)
*/

Submission: To submit your project, first create a folder called proj7