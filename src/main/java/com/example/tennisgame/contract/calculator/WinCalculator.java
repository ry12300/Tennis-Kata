package com.example.tennisgame.contract.calculator;

import com.example.tennisgame.model.Player;
import com.example.tennisgame.model.result.Result;
import com.example.tennisgame.model.result.Win;

public class WinCalculator implements ScoreCalculator {

    @Override
    public Result getScore(Player playerOne, Player playerTwo) {

        if (playerOne.getScore() - playerTwo.getScore() >= 0) {
            return new Win("Win for player1");
        } else {
            return new Win("Win for player2");
        }
    }

}
