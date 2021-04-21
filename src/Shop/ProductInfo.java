package Shop;

import Client.Client;

import java.util.LinkedList;
import java.util.List;

public class ProductInfo implements Shop {

    private List<Client> clients;
    private double price;
    private int number;

    public ProductInfo() {
        this.clients = new LinkedList<>();
    }

    @Override
    public void addClient(Client client) {
        clients.add(client);
        System.out.println("New subscriber");
    }

    @Override
    public void notifyClients() {
        for (Client client : clients)
            client.update(price, number);
    }

    @Override
    public void removeClient(Client client) {
        clients.remove(client);
        System.out.println("Remove subscriber");
    }

    public void newInfoForProduct(double price, int number) {
        this.price = price;
        this.number = number;
        notifyClients();
    }
}
