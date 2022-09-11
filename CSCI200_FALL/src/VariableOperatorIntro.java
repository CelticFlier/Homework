public class VariableOperatorIntro {
    public static void main (String [] args){
        //Variable is a piece of memory
        //that can contain a data value
        //how to declare a variable
        //type, name semicolon

        int i;
        //int is integer

        //give initial value
        i = 0; //Initialize to 0

        //you can change the value of i
        i = 5;

        //type of variable
        // int - integer
        // double - floating number
        //boolean - true or false
        //char - character

        //arrays written as i[0]

        double y = 1.2;
        boolean k = true;
        char ch = 'f';

		/*
        performing calculation
        Java's arithmetic operators
                +
                -
                *
		    	/
			    %
		 */

        //integer division vs floating
        //point division
        //if both operands are integer
        //the result will be integer
        //fractional part is discarded

        int b = 9 / 4; // result is 2
        int c = 9 % 4; // result is 1 - which is the remainder after dividing 9 by 4
        System.out.println ("value of b: " + b);

        double t = 9.0 / 4.0; //result - 2.25
        System.out.println("Value of t: " + t);
        System.out.println("Value of c:" + c);

        //Aug 26 Begins here

        //assignment operator
        int count = 2;
        count = count + 1;
        System.out.println("Count: " + count);

        //compound assignment
        i = 4;
        i += 2; //i = i + 2  6
        i -= 2; //i = i - 2  4
        i *= 2; //i = i * 2  8
        i /= 2; // i = i / 2 4
        i %= 2; // i = i % 2 0

        System.out.println("i: " + i );

        //Constant (Value that
        //doesn't change during running of
        //a program

        final double FREEZING_POINT = 32.0;


    }

}
