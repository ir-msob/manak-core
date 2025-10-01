package ir.msob.manak.core.service.jima.crud.restful.domain.service.read;

import ir.msob.manak.core.service.jima.crud.base.domain.DomainCrudRepository;
import ir.msob.manak.core.service.jima.crud.base.domain.DomainCrudService;
import ir.msob.manak.core.model.jima.domain.Criteria;
import ir.msob.manak.core.model.jima.domain.Domain;
import ir.msob.manak.core.model.jima.domain.Dto;
import ir.msob.manak.core.model.jima.security.User;
import ir.msob.jima.core.ral.mongo.commons.query.QueryBuilder;
import ir.msob.jima.crud.api.restful.service.domain.read.BaseCountAllDomainCrudRestResource;

public interface CountAllDomainCrudRestResource<
        D extends Domain,
        DTO extends Dto,
        C extends Criteria,
        R extends DomainCrudRepository<D, C>,
        S extends DomainCrudService<D, DTO, C, R>
        > extends BaseCountAllDomainCrudRestResource<String, User, D, DTO, C, QueryBuilder, R, S> {

}