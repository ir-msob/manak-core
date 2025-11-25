package ir.msob.manak.core.service.jima.crud.restful.childdomain.service;

import ir.msob.jima.core.commons.security.BaseUserService;
import ir.msob.jima.crud.api.restful.service.childdomain.contactmedium.BaseContactMediumCrudRestResource;
import ir.msob.manak.core.model.jima.childdomain.contactmedium.ContactMedium;
import ir.msob.manak.core.model.jima.childdomain.contactmedium.ContactMediumCriteria;
import ir.msob.manak.core.model.jima.domain.Dto;
import ir.msob.manak.core.model.jima.security.User;
import ir.msob.manak.core.service.jima.crud.base.childdomain.ChildDomainCrudService;
import ir.msob.manak.core.service.jima.security.UserService;

public abstract class ContactMediumCrudRestResource<DTO extends Dto, S extends ChildDomainCrudService<DTO>>
        implements BaseContactMediumCrudRestResource<
        String
        , User
        , ContactMedium
        , ContactMediumCriteria
        , DTO
        , S> {
    private final S childService;
    private final UserService userService;

    protected ContactMediumCrudRestResource(S childService, UserService userService) {
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