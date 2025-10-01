package ir.msob.manak.core.service.jima.crud.restful.childdomain.service;

import ir.msob.manak.core.service.jima.crud.base.childdomain.ChildDomainCrudService;
import ir.msob.manak.core.service.jima.security.UserService;
import ir.msob.manak.core.model.jima.childdomain.relatedaction.RelatedAction;
import ir.msob.manak.core.model.jima.childdomain.relatedaction.RelatedActionCriteria;
import ir.msob.manak.core.model.jima.domain.Dto;
import ir.msob.manak.core.model.jima.security.User;
import ir.msob.jima.core.commons.security.BaseUserService;
import ir.msob.jima.crud.api.restful.service.childdomain.relatedaction.BaseRelatedActionCrudRestResource;

public abstract class RelatedActionCrudRestResource<DTO extends Dto, S extends ChildDomainCrudService<DTO>>
        implements BaseRelatedActionCrudRestResource<
        String
        , User
        , RelatedAction
        , RelatedActionCriteria
        , DTO
        , S> {
        private final S childService;
        private final UserService userService;

        public RelatedActionCrudRestResource(S childService, UserService userService) {
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