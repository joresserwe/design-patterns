package me.designpattern._01_creational_patterns._02_factorymethod._03_java;

import me.designpattern._01_creational_patterns._02_factorymethod._02_after.BlackShip;
import me.designpattern._01_creational_patterns._02_factorymethod._02_after.WhiteShip;

public class SimpleFactory {

    public Object createProduct(String name) {
        if (name.equals("whiteship")) {
            return new WhiteShip();
        } else if (name.equals("blackship")) {
            return new BlackShip();
        }

        throw new IllegalArgumentException();
    }
}
