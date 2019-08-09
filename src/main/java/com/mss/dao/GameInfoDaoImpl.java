package com.mss.dao;

import com.mss.entities.GameInfo;
import com.mss.games.Game;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class GameInfoDaoImpl implements GameInfoDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void saveInfo(GameInfo gameInfo) {
        Session currentSession = sessionFactory.getCurrentSession();
        currentSession.saveOrUpdate(gameInfo);
    }

}
