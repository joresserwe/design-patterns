package me.designpattern._02_structural_patterns._12_proxy._02_after;


public class Client {

    public static void main(String[] args) {
        GameService defaultGameService = new DefaultGameService();
        GameService gameService = new GameServiceProxy(defaultGameService);
        gameService.startGame();
    }
}
