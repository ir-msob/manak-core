package ir.msob.manak.core.service.jima.crud.base.domain;

import ir.msob.manak.core.model.jima.domain.Criteria;
import ir.msob.manak.core.model.jima.domain.Domain;
import ir.msob.manak.core.model.jima.security.User;
import ir.msob.jima.core.ral.mongo.commons.BaseMongoRepository;
import ir.msob.jima.crud.ral.mongo.commons.BaseDomainCrudMongoRepository;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;

public abstract class DomainCrudRepository<D extends Domain, C extends Criteria>
        implements BaseDomainCrudMongoRepository<String, User, D, C>
        , BaseMongoRepository<String, User, D> {

    private final ReactiveMongoTemplate reactiveMongoTemplate;

    protected DomainCrudRepository(ReactiveMongoTemplate reactiveMongoTemplate) {
        this.reactiveMongoTemplate = reactiveMongoTemplate;
    }

    @Override
    public ReactiveMongoTemplate getReactiveMongoTemplate() {
        return reactiveMongoTemplate;
    }
}