package com.ws.spring.service;

import java.util.List;

/**
 * Created by laowang on 16-10-22.
 */
public interface FindDataService<T> {
    void findAllData();
    Object findDataBySdbsno(int sdbsno,String collectionName);
    List<Object> findDataByFormula(String formula, String collectionName);
}
