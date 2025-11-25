package ir.msob.manak.core.service.jima.crud.restful.childdomain.service.relatedobject;

import ir.msob.jima.core.commons.security.BaseUserService;
import ir.msob.jima.crud.api.restful.service.childdomain.relatedobject.relatedprocess.BaseRelatedProcessCrudRestResource;
import ir.msob.manak.core.model.jima.childdomain.relatedobject.relatedprocess.RelatedProcess;
import ir.msob.manak.core.model.jima.childdomain.relatedobject.relatedprocess.RelatedProcessCriteria;
import ir.msob.manak.core.model.jima.domain.Dto;
import ir.msob.manak.core.model.jima.security.User;
import ir.msob.manak.core.service.jima.crud.base.childdomain.ChildDomainCrudService;
import ir.msob.manak.core.service.jima.security.UserService;

public abstract class RelatedProcessCrudRestResource<DTO extends Dto, S extends ChildDomainCrudService<DTO>>
        implements BaseRelatedProcessCrudRestResource<
        String
        , User
        , RelatedProcess
        , RelatedProcessCriteria
        , DTO
        , S> {
    private final S childService;
    private final UserService userService;

    protected RelatedProcessCrudRestResource(S childService, UserService userService) {
        this.childService = childService;
        this.userService = userService;
    }

    @Override
    public S getChildService() {
        return childService;
    }

    @Override
    public BaseUserService getUserService() {
        return userService;
    }
}