package com.mss.engines;

import com.mss.entities.GameInfo;
import org.springframework.stereotype.Repository;

import java.util.Map;

import static com.mss.tools.ConstantClassField.SCORE_BASED_GAME;
import static com.mss.tools.ConstantClassField.TIME_BASED_GAME;

@Repository
public class ConcreteRuleEngine implements RuleEngine {
    private int gameMode;

    //game mode settings
    private int setNumber;
    private float timePerSet;
    private float scorePerSet;

    //overtime settings
    private boolean isAllowOvertime;
    private int overtimeGameMode;
    private int overtimeSetNumber;
    private float overtimeTimePerSet;
    private float overtimeScorePerSet;

    //foul settings
    private boolean isSetFoul;
    private int foulLimit;

    //score settings
    private boolean isRecordPlayerScore;

    //substitution settings
    private boolean isAllowSubstitution;
    private int substitutionLimit;
    private int benchPlayerLimit;

    //timeout settings
    private boolean isAllowTimeout;
    private int timeoutLimit;
    @Override
    public void overallSettings(GameInfo g) {
        this.winSettings(g);
        this.foulSettings(g);
        this.scoreSettings(g);
        this.playerSubstitutionSettings(g);
    }
    @Override
    public void winSettings(GameInfo g) {
        this.setGameMode(g.getGameMode());
        this.setSetNumber(g.getSetNumber());
        if (gameMode==TIME_BASED_GAME){
            this.setTimePerSet(g.getTimePerSet());
        }
        else if (gameMode==SCORE_BASED_GAME){
            this.setScorePerSet(g.getScorePerSet());
        }

    }
    @Override
    public void foulSettings(GameInfo g) {
        this.setSetFoul(g.isSetFoul());
        if (this.isSetFoul) this.setFoulLimit(g.getFoulLimit());
    }

    @Override
    public void scoreSettings(GameInfo g) {
        this.setRecordPlayerScore(g.isRecordPlayerScore());
    }

    @Override
    public void playerSubstitutionSettings(GameInfo g) {
        this.setAllowSubstitution(g.isAllowSubstitution());
        if (this.isAllowSubstitution) {
            this.setSubstitutionLimit(g.getSubstitutionLimit());
            this.setBenchPlayerLimit(g.getBenchPlayerLimit());
        }

    }

    @Override
    public void overtimeSettings(GameInfo g) {
        this.setAllowOvertime(g.isAllowOvertime());
        if (this.isAllowOvertime){
            this.setOvertimeGameMode(g.getOvertimeGameMode());
            if (overtimeGameMode==TIME_BASED_GAME){
                this.setOvertimeTimePerSet(g.getOvertimeTimePerSet());
            }
            else if (overtimeGameMode==SCORE_BASED_GAME){
                this.setOvertimeScorePerSet(g.getOvertimeScorePerSet());
            }
        }
    }

    public int getGameMode() {
        return gameMode;
    }

    public void setGameMode(int gameMode) {
        this.gameMode = gameMode;
    }

    public int getSetNumber() {
        return setNumber;
    }

    public void setSetNumber(int setNumber) {
        this.setNumber = setNumber;
    }

    public float getTimePerSet() {
        return timePerSet;
    }

    public void setTimePerSet(float timePerSet) {
        this.timePerSet = timePerSet;
    }

    public float getScorePerSet() {
        return scorePerSet;
    }

    public void setScorePerSet(float scorePerSet) {
        this.scorePerSet = scorePerSet;
    }

    public boolean isAllowOvertime() {
        return isAllowOvertime;
    }

    public void setAllowOvertime(boolean allowOvertime) {
        isAllowOvertime = allowOvertime;
    }

    public int getOvertimeGameMode() {
        return overtimeGameMode;
    }

    public void setOvertimeGameMode(int overtimeGameMode) {
        this.overtimeGameMode = overtimeGameMode;
    }

    public boolean isSetFoul() {
        return isSetFoul;
    }

    public void setSetFoul(boolean setFoul) {
        isSetFoul = setFoul;
    }

    public int getFoulLimit() {
        return foulLimit;
    }

    public void setFoulLimit(int foulLimit) {
        this.foulLimit = foulLimit;
    }

    public boolean isRecordPlayerScore() {
        return isRecordPlayerScore;
    }

    public void setRecordPlayerScore(boolean recordPlayerScore) {
        isRecordPlayerScore = recordPlayerScore;
    }

    public boolean isAllowSubstitution() {
        return isAllowSubstitution;
    }

    public void setAllowSubstitution(boolean allowSubstitution) {
        isAllowSubstitution = allowSubstitution;
    }

    public int getSubstitutionLimit() {
        return substitutionLimit;
    }

    public void setSubstitutionLimit(int substitutionLimit) {
        this.substitutionLimit = substitutionLimit;
    }

    public int getBenchPlayerLimit() {
        return benchPlayerLimit;
    }

    public void setBenchPlayerLimit(int benchPlayerLimit) {
        this.benchPlayerLimit = benchPlayerLimit;
    }

    public boolean isAllowTimeout() {
        return isAllowTimeout;
    }

    public void setAllowTimeout(boolean allowTimeout) {
        isAllowTimeout = allowTimeout;
    }

    public int getTimeoutLimit() {
        return timeoutLimit;
    }

    public void setTimeoutLimit(int timeoutLimit) {
        this.timeoutLimit = timeoutLimit;
    }

    public int getOvertimeSetNumber() {
        return overtimeSetNumber;
    }

    public void setOvertimeSetNumber(int overtimeSetNumber) {
        this.overtimeSetNumber = overtimeSetNumber;
    }

    public float getOvertimeTimePerSet() {
        return overtimeTimePerSet;
    }

    public void setOvertimeTimePerSet(float overtimeTimePerSet) {
        this.overtimeTimePerSet = overtimeTimePerSet;
    }

    public float getOvertimeScorePerSet() {
        return overtimeScorePerSet;
    }

    public void setOvertimeScorePerSet(float overtimeScorePerSet) {
        this.overtimeScorePerSet = overtimeScorePerSet;
    }
}
