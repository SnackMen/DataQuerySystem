package com.ws.spring.service;

import com.ws.spring.dao.FindDataIrCollectionImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by laowang on 16-10-22.
 */
@Service
@Transactional
public class FindDataIrServiceImpl implements FindDataService {

    @Autowired
    FindDataIrCollectionImpl findDataIrCollection;

    @Override
    public void findAllData() {

    }

    @Override
    public Object findDataBySdbsno(int sdbsno, String collectionName) {
        findDataIrCollection = new FindDataIrCollectionImpl();

        return findDataIrCollection.findDataBySdbsno(sdbsno,collectionName);
    }

    @Override
    public List<Object> findDataByFormula(String formula, String collectionName) {
        return null;
    }
}
