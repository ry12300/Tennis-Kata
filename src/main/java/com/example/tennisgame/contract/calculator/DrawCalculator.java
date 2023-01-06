package com.example.tennisgame.contract.calculator;

import com.example.tennisgame.model.Player;
import com.example.tennisgame.model.result.Draw;
import com.example.tennisgame.model.result.Result;

public class DrawCalculator implements ScoreCalculator {

    @Override
    public Result getScore(Player playerOne, Player playerTwo) {

        switch (playerOne.getScore()) {
            case 0:
                return new Draw("Love-All");
            case 1:
                return new Draw("Fifteen-All");
            case 2:
                return new Draw("Thirty-All");
            default:
                return new Draw("Deuce");
        }
    }

}
