proj7
=====
Implementation Requirements:
Your project will contain
two
classes:
Fraction
and
FractionApp
.
Specifics of the
Defining
Class
:
Fraction
will be a general class that represents a fraction
(used to create
Fraction
objects). It will have
instance variables for the numerator and denominato
r, 3 constructors to initialize their values (given
below),
and define the following methods (for maximum point
s, you must use method signatures given):
public Fraction(int n, int d) // #1) create Fract
ion object with passed in num, denom
public Fraction(int n) // #2) create Fraction ob
ject w/passed in num, denom=1
public Fraction() // #3) create Fraction object
with num =1, denom=1
Last constructor not used in the current FractionAp
p class, but is included for later compatibility
public String toString() // used to display frac
tion in format num/denom (ex: 2/3)
public boolean equals (Fraction f) // true if the
num/denum of 2 reduced fractions are equal
public Fraction plus(Fraction f) // adds 2 fractio
ns and returns reduced fraction result
public Fraction minus(Fraction f) // subtracts 2 f
ractions / returns reduced fraction result
public Fraction times(Fraction f) // multiplies 2
fractions / returns reduced fraction result
public Fraction divide(Fraction f) // divides 2 fr
actions / returns reduced fraction result
private
void reduce ( ) // modifies num/denom so fraction r
educed to lowest terms
(Suggestion: Call this method at the end of Constru
ctor #1 )
The
toString
method returns a string that can be used to displa
y the reduced fraction in the format
numerator/denominator
(i.e. 2/3 or 3/1). Do not
print
within the
toString
method. The
plus
method should
return a new
Fraction
object that is
THIS
Fraction (i.e. fraction object invoking the method
) plus
f
(i.e. the
fraction object pass to the method). The
minus
,
times
, and
divide
method will be similar, but with a different
operation. At some point, each
Fraction
should be reduced to lowest terms. Where or how yo
u do this is up
to you, but make sure they are reduced before they
are displayed.
Specifics of the
Application
Class
:
Your driver program (
FractionApp
)
should
contain only a main method – optional methods are
acceptable
as long as they are not a required part of the Frac
tion class (such as a
parseString
method) but try to keep to
a minimum.
Create an array that will hold 3
Fraction
objects – the first element will hold the first va
lue in the equation as
a reduced fraction; the second element will hold th
e second value as a reduced fraction; and the third
element will hold the
result
of the operation as a reduced fraction.
Get user input for the expression, which will have
two positive or negative values (two fractions, two
whole
numbers, or a combination of both), and an operatio
n, separated by a space. It should then create two
Fraction objects by parsing the string input, call
the appropriate operation method (
plus, minus, times,
or
divide
), and display the results by calling
toString
for each Fraction. Lastly, use your
equals
method to
determine if the two values in the expression are e
qual – display “
Fraction1 equals Fraction2”
or
“
Fraction2 does NOT equal Fraction2
”. (A loop is not required for this project).
You may assume that the user will enter the expres
sion using the following format:
4/8 – 3/12
or
3 + 2/3
or
12/16 * 4
or
-2/3 / 64/96
Notice that there are no spaces between the numerat
or, ‘/’, and denominator. There
are
spaces surrounding
the operation (-, +, *, /). Several executions of t
he program are given below.
Documentation:
You must put a description of the project at the to
p of the file
and at the top of each method
. Please use
this template for the top of the file:
/**
* (description of the project)
*
* @author (your name)
* @version (which number project this is)
*/
Please use this template for the top of each method
:
/**
* (description of the method)
*
* @param (describe first parameter)
* @param (describe second parameter)
* (list all parameters, one per line)
* @return (describe what is being returned)
*/
Submission:
To submit your project, first create a folder calle
d
proj7
and move your completed
Proj7.java
file into that
folder. Then, right-click on that folder and select
“
Send To

Compressed (zipped) folder
”. This will create
the file
proj7.zip
.
Go to “
Files and Content->Modules->File Dropbox
” on K-State Online. Select your lab time and uplo
ad
the proj7.zip file.
Put your name and Project 7 in the description box.
Grading:
Programs that do not compile will receive a grade o
f 0
.
Minimal
partial credit awarded if one
of the two compiles but the other does not. Program
s that
do
compile will be graded according to the
following rubric:
Requirement
Points
Fraction.java (Code)
-16-
3 correctly declared
Constructors
that follow given specifications on p.1
2
toString
method correctly defined with given method signatu
re on p.1
2
equals
method correctly defined with given method signatu
re on p.1
2
plus
method correctly defined with given method signatu
re on p.1
2
minus
method correctly defined with given method signatu
re on p.1
2
times
method correctly defined with given method signatu
re on p.1
2
divide
method correctly defined with given method signatu
re on p.1
2
private reduce
method correctly defined with given method signatu
re on p.1
2
- Rubric cont. on the next page -
