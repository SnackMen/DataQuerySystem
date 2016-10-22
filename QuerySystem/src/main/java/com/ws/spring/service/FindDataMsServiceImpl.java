package com.ws.spring.service;

import com.ws.spring.dao.FindDataMsCollectionImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by laowang on 16-10-22.
 */
@Service
@Transactional
public class FindDataMsServiceImpl implements FindDataService {
    @Autowired
    FindDataMsCollectionImpl findDataMsCollection;

    @Override
    public void findAllData() {

    }

    @Override
    public Object findDataBySdbsno(int sdbsno, String collectionName) {
        findDataMsCollection = new FindDataMsCollectionImpl();

        return findDataMsCollection.findDataBySdbsno(sdbsno,collectionName);
    }

    @Override
    public List<Object> findDataByFormula(String formula, String collectionName) {
        return null;
    }
}
