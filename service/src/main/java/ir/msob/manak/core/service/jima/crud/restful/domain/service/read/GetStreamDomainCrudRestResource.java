package ir.msob.manak.core.service.jima.crud.restful.domain.service.read;

import ir.msob.jima.crud.api.restful.service.domain.read.BaseGetStreamDomainCrudRestResource;
import ir.msob.manak.core.model.jima.domain.Criteria;
import ir.msob.manak.core.model.jima.domain.Domain;
import ir.msob.manak.core.model.jima.domain.Dto;
import ir.msob.manak.core.model.jima.security.User;
import ir.msob.manak.core.service.jima.crud.base.domain.DomainCrudRepository;
import ir.msob.manak.core.service.jima.crud.base.domain.DomainCrudService;

public interface GetStreamDomainCrudRestResource<
        D extends Domain,
        DTO extends Dto,
        C extends Criteria,
        R extends DomainCrudRepository<D>,
        S extends DomainCrudService<D, DTO, C, R>
        > extends BaseGetStreamDomainCrudRestResource<String, User, D, DTO, C, R, S> {

}