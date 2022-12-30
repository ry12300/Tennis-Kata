package com.example.tennisgame.contract.calculator;

import com.example.tennisgame.model.Player;
import com.example.tennisgame.model.result.Advantage;
import com.example.tennisgame.model.result.Result;

public class AdvantageCalculator implements ScoreCalculator {

    @Override
    public Result getScore(Player playerOne, Player playerTwo) {

        if (playerOne.getScore() - playerTwo.getScore() > 0) {
            return new Advantage("Advantage player1");
        } else {
            return new Advantage("Advantage player2");
        }
    }

}
