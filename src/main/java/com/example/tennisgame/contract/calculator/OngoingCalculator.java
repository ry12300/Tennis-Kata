package com.example.tennisgame.contract.calculator;

import com.example.tennisgame.model.Player;
import com.example.tennisgame.model.result.Ongoing;
import com.example.tennisgame.model.result.Result;

public class OngoingCalculator implements ScoreCalculator {

    @Override
    public Result getScore(Player playerOne, Player playerTwo) {

        String playerOneScore = getSinglePlayerScore(playerOne.getScore());
        String playerTwoScore = getSinglePlayerScore(playerTwo.getScore());

        return new Ongoing(playerOneScore + "-" + playerTwoScore);
    }

    private String getSinglePlayerScore(int playerScore) {

        switch (playerScore) {
            case 1:
                return "Fifteen";
            case 2:
                return "Thirty";
            case 3:
                return "Forty";
            default:
                return "Love";
        }
    }

}
