package patterns.creational.factory;

public class BusTicket implements Ticket{
    @Override
    public int getPrice() {
        return 100;
    }
}
