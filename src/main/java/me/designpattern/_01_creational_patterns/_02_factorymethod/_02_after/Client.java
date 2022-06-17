package me.designpattern._01_creational_patterns._02_factorymethod._02_after;

public class Client {
    public static void main(String[] args) {

        Client client = new Client();
        client.print(new WhiteShipFactory(), "WhiteShip", "joresserwe@gmail.com");
        client.print(new BlackShipFactory(), "BlackShip", "joresserwe@gmail.com");
    }

    private void print(ShipFactory shipFactory, String name, String email) {
        System.out.println(shipFactory.orderShip(name, email));
    }
}
