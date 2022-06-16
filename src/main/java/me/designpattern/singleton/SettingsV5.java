package me.designpattern.singleton;

import java.io.Serial;
import java.io.Serializable;

public class SettingsV5 implements Serializable {
    /**
     * static inner class 사용
     * getInstance를 호출할 때 Inner class가 Load되면서 Instance 생성
     */
    private static class SettingsHolder {
        private static final SettingsV5 INSTANCE = new SettingsV5();

    }

    private SettingsV5() {
    }

    public static SettingsV5 getInstance() {
        return SettingsHolder.INSTANCE;
    }

    // 직렬화/역직렬화를 막아 둠
    @Serial
    protected Object readResolve() {
        return getInstance();
    }
}
