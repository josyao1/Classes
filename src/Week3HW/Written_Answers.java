package Week3HW;

public class Written_Answers {
	/*
R4.1
S = s0 + v0 * t + .5 * g * t * t
G = 4 * Math.pi * Math.pi * ((a * a * a) / (p2 * m1 + p2 * m2))
FV = PV * Math.pow((1 + (INT / 100 )), YRS)
c = Math.sqrt(a * a + b * b - 2 * a * b * Math.acos(y))

R4.2
On desktop

R4.3
This would divide the numerator of the quadratic formula all by two instead of dividing it by (2 * a)

R4.4
When you add one to an integer's MAX_VALUE, it turns the whole number negative. If you used a float, this problem
wouldn't happen. The floating round off would happen when you try to represent the number pi. Because there are
so many digits it would produce a roundoff error. I think integers still have these types of errors. 

R4.5
The returned output has a lot of digits because of how numbers are stored in Java. They are not stored exactly 
because the computer is unable to do such a thing. As a result, there are very tiny decimals that pop up at the 
end. To solve this issue, you can use the BigDecimal type.

R4.6
For n = (int) x, this would convert a number like 4.65 to just 4. All is does is chop off the decimals
For (int) Math.round(x) this would convert a number like 4.65 to 5. It would first round the digit and then 
change it to an integer type

R4.7
For n = (int) (x+0.5), it would first add x and 0.5 together and then convert the result to int by removing the
decimals afterward
For n = (int) Math.round(x), it would do the same as stated in 4.6

R4.9
The first example adds two integers of the number two together creating the number four
The second example adds two strings of the number 2 creating a string "22"

R4.11
a. True
b. False
c. True

R4.12
Getting first and last of a string:
String test = "Computer"
String first = test.substring(length()-1)
String last = test.substring(0,1);
String removeFirst = test.substring(1);
String removeLast = test.substring(0,test.length()-1);



R4.13
To find the last digit, all you need to do is 23456 % 10 which would return the number 6
To find the first digit, you constantly divide the integer number by ten. You would be write a loop that divides
the number by ten x times and return the final answer. The loop would check each time that the number was still 
bigger than ten and return the number when the original number becomes less than ten

R4.15
A final variable is a variable that will not and can not be changed by any lines of code. It has a permanent 
designated value

R4.16
a.
6.25

b.
6

c.
12.5

d.
1.41.......

e.
3

f.
2

g.
HelloWorld

h.
Hello4

i.
-3

R6.2
Expressions are the building block of any Java program. The usually are created to produce a new value or 
assign something to a new value. i.e. x+y

Conditions are lines of code that get checked and based off of whether does statements are true of false, 
certain lines of code are executed. if(size <= 10)

Statements are like sentences in a normal speaking language. A statement executes something. For example, an 
increment statement would be: value ++

A simple statement is another type of building block for java code. It requires less lines. For example, 
an assignment statement is a simple statement. x = 5;

A compound statement consists of more than one statement. For example, for(int i=5, i <= 10, i ++) is a 
compound statement

Block statements are statements that are grouped together within curly braces. For example, in the triangle 
class, the following is a block statement:
{
        x1 = X1;
        x2 = X2;
        x3 = X3;
        y1 = Y1;
        y2 = Y2;
        y3 = Y3;
        
}

R6.3
When we execute an if/else if/ else statement, the statements are executed from top down. As soon as one of the
conditions is met, the rest of the ladder is ignored. A nested if condition is when there is an if statement 
within another if statement. The second if statement within is only tested if the first one is true or it is just
bypassed

R6.4
If the parameters for the if and else if statements are i >= 5 and i < 5, the order will not matter because
whatever the input is, you know for a fact that one of these conditions will be false and one will be true. 
However, if there could be multiple conditions that would be satisfied in the if/else if/else ladder, than you 
must be careful as to what order to put them in because the program is run top down. 

R6.8
True

R6.9
For the first example, if both x and y are greater than 0, the variable s will be incremented twice
For the second example, if both x and y are greater than 0, the varibale s will only be incremented once.

R6.12
The "==" can check the equality of more things than the equal method. The == operator can check the locations
or pointer arrows (in the box diagrams) while the equal method can only do content comparison.  

R6.13
Like stated above, the equal sign will check if both r and s are pointing at the same location while the equal 
equal method checks if the rectangle they are pointing to is the same. (not sure)

R6.14
Because there is no initialized variable that the equal method can check, this resuls in an error. 


 */



}
