public class EconomyTicket extends Ticket {
    public EconomyTicket(String passengerName, double baseFare) {
        super(passengerName, baseFare);
    }

    @Override
    public double calculateFare() {
        return getBaseFare() * 0.9; // Diskon 10%
    }

    @Override
    public String getFacilities() {
        return "Standard Seat, No Wi-Fi";
    }

    @Override
    public double getBaggageLimit() {
        return 20.0; // 20 kg
    }
}