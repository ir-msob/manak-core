package ir.msob.manak.core.service.jima.crud.base.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import ir.msob.jima.crud.service.domain.BaseDomainCrudService;
import ir.msob.jima.crud.service.domain.BeforeAfterComponent;
import ir.msob.manak.core.model.jima.domain.Criteria;
import ir.msob.manak.core.model.jima.domain.Domain;
import ir.msob.manak.core.model.jima.domain.Dto;
import ir.msob.manak.core.model.jima.security.User;
import org.springframework.validation.annotation.Validated;

@Validated
public abstract class DomainCrudService<
        D extends Domain,
        DTO extends Dto,
        C extends Criteria,
        R extends DomainCrudRepository<D>>
        implements BaseDomainCrudService<String, User, D, DTO, C, R> {

    private final BeforeAfterComponent beforeAfterComponent;
    private final ObjectMapper objectMapper;
    private final R repository;

    protected DomainCrudService(BeforeAfterComponent beforeAfterComponent, ObjectMapper objectMapper, R repository) {
        this.beforeAfterComponent = beforeAfterComponent;
        this.objectMapper = objectMapper;
        this.repository = repository;
    }

    @Override
    public BeforeAfterComponent getBeforeAfterComponent() {
        return beforeAfterComponent;
    }

    @Override
    public ObjectMapper getObjectMapper() {
        return objectMapper;
    }

    @Override
    public R getRepository() {
        return repository;
    }
}
