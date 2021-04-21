package Client;

public class DisplayMassage implements Client {

    private double price;
    private int number;

    @Override
    public void update(double price, int number) {
        this.price = price;
        this.number = number;
        display();
    }

    public void display() {
        System.out.printf("Something costs %s$, there are %s product\n", price, number);
    }
}
