package com.ws.spring.service;

import com.ws.spring.dao.FindDataHnmrCollectionImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by laowang on 16-10-22.
 */
@Service
@Transactional
public class FindDataHnmrServiceImpl implements FindDataService {

    @Autowired
    FindDataHnmrCollectionImpl findDataHnmrCollection;

    @Override
    public void findAllData() {

    }

    @Override
    public Object findDataBySdbsno(int sdbsno, String collectionName) {
        findDataHnmrCollection = new FindDataHnmrCollectionImpl();

        return findDataHnmrCollection.findDataBySdbsno(sdbsno,collectionName);
    }

    @Override
    public List<Object> findDataByFormula(String formula, String collectionName) {
        return null;
    }
}
