package Assignment.ClassAndObject;

public class Flight {
    int flightId;
    String flightName;
    String startingPoint;
    String EndingPoint;
    int noOfPassengers;
    int noOfStaffs;
    boolean start;
    boolean stop;
    Flight(int flightId){
        this.flightId=flightId;
    }
    public int getFlightId() {
        return flightId;
    }

    protected void setFlightId(int flightId) {
        this.flightId = flightId;
    }

    public String getFlightName() {
        return flightName;
    }

    public void setFlightName(String flightName) {
        this.flightName = flightName;
    }

    public String getStartingPoint() {
        return startingPoint;
    }

    public void setStartingPoint(String startingPoint) {
        this.startingPoint = startingPoint;
    }

    public String getEndingPoint() {
        return EndingPoint;
    }

    public void setEndingPoint(String endingPoint) {
        EndingPoint = endingPoint;
    }

    public int getNoOfPassengers() {
        return noOfPassengers;
    }

    public void setNoOfPassengers(int noOfPassengers) {
        this.noOfPassengers = noOfPassengers;
    }

    public int getNoOfStaffs() {
        return noOfStaffs;
    }

    public void setNoOfStaffs(int noOfStaffs) {
        this.noOfStaffs = noOfStaffs;
    }

    void takeOff() {
        System.out.println("Flight Started");
        start = true;
    }

    void isTakeOff() {
        if (start)
            System.out.println("The Flight has started");
        else
            System.out.println("The Flight is not started");
    }

    void landed() {
        stop = false;
        stop=true;
    }
    void isArrived(){
        if(start){
            if(stop) System.out.println("The Flight has arrived at landing point");
            else System.out.println("The flight is in Air");
        }
        else{
            System.out.println("The Flight has not started");
        }
    }
}
