package me.designpattern._01_creational_patterns._02_factorymethod._02_after;

public class WhiteShipFactory implements ShipFactory {
    @Override
    public Ship createShip(String name) {
        return new WhiteShip();
    }
}
