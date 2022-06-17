package me.designpattern._01_creational_patterns._02_factorymethod._01_before;

public class Client {
    public static void main(String[] args) {
        Client client = new Client();

        Ship whiteShip = ShipFactory.orderShip("White Ship", "joresserwe@gmail.com");
        System.out.println(whiteShip);

        Ship blackShip = ShipFactory.orderShip("Black Ship", "joresserwe@gmail.com");
        System.out.println(blackShip);

    }
}
