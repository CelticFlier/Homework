//Method Output Intro
//introduce how to print out information on the screen.

public class MethodOutputIntro {
    public static void main(String [] args) {
        //Method is a series of statements
        //that can be run as a unit
        //Method is useful for reusing code
        // math class in the library
        //which contains a number of methods
        //for performing mathematical operations
        System.out.println("Start Output for MethodOutputIntro");

        double i = Math.pow(2.0,3.0);
        System.out.println("i: " + i);

        double k = Math.abs(-2.0);
        System.out.println("k: " + k);

        k = Math.max(12,-23);
        System.out.println("k: " + k);

        double x = -2.9;
        //We can combine Several
        //math methods into one statement
        double z = Math.sqrt(Math.abs(x));
        System.out.println("z: " + z);

        long m = Math.round(4.9);
        System.out.println("M: " + m);

        //This section will discuss
        //how to display output on the screen

        //String is any series of letters
        //encoded by double quotes

        System.out.println("Hey Joe");
        System.out.println(); //Write a blank line
        //Second way is to insert \n to string
        System.out.println("A hop,\na Skip, \n\nand a jump");
        //\n Is called new-line character

        //\" represents double quotes
        System.out.println("He yelled \"Stop!\" and we stopped.");

        //To print a backslash as a part of a string you need two \\
        System.out.println("APL\\360");

        //+ operator is used to combine multiple
        //items into a string
        double n = 3.4;
        System.out.println("n: " + n);


    }

} //End of Class
