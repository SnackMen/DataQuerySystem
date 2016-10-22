package com.ws.spring.service;

import com.ws.spring.dao.FindDataCNMRCollectionImpl;
import com.ws.spring.model.CNMRCollectionModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by laowang on 16-10-22.
 */
@Service
@Transactional
public class FindDataCnmrServiceImpl implements FindDataService {

    @Autowired
    FindDataCNMRCollectionImpl findDataCNMRCollection;

    @Override
    public void findAllData() {

    }

    @Override
    public CNMRCollectionModel findDataBySdbsno(int sdbsno, String collectionName) {
        findDataCNMRCollection = new FindDataCNMRCollectionImpl();
        return findDataCNMRCollection.findDataBySdbsno(sdbsno,collectionName);
    }

    @Override
    public List<Object> findDataByFormula(String formula, String collectionName) {
        return null;
    }
}
