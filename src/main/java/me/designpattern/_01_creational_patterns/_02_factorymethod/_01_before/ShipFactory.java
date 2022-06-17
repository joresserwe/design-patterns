package me.designpattern._01_creational_patterns._02_factorymethod._01_before;

public class ShipFactory {
    public static Ship orderShip(String name, String email) {

        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("배 이름");
        }
        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("연락처");
        }

        prepareFor(name);

        Ship ship = new Ship();
        ship.setName(name);

        // Customizing for specific name
        if (name.equalsIgnoreCase("White Ship")) {
            ship.setLogo("\uD83D\uDEE5");
        } else if (name.equalsIgnoreCase("Black Ship")) {
            ship.setLogo("⚓");
        }

        // Coloring
        if (name.equalsIgnoreCase("White Ship")) {
            ship.setColor("White");
        } else if (name.equalsIgnoreCase("Black Ship")) {
            ship.setColor("Black");
        }

        sendEmailTo(email, ship);

        return ship;
    }

    private static void prepareFor(String name) {
        System.out.println(name + " 만들 준비 중");
    }

    private static void sendEmailTo(String email, Ship ship) {
        System.out.println(ship.getName() + " 다 만들어 짐");
    }
}
