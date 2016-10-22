package com.ws.spring.service;

import com.ws.spring.dao.FindDataRamanCollectionImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by laowang on 16-10-22.
 */
@Service
@Transactional
public class FindDataRanmanServiceImpl implements FindDataService {

    @Autowired
    FindDataRamanCollectionImpl findDataRamanCollection;

    @Override
    public void findAllData() {

    }

    @Override
    public Object findDataBySdbsno(int sdbsno, String collectionName) {
        findDataRamanCollection = new FindDataRamanCollectionImpl();

        return findDataRamanCollection.findDataBySdbsno(sdbsno, collectionName);
    }

    @Override
    public List<Object> findDataByFormula(String formula, String collectionName) {
        return null;
    }
}
