package com.ws.spring.dao;

import com.ws.spring.configure.MongodbDataConfiguration;
import com.ws.spring.model.CNMRCollectionModel;
import com.ws.spring.model.ESRCollectionModel;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by laowang on 16-10-22.
 */
@Repository
public class FindDataEsrCollectionImpl implements FindDataDao {
    private ApplicationContext ctx = new AnnotationConfigApplicationContext(MongodbDataConfiguration.class);
    private MongoTemplate mongoTemplate = (MongoTemplate)ctx.getBean("mongoTemplate");
    @Override
    public void findAllData() {

    }

    @Override
    public ESRCollectionModel findDataBySdbsno(int sdbsno, String collectionName) {
        System.out.println("通过sdbsno进行查询");
        return mongoTemplate.findOne(new Query(Criteria.where("sdbsno").is(sdbsno)),ESRCollectionModel.class,collectionName);
    }

    @Override
    public List<Object> findDataByFormula(String formula, String collectionName) {
        return null;
    }
}
