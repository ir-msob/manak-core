package ir.msob.manak.core.service.jima.crud.restful.domain.service.write;

import ir.msob.manak.core.service.jima.crud.base.domain.DomainCrudRepository;
import ir.msob.manak.core.service.jima.crud.base.domain.DomainCrudService;
import ir.msob.manak.core.model.jima.domain.Criteria;
import ir.msob.manak.core.model.jima.domain.Domain;
import ir.msob.manak.core.model.jima.domain.Dto;
import ir.msob.manak.core.model.jima.security.User;
import ir.msob.jima.crud.api.restful.service.domain.write.BaseEditManyDomainCrudRestResource;

public interface EditManyDomainCrudRestResource<
        D extends Domain,
        DTO extends Dto,
        C extends Criteria,
        R extends DomainCrudRepository<D>,
        S extends DomainCrudService<D, DTO, C, R>
        > extends BaseEditManyDomainCrudRestResource<String, User, D, DTO, C, R, S> {

}