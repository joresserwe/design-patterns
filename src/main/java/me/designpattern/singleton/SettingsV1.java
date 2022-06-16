package me.designpattern.singleton;

public class SettingsV1 {

    /**
     * 동시성 문제
     * Thread A와 Thread B가 동시에 instance를 호출하면
     * A B 모두 instance == null로 빠져 서로다른 Instance를 가지게 됨
     */

    private static SettingsV1 instance;

    private SettingsV1() {
    }

    public static SettingsV1 getInstance() {
        if (instance == null) instance = new SettingsV1();
        return instance;
    }

}
