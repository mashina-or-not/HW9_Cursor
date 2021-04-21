package Shop;

import Client.Client;

public interface Shop {
    void addClient(Client client);

    void removeClient(Client client);

    void notifyClients();
}
