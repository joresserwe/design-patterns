package me.designpattern._03_behavioral_patterns._21_strategy._02_after;

import me.designpattern._03_behavioral_patterns._21_strategy._02_after.strategy.NormalSpeedStrategy;

public class ClientV1 {
    public static void main(String[] args) {

        BlueLightRedLightV1 blueLightRedLightV1 = new BlueLightRedLightV1(new NormalSpeedStrategy());
        blueLightRedLightV1.blueLight();
        blueLightRedLightV1.redLight();
    }
}
