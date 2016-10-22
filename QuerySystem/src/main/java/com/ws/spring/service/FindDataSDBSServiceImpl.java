package com.ws.spring.service;

import com.ws.spring.dao.FindDataSDBSCollectionImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by laowang on 16-10-22.
 */
@Service
@Transactional
public class FindDataSDBSServiceImpl implements FindDataService {

    @Autowired
    FindDataSDBSCollectionImpl findDataSDBSCollection;
    @Override
    public void findAllData() {

    }

    @Override
    public Object findDataBySdbsno(int sdbsno, String collectionName) {
        findDataSDBSCollection = new FindDataSDBSCollectionImpl();

        return findDataSDBSCollection.findDataBySdbsno(sdbsno,collectionName);
    }

    @Override
    public List<Object> findDataByFormula(String formula, String collectionName) {
        return null;
    }
}