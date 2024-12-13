import java.util.ArrayList;
import java.util.Scanner;

public class TicketReservationSystem {
    private ArrayList<Ticket> tickets;

    public TicketReservationSystem() {
        tickets = new ArrayList<>();
    }

    public void addTicket(Ticket ticket) {
        tickets.add(ticket);
    }

    public void showAllTickets() {
        if (tickets.isEmpty()) {
            System.out.println("No tickets booked yet.");
        } else {
            for (Ticket ticket : tickets) {
                System.out.println(ticket.getTicketInfo());
                System.out.println("----------------------");
            }
        }
    }

    public static void main(String[] args) {
        TicketReservationSystem system = new TicketReservationSystem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Book a Ticket");
            System.out.println("2. View All Tickets");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (choice == 1) {
                System.out.print("Enter Passenger Name: ");
                String name = scanner.nextLine();
                System.out.print("Enter Base Fare: ");
                double baseFare = scanner.nextDouble();
                System.out.println("Select Class:\n1. Economy\n2. Business\n3. First Class");
                int classChoice = scanner.nextInt();

                Ticket ticket = null;
                if (classChoice == 1) {
                    ticket = new EconomyTicket(name, baseFare);
                } else if (classChoice == 2) {
                    ticket = new BusinessTicket(name, baseFare);
                } else if (classChoice == 3) {
                    ticket = new FirstClassTicket(name, baseFare);
                }

                if (ticket != null) {
                    system.addTicket(ticket);
                    System.out.println("Ticket booked successfully!");
                } else {
                    System.out.println("Invalid class selection.");
                }
            } else if (choice == 2) {
                system.showAllTickets();
            } else if (choice == 3) {
                System.out.println("Thank you for using the Ticket Reservation System!");
                break;
            } else {
                System.out.println("Invalid option. Try again.");
            }
        }

        scanner.close();
    }
}