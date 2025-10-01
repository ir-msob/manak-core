package ir.msob.manak.core.service.jima.crud.restful.childdomain.service.relatedobject;

import ir.msob.manak.core.service.jima.crud.base.childdomain.ChildDomainCrudService;
import ir.msob.manak.core.service.jima.security.UserService;
import ir.msob.manak.core.model.jima.childdomain.relatedobject.relatedintegration.RelatedIntegration;
import ir.msob.manak.core.model.jima.childdomain.relatedobject.relatedintegration.RelatedIntegrationCriteria;
import ir.msob.manak.core.model.jima.domain.Dto;
import ir.msob.manak.core.model.jima.security.User;
import ir.msob.jima.core.commons.security.BaseUserService;
import ir.msob.jima.crud.api.restful.service.childdomain.relatedobject.relatedintegration.BaseRelatedIntegrationCrudRestResource;

public abstract class RelatedIntegrationCrudRestResource<DTO extends Dto, S extends ChildDomainCrudService<DTO>>
        implements BaseRelatedIntegrationCrudRestResource<
        String
        , User
        , RelatedIntegration
        , RelatedIntegrationCriteria
        , DTO
        , S> {
        private final S childService;
        private final UserService userService;

        public RelatedIntegrationCrudRestResource(S childService, UserService userService) {
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