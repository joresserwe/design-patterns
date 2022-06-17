package me.designpattern._03_behavioral_patterns._21_strategy._02_after.strategy;

public class NormalSpeedStrategy implements SpeedStrategy {
    @Override
    public void blueLight() {
        System.out.println("무 궁 화 꽃 이");
    }

    @Override
    public void ledLight() {
        System.out.println("피 었 습 니 다.");
    }
}
