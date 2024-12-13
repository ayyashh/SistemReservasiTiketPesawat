public class FirstClassTicket extends Ticket {
    public FirstClassTicket(String passengerName, double baseFare) {
        super(passengerName, baseFare);
    }

    @Override
    public double calculateFare() {
        return getBaseFare() * 1.5; // Tambahan 50%
    }

    @Override
    public String getFacilities() {
        return "Luxury Seat, Wi-Fi, Gourmet Meals, Lounge Access";
    }

    @Override
    public double getBaggageLimit() {
        return 40.0; // 40 kg
    }
}