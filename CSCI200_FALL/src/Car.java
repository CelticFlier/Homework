//Car -
//State - Is Engine running / How much fuel remaining
//Behavior - Start Engine /  Stop Engine / Drive (reduce fuel remaining depend on how many miles you drive) /
//add fuel / TestBonus

public class Car {
    private boolean engineRunning = false; // default state of engine is off
    private double  mpg; //default mpg is set to 22 miles per gallon
    private double fuel; // initialize fuel as empty

    public void startEngine(){
        engineRunning=true;
        System.out.println("Engine started.");
    }// End start engine

    public void stopEngine(){
        engineRunning=false;
        System.out.println("Engine Stopped.");
    }//End Stop Engine

    public double addFuel (double gallons){
        fuel += gallons;
        System.out.println(gallons + " gallons added.\nNew Fuel level is: " + fuel);
        return fuel;

    }//end Add Fuel

    public void driveCar (double miles){

        if (engineRunning) {
            if (miles/mpg > fuel) {
                System.out.println("Your car ran out of gas after driving " +
                        mpg * fuel + " miles.");
                fuel = 0;
                engineRunning=false;
                System.out.println("Engine stopped due to no fuel.");
                return;
            }
            fuel -= Math.round(miles / mpg * 100.0) / 100.0;
            System.out.println("Car was driven for " + miles + " miles.");
            return;
        }
        System.out.println("Can't drive the car until you start it.");
    }//end Drive Car

    public String toString(){
        return "Fuel Remaining: " + fuel + " gallons. Engine running: " + engineRunning;
    }//end ToString

    public void SetMPG (int newMPG){
        mpg = newMPG;
        System.out.println("MPG: " + mpg);
    } //end SetMPG

    public Car (){
        engineRunning = false;
        fuel = 0.0;
        mpg = 20.0;
    } // end default constructor

    public Car ( double milesPerGallon, double initialFuel, boolean EngineState){
        engineRunning = EngineState;
        mpg = milesPerGallon;
        fuel = initialFuel;
    }// end defined constructor



}//End Bonus1
