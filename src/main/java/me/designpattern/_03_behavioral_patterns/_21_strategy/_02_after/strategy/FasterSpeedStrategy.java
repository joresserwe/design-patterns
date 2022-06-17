package me.designpattern._03_behavioral_patterns._21_strategy._02_after.strategy;

public class FasterSpeedStrategy implements SpeedStrategy {
    @Override
    public void blueLight() {
        System.out.println("무궁화꽃이");
    }

    @Override
    public void ledLight() {
        System.out.println("피었습니다.");
    }
}
