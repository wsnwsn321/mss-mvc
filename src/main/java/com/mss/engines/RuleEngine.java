package com.mss.engines;

import com.mss.entities.GameInfo;

import java.util.Map;

public interface RuleEngine {
    public void overallSettings(GameInfo g);
    public void winSettings(GameInfo g);
    public void foulSettings(GameInfo g);
    public void scoreSettings(GameInfo g);
    public void playerSubstitutionSettings(GameInfo g);
    public void overtimeSettings(GameInfo g);
}
