package com.mss.games;

import com.mss.engines.RuleEngine;
import com.mss.entities.GameInfo;

import java.util.Map;

public interface Game {
    public void updateGame(GameInfo gameInfo);
    public RuleEngine getRuleEngine();
}
