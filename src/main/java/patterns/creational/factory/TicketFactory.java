package patterns.creational.factory;

public class TicketFactory{
    Ticket createTicket(TicketType ticketType) {
        if(ticketType.equals(TicketType.BUS)) {
            return new BusTicket();
        } else {
            return new TrainTicket();
        }
    }
}
