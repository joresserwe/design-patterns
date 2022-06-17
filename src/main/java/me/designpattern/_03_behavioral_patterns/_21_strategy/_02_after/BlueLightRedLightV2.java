package me.designpattern._03_behavioral_patterns._21_strategy._02_after;

import me.designpattern._03_behavioral_patterns._21_strategy._02_after.strategy.SpeedStrategy;

public class BlueLightRedLightV2 {

    /**
     * Parameter로 받는 방식
     */
    public void blueLight(SpeedStrategy speed) {
        speed.blueLight();
    }

    public void redLight(SpeedStrategy speed) {
        speed.ledLight();
    }
}

