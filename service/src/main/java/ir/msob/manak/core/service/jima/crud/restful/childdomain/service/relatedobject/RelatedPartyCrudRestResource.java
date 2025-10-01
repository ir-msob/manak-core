package ir.msob.manak.core.service.jima.crud.restful.childdomain.service.relatedobject;

import ir.msob.manak.core.service.jima.crud.base.childdomain.ChildDomainCrudService;
import ir.msob.manak.core.service.jima.security.UserService;
import ir.msob.manak.core.model.jima.childdomain.relatedobject.relatedparty.RelatedParty;
import ir.msob.manak.core.model.jima.childdomain.relatedobject.relatedparty.RelatedPartyCriteria;
import ir.msob.manak.core.model.jima.domain.Dto;
import ir.msob.manak.core.model.jima.security.User;
import ir.msob.jima.core.commons.security.BaseUserService;
import ir.msob.jima.crud.api.restful.service.childdomain.relatedobject.relatedparty.BaseRelatedPartyCrudRestResource;

public abstract class RelatedPartyCrudRestResource<DTO extends Dto, S extends ChildDomainCrudService<DTO>>
        implements BaseRelatedPartyCrudRestResource<
        String
        , User
        , RelatedParty
        , RelatedPartyCriteria
        , DTO
        , S> {
        private final S childService;
        private final UserService userService;

        public RelatedPartyCrudRestResource(S childService, UserService userService) {
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