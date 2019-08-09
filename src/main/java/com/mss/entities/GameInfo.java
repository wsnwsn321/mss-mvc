package com.mss.entities;


import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.io.*;

@Repository
@Entity
@Table(name = "multi_game_system_games")
public class GameInfo  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "type")
    private String type;

    @Column(name = "gameMode")
    private int gameMode;

    @Column(name = "setNumber")
    private int setNumber;

    @Column(name = "timePerSet")
    private int timePerSet;

    @Column(name = "scorePerSet")
    private int scorePerSet;

    @Column(name = "isAllowOvertime")
    private boolean isAllowOvertime;

    @Column(name = "overtimeGameMode")
    private int overtimeGameMode;

    @Column(name = "overtimeSetNumber")
    private int overtimeSetNumber;

    @Column(name = "overtimeTimePerSet")
    private int overtimeTimePerSet;

    @Column(name = "overtimeScorePerSet")
    private int overtimeScorePerSet;

    @Column(name = "isSetFoul")
    private boolean isSetFoul;

    @Column(name = "foulLimit")
    private int foulLimit;

    @Column(name = "isRecordPlayerScore")
    private boolean isRecordPlayerScore;

    @Column(name = "isAllowSubstitution")
    private boolean isAllowSubstitution;

    @Column(name = "substitutionLimit")
    private int substitutionLimit;

    @Column(name = "benchPlayerLimit")
    private int benchPlayerLimit;

    @Column(name = "isAllowTimeout")
    private boolean isAllowTimeout;

    @Column(name = "timeoutLimit")
    private int timeoutLimit;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public int getTimePerSet() {
        return timePerSet;
    }

    public void setTimePerSet(int timePerSet) {
        this.timePerSet = timePerSet;
    }

    public int getScorePerSet() {
        return scorePerSet;
    }

    public void setScorePerSet(int scorePerSet) {
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

    public int getOvertimeSetNumber() {
        return overtimeSetNumber;
    }

    public void setOvertimeSetNumber(int overtimeSetNumber) {
        this.overtimeSetNumber = overtimeSetNumber;
    }

    public int getOvertimeTimePerSet() {
        return overtimeTimePerSet;
    }

    public void setOvertimeTimePerSet(int overtimeTimePerSet) {
        this.overtimeTimePerSet = overtimeTimePerSet;
    }

    public int getOvertimeScorePerSet() {
        return overtimeScorePerSet;
    }

    public void setOvertimeScorePerSet(int overtimeScorePerSet) {
        this.overtimeScorePerSet = overtimeScorePerSet;
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

}
