import com.ws.spring.configure.MongodbDataConfiguration;
import com.ws.spring.model.SDBSCollectionModel;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import java.util.List;
import java.util.Scanner;

/**
 * Created by laowang on 16-10-22.
 */
public class Test {
    public static void main(String []args){

        Scanner scanner = new Scanner(System.in);
        int sdbsno = scanner.nextInt();
        String collectionName = scanner.next();

        String formula = scanner.next();
        formula = formula.toUpperCase();
        System.out.println(formula);

        ApplicationContext ctx = new AnnotationConfigApplicationContext(MongodbDataConfiguration.class);
        MongoTemplate mongoTemplate = (MongoTemplate)ctx.getBean("mongoTemplate");

        SDBSCollectionModel sdbsCollectionModel = mongoTemplate.findOne(new Query(Criteria.where("sdbsno").is(sdbsno)),SDBSCollectionModel.class,collectionName);

        List<SDBSCollectionModel> lists = mongoTemplate.find(new Query(Criteria.where("mole_Formula").is(formula)),SDBSCollectionModel.class,collectionName);
        if(sdbsCollectionModel!=null){
            System.out.println(sdbsCollectionModel.get_id()+", "+sdbsCollectionModel.getMole_Formula());
        }else{
            System.out.println(false);
        }

        if(lists!=null){
            System.out.println(lists.size());
        }else{
            System.out.println(false);
        }
    }
}
