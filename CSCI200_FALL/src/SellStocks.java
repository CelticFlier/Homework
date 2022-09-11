import java.util.Scanner;

public class SellStocks {
    public static void main (String[] args){
        //Prompt user for the number of stocks and get from keyboard
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of stocks that you are selling: ");
        double shares = scan.nextDouble();

        //Prompt user for the stock price and retrieve answer from keyboard
        System.out.println("Please enter the stock price: ");
        double price = scan.nextDouble();

        //Get the commission on the sale as a percentage
        System.out.println("Please enter the commission percentage: ");
        double commission = scan.nextDouble();

        //Calculate the actual commission on the sale
        commission = Math.round(commission* price * shares) / 100.0;
        System.out.println("Commissions on sale: $" + commission);

        //Calculate the proceeds from the sell minus commision
        //Multiply result by 100, use Math.round and then
        //divide by 100 to get the end result rounded to 2 decimal places
        double proceeds =Math.round(price * shares *100.0)/100.0;
        proceeds = Math.round(proceeds * 100.0 - commission * 100.0)/100.0;
        System.out.println("Proceeds from sale: $" + proceeds);

    }
}
