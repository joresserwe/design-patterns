package me.designpattern._02_structural_patterns._12_proxy._02_after;

import me.designpattern._02_structural_patterns._12_proxy._01_before.GameService;

public class GameServiceConcreteProxy extends GameService {

    @Override
    public void startGame() {
        long before = System.currentTimeMillis();
        super.startGame();
        System.out.println(System.currentTimeMillis() - before);
    }
}
