package com.ws.spring.dao;

/**
 * Created by laowang on 16-10-22.
 */
public interface FindDataDao {
    void findAllData();
    Object findDataBySdbsno();
    Object findDataByFormula();
}
