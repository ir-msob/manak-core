package ir.msob.manak.core.service.jima.crud.base.childdomain;

import ir.msob.jima.crud.service.childdomain.BaseChildDomainCrudService;
import ir.msob.manak.core.model.jima.domain.Dto;
import ir.msob.manak.core.model.jima.security.User;

public interface ChildDomainCrudService<DTO extends Dto>
        extends BaseChildDomainCrudService<String, User, DTO> {

}