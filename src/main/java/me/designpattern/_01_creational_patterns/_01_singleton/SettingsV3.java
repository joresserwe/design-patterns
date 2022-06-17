package me.designpattern._01_creational_patterns._01_singleton;

public class SettingsV3 {

    /**
     * Eager initialization
     * 미리 Instance를 생성해둠. thread safe 하고 synchronized 사용 안해서 비용 절감
     * 미리 만든다는 자체가 문제가 될 수 있음 (Instance가 무겁다면, 그리고 그 Instance를 사용 안한다면
     */
    private static final SettingsV3 INSTANCE = new SettingsV3();

    private SettingsV3() {
    }

    public static SettingsV3 getInstance() {
        return INSTANCE;
    }

}
