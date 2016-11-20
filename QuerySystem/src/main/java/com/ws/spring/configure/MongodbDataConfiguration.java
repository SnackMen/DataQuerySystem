package com.ws.spring.configure;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.data.authentication.UserCredentials;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.core.MongoClientFactoryBean;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

import java.util.Arrays;
import java.util.Collections;

/**
 * Created by laowang on 16-10-22.
 */
@Configuration
@PropertySource("classpath:mongodb.properties")
public class MongodbDataConfiguration extends AbstractMongoConfiguration {

    @Value("${mongo.host}")
    private String hostName;

    @Value("${mongo.dbName}")
    private String dbName;

    @Value("${mongo.username}")
    private String username;

    @Value("${mongo.password}")
    private String password;

    @Value("$(mongo.port}")
    private String port;
    @Override
    protected String getDatabaseName() {
        return dbName;
    }

    @Override
    public Mongo mongo() throws Exception {
        MongoClient mongoClient;
        MongoCredential credential = MongoCredential.createCredential(username,dbName,password.toCharArray());
        mongoClient = new MongoClient(new ServerAddress(hostName), Collections.singletonList(credential));
        return mongoClient;
    }

    @Override
    public MongoTemplate mongoTemplate() throws Exception{
        return new MongoTemplate(mongo(),dbName);
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer(){
        return new PropertySourcesPlaceholderConfigurer();
    }
}
