package com.ws.spring.dao;

import com.mongodb.BasicDBObject;
import com.mongodb.CommandResult;
import com.mongodb.DBObject;
import com.ws.spring.configure.MongodbDataConfiguration;
import com.ws.spring.model.SDBSCollectionModel;
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
public class FindDataSDBSCollectionImpl implements FindDataDao {
    private ApplicationContext ctx = new AnnotationConfigApplicationContext(MongodbDataConfiguration.class);
    private MongoTemplate mongoTemplate = (MongoTemplate)ctx.getBean("mongoTemplate");
    @Override
    public void findAllData() {

    }

    @Override
    public SDBSCollectionModel findDataBySdbsno(int sdbsno,  String collectionName) {
        System.out.println("通过sdbsno进行查询");
        return mongoTemplate.findOne(new Query(Criteria.where("sdbsno").is(sdbsno)),SDBSCollectionModel.class,collectionName);
    }

    @Override
    public List<SDBSCollectionModel> findDataByFormula(String formula,  String collectionName) {
        System.out.println("通过fromula进行查询");
        return mongoTemplate.find(new Query(Criteria.where("mole_Formula").is(formula)),SDBSCollectionModel.class,collectionName);
    }

    public List<SDBSCollectionModel> findDataByFuzzy(String formulaFuzzy, String collectionName){
        String []fuzzy = formulaFuzzy.split("%");
        StringBuilder sb = new StringBuilder();
        for(String string : fuzzy){
            if(string.equals(""))
                sb.append(".*");
            else
                sb.append(string);
        }
        return mongoTemplate.find(new Query(Criteria.where("mole_Formula").regex(sb.toString())),SDBSCollectionModel.class,collectionName);
    }
}
