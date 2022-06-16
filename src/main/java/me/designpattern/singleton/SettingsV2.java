package me.designpattern.singleton;

public class SettingsV2 {


    /**
     * synchronized로 동시성 문제는 해결이 됨 (lock을 잡음)
     * 하지만 성능에 문제가 생김
     */

    private static SettingsV2 instance;

    private SettingsV2() {
    }

    public static synchronized SettingsV2 getInstance() {
        if (instance == null) instance = new SettingsV2();
        return instance;
    }

}
