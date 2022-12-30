package com.example.tennisgame.contract.calculator.factory;

import com.example.tennisgame.contract.calculator.AdvantageCalculator;
import com.example.tennisgame.contract.calculator.DrawCalculator;
import com.example.tennisgame.contract.calculator.OngoingCalculator;
import com.example.tennisgame.contract.calculator.ScoreCalculator;
import com.example.tennisgame.contract.calculator.WinCalculator;
import com.example.tennisgame.model.Player;

public class ScoreCalculatorFactory {

    private static final Integer WINNING_SCORE = 4;
    private static final Integer ADVANTAGE_DIFFERENCE = 1;

    private ScoreCalculatorFactory() {}

    public static ScoreCalculator getScoreCalculator(Player playerOne, Player playerTwo) {

        Integer playerOneScore = playerOne.getScore();
        Integer playerTwoScore = playerTwo.getScore();

        if (playerOneScore.equals(playerTwoScore)) {
            return new DrawCalculator();
        } else if (playerOneScore >= WINNING_SCORE || playerTwoScore >= WINNING_SCORE) {
            if ((Math.abs(playerOneScore - playerTwoScore) == ADVANTAGE_DIFFERENCE)) {
                return new AdvantageCalculator();
            } else {
                return new WinCalculator();
            }
        } else {
            return new OngoingCalculator();
        }
    }

}
