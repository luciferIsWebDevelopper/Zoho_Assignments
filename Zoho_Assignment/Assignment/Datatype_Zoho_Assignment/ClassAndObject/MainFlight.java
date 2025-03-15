package Assignment.ClassAndObject;

public class MainFlight {
    public static void main(String[] args) {
        Flight flight=new Flight(456);
        flight.setFlightName("Zoho Airlines");
        flight.setStartingPoint("Chennai");
        flight.setEndingPoint("Japan");
        flight.setNoOfStaffs(12);
        flight.setNoOfPassengers(108);
        // flight.setFlightId(0);
        /*
         * flight id can't be changed because every flight there needs be an unique name 
         */
        System.out.println("Flight Id: "+ flight.getFlightId());
        System.out.println("Flight Name: "+ flight.getFlightName());
        System.out.println("Flight Starting Point: "+ flight.getStartingPoint());
        System.out.println("Flight Ending Point: "+ flight.getEndingPoint());
        System.out.println("Flight No Of Passengers: "+ flight.getNoOfPassengers());
        System.out.println("Flight No Of Staffs: "+ flight.getNoOfStaffs());
        System.out.println("Before takeOff: ");
        flight.isTakeOff();
        flight.isArrived();
        System.out.println("After takeOff");
        flight.takeOff();
        flight.isTakeOff();
        System.out.println("Before landed");
        flight.isArrived();
        flight.landed();
        System.out.println("After landed");
        flight.isArrived();        

        Flight flight1=new Flight(456);
        flight1.setFlightName("MGB Airlines");
        flight1.setStartingPoint("Madurai");
        flight1.setEndingPoint("Kailash");
        flight1.setNoOfStaffs(25);
        flight1.setNoOfPassengers(456);
        // flight1.setFlightId(1);
        /*
         * flight id can't be changed because every flight there needs be an unique name 
         */
        System.out.println("Flight Id: "+ flight1.getFlightId());
        System.out.println("Flight Name: "+ flight1.getFlightName());
        System.out.println("Flight Starting Point: "+ flight1.getStartingPoint());
        System.out.println("Flight Ending Point: "+ flight1.getEndingPoint());
        System.out.println("Flight No Of Passengers: "+ flight1.getNoOfPassengers());
        System.out.println("Flight No Of Staffs: "+ flight1.getNoOfStaffs());
        System.out.println("Before takeOff: ");
        flight1.isTakeOff();
        flight1.isArrived();
        System.out.println("After takeOff");
        flight1.takeOff();
        flight1.isTakeOff();
        System.out.println("Before landed");
        flight1.isArrived();
        flight1.landed();
        System.out.println("After landed");
        flight1.isArrived(); 
    }
}
