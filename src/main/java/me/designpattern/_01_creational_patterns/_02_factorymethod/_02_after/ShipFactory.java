package me.designpattern._01_creational_patterns._02_factorymethod._02_after;

public interface ShipFactory {

    default Ship orderShip(String name, String email) {
        validate(name, email);
        prepareFor(name);
        Ship ship = createShip(name);
        sendEmailTo(email, ship);
        return ship;
    }

    // Customizing for specific name
    Ship createShip(String name);

    // private는 Java9부터 가능
    private void validate(String name, String email) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("배 이름");
        }
        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("연락처");
        }
    }

    private void prepareFor(String name) {
        System.out.println(name + " 만들 준비 중");
    }

    private void sendEmailTo(String email, Ship ship) {
        System.out.println(ship.getName() + " 다 만들어 짐");
    }
}
