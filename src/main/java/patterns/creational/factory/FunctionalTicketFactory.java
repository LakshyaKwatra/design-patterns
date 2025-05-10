package patterns.creational.factory;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class FunctionalTicketFactory {
    private static final Map<TicketType, Supplier<Ticket>> ticketMap = new HashMap<>();

    static {
        ticketMap.put(TicketType.BUS, BusTicket::new);
        ticketMap.put(TicketType.TRAIN, TrainTicket::new);
    }
    Ticket createTicket(TicketType ticketType) {
        return ticketMap.get(ticketType).get();
    }
}
