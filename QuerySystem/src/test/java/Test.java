import com.ws.spring.configure.MongodbDataConfiguration;
import com.ws.spring.model.SDBSCollectionModel;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

/**
 * Created by laowang on 16-10-22.
 */
public class Test {
    public static void main(String []args){

        Scanner scanner = new Scanner(System.in);
//        int sdbsno = scanner.nextInt();
//        String collectionName = scanner.next();

        String formula = scanner.next();
        formula = formula.toUpperCase();
        System.out.println(formula);

        ApplicationContext ctx = new AnnotationConfigApplicationContext(MongodbDataConfiguration.class);
        MongoTemplate mongoTemplate = (MongoTemplate)ctx.getBean("mongoTemplate");

//        SDBSCollectionModel sdbsCollectionModel = mongoTemplate.findOne(new Query(Criteria.where("sdbsno").is(sdbsno)),SDBSCollectionModel.class,collectionName);

        String []fuzzy = formula.split("%");
        StringBuilder sb = new StringBuilder();
        for(String string : fuzzy){
            if(string.equals(""))
                sb.append(".*");
            else
                sb.append(string);
        }
//        String fuzzy = formula.substring(0,formula.length()-1);
        List<SDBSCollectionModel> lists = mongoTemplate.find(new Query(Criteria.where("mole_Formula").regex(sb.toString())),SDBSCollectionModel.class,"sdbs_collection");
        System.out.println(lists.size());
////        if(sdbsCollectionModel!=null){
////            System.out.println(sdbsCollectionModel.get_id()+", "+sdbsCollectionModel.getMole_Formula());
////        }else{
////            System.out.println(false);
////        }
        HashSet<SDBSCollectionModel> hashSet = new HashSet<>(lists);
        List<SDBSCollectionModel> list = new ArrayList<>(hashSet);
        System.out.println(list.size());
        System.out.println(list.get(0));

//        if(list!=null){
//            System.out.println(lists.size());
//        }else{
//            System.out.println(false);
//        }
    }
}
