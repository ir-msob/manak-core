package ir.msob.manak.core.model.jima.operation;

import ir.msob.manak.core.model.jima.security.User;
import ir.msob.jima.core.commons.domain.BaseCriteria;
import ir.msob.jima.core.commons.domain.BaseDto;
import ir.msob.jima.core.commons.operation.BaseBeforeAfterDomainOperation;

public interface BeforeAfterDomainOperation<DTO extends BaseDto<String>, C extends BaseCriteria<String>>
        extends BaseBeforeAfterDomainOperation<String, User, DTO, C> {

}