package com.example.tennisgame.contract.game;

import com.example.tennisgame.contract.calculator.ScoreCalculator;
import com.example.tennisgame.contract.calculator.factory.ScoreCalculatorFactory;
import com.example.tennisgame.model.Player;
import com.example.tennisgame.model.result.Result;

public class TennisGameOne implements TennisGame {

    private Player playerOne;
    private Player playerTwo;

    public TennisGameOne(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public Result getScore() {
        ScoreCalculator scoreCalculator = ScoreCalculatorFactory.getScoreCalculator(playerOne, playerTwo);
        return scoreCalculator.getScore(playerOne, playerTwo);
    }

}
