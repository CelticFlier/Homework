    /*
    Since Java is object-oriented language, concept of object
    and class is very important

    Properties of object:
        State: (information stored within object)
        State is represented by instance variable

        Behavior: (Operations that can be performed on the object)
        behavior is represented by instance method

        instance method can examine and/or change value stored in instance variable

        Form of a class declaration:
        Public class class-name {
            instance variable declaration
            constructor declaration
            instance method declaration
        }
        Instance variables and instance methods that
        belong to a particular kind of object are
        grouped together into a class
        Class is the template to create objects

     */
    public class Account {
        //instance variable declaration
        //state of account object is how much
        //balance is in the account
        //private or public is called access modifier
        //access modifier determines whether that entity
        //can be accessed by other class (public)
        //or only within the class itself (private)

        private double balance;
        // constructor declaration
        //constructor is used to initialize its instance variable

        // name of constructor "Account" must match class name
        public Account(double initialBalance) {
            //Provide initial value for balance when
            //object is created.
            balance = initialBalance;
        }
            //default constructor
            // Constructor without any parameters
        public Account (){
            balance = 0;

        }

        //Method overloading
        //two or more methods share same name
        //The Method must have different number of
        //or type of parameters

    //Advantage is fewer method names to remember
    //deposit money into account

    //instance method declaration
    public void Deposit (double amount) {
        //add amount to balance
        balance += amount;
    }

    //Withdraw money from the account
    public void Withdraw (double amount) {
            balance -= amount;
    }//End of withdraw

    //Balance inquiry
    public double GetBalance() {
            return balance;
        }//End of GetBalance


    //Close Account
    public void CloseAccount() {
            balance = 0;
    }    // End of CloseAccount

    //convert content of Account to string
    public String toString() {
            return "balance= " + balance;
    }//End of toString

}//End of class

