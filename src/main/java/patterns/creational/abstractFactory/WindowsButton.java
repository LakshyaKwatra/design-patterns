package patterns.creational.abstractFactory;

public class WindowsButton implements Button{
    @Override
    public String render() {
        return "Windows Button";
    }
}
