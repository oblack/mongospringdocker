package one.genchev.mongodocker.config;

import com.mongodb.MongoClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;

@Configuration
public class MongoConfig extends AbstractMongoConfiguration {

    @Override
    public MongoClient mongoClient() {
        return new MongoClient("mongo", 27017);
    }

    @Override
    protected String getDatabaseName() {
        return "shopping-cart";
    }

    @Override
    protected String getMappingBasePackage() {
        return "one.genchev.mongodocker.entity";
    }
}