package com.example.tennisgame.contract.calculator;

import com.example.tennisgame.model.Player;
import com.example.tennisgame.model.result.Result;

public interface ScoreCalculator {
    Result getScore(Player playerOne, Player playerTwo);
}
