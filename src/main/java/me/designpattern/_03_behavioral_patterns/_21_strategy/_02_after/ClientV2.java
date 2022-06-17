package me.designpattern._03_behavioral_patterns._21_strategy._02_after;

import me.designpattern._03_behavioral_patterns._21_strategy._02_after.strategy.FasterSpeedStrategy;
import me.designpattern._03_behavioral_patterns._21_strategy._02_after.strategy.NormalSpeedStrategy;
import me.designpattern._03_behavioral_patterns._21_strategy._02_after.strategy.SpeedStrategy;

public class ClientV2 {
    public static void main(String[] args) {

        BlueLightRedLightV2 blueLightRedLightV2 = new BlueLightRedLightV2();

        // Method 별로 Strategy를 선택해서 사용할 수 있다.
        blueLightRedLightV2.blueLight(new NormalSpeedStrategy());
        blueLightRedLightV2.redLight(new FasterSpeedStrategy());

        // Abstract Inner Class
        blueLightRedLightV2.redLight(new SpeedStrategy() {
            @Override
            public void blueLight() {
                System.out.println();
            }

            @Override
            public void ledLight() {
                System.out.println();
            }
        });
    }
}
