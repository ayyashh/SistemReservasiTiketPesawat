public class BusinessTicket extends Ticket {
    public BusinessTicket(String passengerName, double baseFare) {
        super(passengerName, baseFare);
    }

    @Override
    public double calculateFare() {
        return getBaseFare() * 1.25; // Tambahan 25%
    }

    @Override
    public String getFacilities() {
        return "Reclining Seat, Wi-Fi, Priority Check-in";
    }

    @Override
    public double getBaggageLimit() {
        return 30.0; // 30 kg
    }
}