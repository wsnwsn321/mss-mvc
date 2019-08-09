package com.mss.service;

import com.mss.dao.GameInfoDao;
import com.mss.entities.GameInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameInfoServiceImpl implements GameInfoService {

    @Autowired
    private GameInfoDao gameInfoDao;

    @Override
    @Transactional
    public void saveInfo(GameInfo g) {
        gameInfoDao.saveInfo(g);
    }

}