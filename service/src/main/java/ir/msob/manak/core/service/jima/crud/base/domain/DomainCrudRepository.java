package ir.msob.manak.core.service.jima.crud.base.domain;

import ir.msob.jima.core.commons.repository.BaseQueryBuilder;
import ir.msob.jima.core.ral.mongo.commons.query.MongoQueryBuilder;
import ir.msob.manak.core.model.jima.domain.Domain;
import ir.msob.jima.core.ral.mongo.commons.BaseMongoRepository;
import ir.msob.jima.crud.ral.mongo.commons.BaseDomainCrudMongoRepository;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;

public abstract class DomainCrudRepository<D extends Domain>
        implements BaseDomainCrudMongoRepository<String, D>
        , BaseMongoRepository<String, D> {

    private final MongoQueryBuilder queryBuilder;
    private final ReactiveMongoTemplate reactiveMongoTemplate;

    protected DomainCrudRepository(MongoQueryBuilder queryBuilder, ReactiveMongoTemplate reactiveMongoTemplate) {
        this.queryBuilder = queryBuilder;
        this.reactiveMongoTemplate = reactiveMongoTemplate;
    }

    @Override
    public ReactiveMongoTemplate getReactiveMongoTemplate() {
        return reactiveMongoTemplate;
    }

    @Override
    public BaseQueryBuilder getQueryBuilder() {
        return queryBuilder;
    }
}