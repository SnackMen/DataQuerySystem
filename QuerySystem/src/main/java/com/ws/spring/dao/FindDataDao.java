package com.ws.spring.dao;

import java.util.List;

/**
 * Created by laowang on 16-10-22.
 */
public interface FindDataDao {
    void findAllData();
    Object findDataBySdbsno(int sdbsno,Object model,String collectionName);
    List<Object> findDataByFormula(String formula, Object model, String collectionName);
}
