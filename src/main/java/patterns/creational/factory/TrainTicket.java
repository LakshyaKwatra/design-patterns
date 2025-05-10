package patterns.creational.factory;

public class TrainTicket implements Ticket{
    @Override
    public int getPrice() {
        return 500;
    }
}
