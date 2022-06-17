package me.designpattern._03_behavioral_patterns._21_strategy._02_after;

import me.designpattern._03_behavioral_patterns._21_strategy._02_after.strategy.SpeedStrategy;

public class BlueLightRedLightV1 {

    /**
     * Field 주입 사용
     */
    private final SpeedStrategy speed;

    public BlueLightRedLightV1(SpeedStrategy speed) {
        this.speed = speed;
    }

    public void blueLight() {
        speed.blueLight();
    }

    public void redLight() {
        speed.ledLight();
    }
}

