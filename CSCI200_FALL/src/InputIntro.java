import java.util.Scanner;

public class InputIntro {
    //This lecture will discuss how to get input from user.

    public static void main (String [] args){
        //Define two constants
        final double FREEZING_POINT = 32.0;
        final double DEGREE_RATIO = 5.0 / 9.0;
        double farenheit;
        // create a Scanner object that reads from the keyboard
        Scanner scan = new Scanner(System.in);
        //System.in is keyboard
        System.out.println("Enter Farenheit temperature: ");
        farenheit = scan.nextDouble(); //I want to get double value from user
        System.out.println(farenheit);
        //convert farenheit to celsius
        double celsius = (farenheit - FREEZING_POINT) * DEGREE_RATIO;
        System.out.println("Celsius equivalent: " + celsius);


    }//End of Main

} //End of Class
