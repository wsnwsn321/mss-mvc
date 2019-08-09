package com.mss.games;

import com.mss.engines.ConcreteRuleEngine;
import com.mss.engines.RuleEngine;
import com.mss.entities.GameInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public class BallGame implements Game {

    @Autowired
    private ConcreteRuleEngine ruleEngine;


    public String name;

    @Override
    public void updateGame(GameInfo gameInfo){
        this.name = gameInfo.getName();
        this.ruleEngine = new ConcreteRuleEngine();
        this.ruleEngine.overallSettings(gameInfo);
    }

    @Override
    public ConcreteRuleEngine getRuleEngine(){
        return this.ruleEngine;
    }

}
