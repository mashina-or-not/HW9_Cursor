import Client.Client;
import Client.DisplayMassage;
import Shop.ProductInfo;

public class Main {
    public static void main(String[] args) {
        ProductInfo productInfo = new ProductInfo();
        Client client = new DisplayMassage();

        productInfo.addClient(client);
        productInfo.newInfoForProduct(5.99, 10);
        productInfo.removeClient(client);
    }
}
