package com.mss.controller;

import com.mss.entities.GameInfo;
import com.mss.games.BallGame;
import com.mss.service.GameInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/cary")
public class testController {
    @Autowired
    private GameInfoService gameInfoService;

    @RequestMapping(value = "test" , method = RequestMethod.POST)
    public String list(
            @RequestParam(value="timeSetNumber",defaultValue = "0") int timeSetNumber,
            @RequestParam(value="scoreSetNumber",defaultValue = "0") int scoreSetNumber,
            @RequestParam(value="scorePerSet", defaultValue = "0") int scorePerSet,
            @RequestParam(value="timePerSet", defaultValue = "0") int timePerSet,
            @RequestParam(value="gameMode", required=true) int gameMode,
            @RequestParam(value="isSetFoul", required=true) boolean isSetFoul,
            @RequestParam(value="foulLimit", defaultValue = "0") int foulLimit,
            @RequestParam(value="isRecordPlayerScore", required=true) boolean isRecordPlayerScore,
            @RequestParam(value="isAllowSubstitution", required=true) boolean isAllowSubstitution,
            @RequestParam(value="substitutionLimit", defaultValue = "0") int substitutionLimit,
            @RequestParam(value="benchPlayerLimit", defaultValue = "0") int benchPlayerLimit,
            @RequestParam(value="isAllowTimeout", required=true) boolean isAllowTimeout,
            @RequestParam(value="timeoutLimit", defaultValue = "0") int timeoutLimit,
            @RequestParam(value="isAllowOvertime", required=true) boolean isAllowOvertime,
            @RequestParam(value="overtimeGameMode", defaultValue = "1") int overtimeGameMode,
            @RequestParam(value="overtimeTimeSetNumber",defaultValue = "0") int overtimeTimeSetNumber,
            @RequestParam(value="overtimeScoreSetNumber",defaultValue = "0") int overtimeScoreSetNumber,
            @RequestParam(value="overtimeScorePerSet", defaultValue = "0") int overtimeScorePerSet,
            @RequestParam(value="overtimeTimePerSet", defaultValue = "0") int overtimeTimePerSet,
            HttpServletRequest request
    ){
        HttpSession h = request.getSession();
        GameInfo g =(GameInfo) h.getAttribute("game");
        g.setSetNumber(Math.max(timeSetNumber,scoreSetNumber));
        g.setScorePerSet(scorePerSet);
        g.setTimePerSet(timePerSet);
        g.setGameMode(gameMode);
        g.setSetFoul(isSetFoul);
        g.setFoulLimit(foulLimit);
        g.setRecordPlayerScore(isRecordPlayerScore);
        g.setAllowSubstitution(isAllowSubstitution);
        g.setSubstitutionLimit(substitutionLimit);
        g.setBenchPlayerLimit(benchPlayerLimit);
        g.setAllowTimeout(isAllowTimeout);
        g.setTimeoutLimit(timeoutLimit);
        g.setAllowOvertime(isAllowOvertime);
        g.setOvertimeSetNumber(Math.max(overtimeTimeSetNumber,overtimeScoreSetNumber));
        g.setOvertimeScorePerSet(overtimeScorePerSet);
        g.setOvertimeTimePerSet(overtimeTimePerSet);
        g.setOvertimeGameMode(overtimeGameMode);
        gameInfoService.saveInfo(g);
        BallGame ballGame = new BallGame();
        ballGame.updataGame(g);
        return "finish-create";
    }


}
