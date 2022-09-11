public class TestCar {
    public static void main (String[] args) {

        Car mycar = new Car(23.5, 25.0, false);

        //Display initial status of the car
        System.out.println("Car 1: " +mycar + "\n");

        //Attempt to drive the car without starting it
        System.out.println("Attempting to Drive 250 miles.");
        mycar.driveCar(250.0);
        System.out.println("Car 1: " + mycar + "\n");

        //Start the car
        mycar.startEngine();
        //Drive 250 miles
        System.out.println("Attempting to drive 250 miles.");
        mycar.driveCar(250.0);
        System.out.println("Car 1: " + mycar + "\n");

        //Create 2nd car with 18 mikes per gallon and 12 gallons of fuel
        Car mycar2 = new Car();
        System.out.println("Car 2: " + mycar2);
        mycar2.SetMPG(18);
        mycar2.addFuel(12.3);
        mycar2.startEngine();
        //Drive more than you have fuel for
        System.out.println("Attempting to drive 1000 miles.");
        mycar2.driveCar(1000.0);
        System.out.println("Car 2: " + mycar2 + "\n");
    }
}
