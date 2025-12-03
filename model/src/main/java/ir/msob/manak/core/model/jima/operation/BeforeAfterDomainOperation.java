package ir.msob.manak.core.model.jima.operation;

import ir.msob.jima.core.commons.operation.BaseBeforeAfterDomainOperation;
import ir.msob.manak.core.model.jima.domain.Criteria;
import ir.msob.manak.core.model.jima.domain.Dto;
import ir.msob.manak.core.model.jima.security.User;

public interface BeforeAfterDomainOperation<DTO extends Dto, C extends Criteria>
        extends BaseBeforeAfterDomainOperation<String, User, DTO, C> {

}