//Calculate Course Average
import java.util.Scanner;

public class CalculateCourseAverage {
    public static void main (String [] args){
        //create Scanner object
        Scanner scan = new Scanner(System.in);
        //prompt user to input two prgram score
        //program score is 0-20
        System.out.println("Enter Program 1 score: ");
        double program1 = scan.nextDouble();
        System.out.println("Enter Program 2 score: ");
        double program2 = scan.nextDouble();
        double programAverage = (program1 + program2) / 2.0;
        System.out.println("Average is :" + programAverage);
        //prompt user to enter quiz scores
        //quiz is between 0-10
        System.out.println("\nEnter Quiz1 Score: ");
        double quiz1 = scan.nextDouble();
        System.out.println("\nEnter Quiz2 score: ");
        double quiz2 = scan.nextDouble();
        double quizAverage = (quiz1 + quiz2)/2.0;
        System.out.println("\nQuiz Average is: " + quizAverage);


        //test and exam is 0-100
        System.out.println("Enter test1 score:");
        double test1 = scan.nextDouble();
        System.out.println("Enter test2 score:");
        double test2 = scan.nextDouble();
        System.out.println("Enter Final Exam Score: ");
        double finalexam = scan.nextDouble();
        double courseAverage= .30 * programAverage * 5 +
                .10 * quizAverage *10 +
                .15 * test1 +
                .15 * test2 +
                .30 * finalexam;
        long finalAverage = Math.round(courseAverage);
        System.out.println("Course Average is: " + finalAverage);

    }
}
