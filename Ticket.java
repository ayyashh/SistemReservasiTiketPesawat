public abstract class Ticket {
    private String passengerName;
    private double baseFare;

    public Ticket(String passengerName, double baseFare) {
        this.passengerName = passengerName;
        this.baseFare = baseFare;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public double getBaseFare() {
        return baseFare;
    }

    public abstract double calculateFare();
    public abstract String getFacilities();
    public abstract double getBaggageLimit();

    public String getTicketInfo() {
        return "Passenger: " + passengerName +
               "\nClass: " + this.getClass().getSimpleName() +
               "\nBase Fare: " + baseFare +
               "\nFinal Fare: " + calculateFare() +
               "\nFacilities: " + getFacilities() +
               "\nBaggage Limit: " + getBaggageLimit() + " kg";
    }
}