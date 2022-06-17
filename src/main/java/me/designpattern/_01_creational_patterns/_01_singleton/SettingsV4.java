package me.designpattern._01_creational_patterns._01_singleton;

public class SettingsV4 {

    /**
     * Double checked locking
     * A와 B가 동시에 들어왔을 때 만 synchronized Block을 사용함
     * 이후엔 synchronized를 사용안해서 비용이 적어짐
     * 그리고 필요할 때만 Instance가 생성됨.
     * JAVA 1.5 이상만 사용가능 (volatile), 그리고 많이 복잡함.
     */

    private static volatile SettingsV4 instance = new SettingsV4();

    private SettingsV4() {
    }

    public static SettingsV4 getInstance() {
        if (instance == null) {
            synchronized (SettingsV4.class) {
                if (instance == null) {
                    instance = new SettingsV4();
                }
            }

        }
        return instance;
    }

}
