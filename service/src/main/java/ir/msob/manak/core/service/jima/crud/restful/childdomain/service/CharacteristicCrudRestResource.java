package ir.msob.manak.core.service.jima.crud.restful.childdomain.service;

import ir.msob.manak.core.service.jima.crud.base.childdomain.ChildDomainCrudService;
import ir.msob.manak.core.service.jima.security.UserService;
import ir.msob.manak.core.model.jima.childdomain.characteristic.Characteristic;
import ir.msob.manak.core.model.jima.childdomain.characteristic.CharacteristicCriteria;
import ir.msob.manak.core.model.jima.domain.Dto;
import ir.msob.manak.core.model.jima.security.User;
import ir.msob.jima.core.commons.security.BaseUserService;
import ir.msob.jima.crud.api.restful.service.childdomain.characteristic.BaseCharacteristicCrudRestResource;

public abstract class CharacteristicCrudRestResource<DTO extends Dto, S extends ChildDomainCrudService<DTO>>
        implements BaseCharacteristicCrudRestResource<
        String
        , User
        , Characteristic
        , CharacteristicCriteria
        , DTO
        , S> {
        private final S childService;
        private final UserService userService;

        public CharacteristicCrudRestResource(S childService, UserService userService) {
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