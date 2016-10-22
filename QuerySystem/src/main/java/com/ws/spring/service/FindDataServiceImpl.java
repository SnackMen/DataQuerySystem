package com.ws.spring.service;

import com.ws.spring.dao.FindDataDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by laowang on 16-10-22.
 */
@Service
@Transactional("testService")
public class FindDataServiceImpl implements FindDataService {

    @Autowired
    FindDataDaoImpl dataDao;
    @Override
    public void findAllData() {

    }

    @Override
    public Object findDataBySdbsno(int sdbsno, Object model, String collectionName) {
        dataDao = new FindDataDaoImpl();
        return dataDao.findDataBySdbsno(sdbsno,model,collectionName);
    }

    @Override
    public List<Object> findDataByFormula(String formula, Object model, String collectionName) {
        dataDao = new FindDataDaoImpl();
        return dataDao.findDataByFormula(formula,model,collectionName);
    }
}
