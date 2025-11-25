package ir.msob.manak.core.test.jima.crud.base.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import ir.msob.jima.core.commons.id.BaseIdService;
import ir.msob.jima.crud.test.domain.BaseDomainCrudDataProvider;
import ir.msob.manak.core.model.jima.domain.Criteria;
import ir.msob.manak.core.model.jima.domain.Domain;
import ir.msob.manak.core.model.jima.domain.Dto;
import ir.msob.manak.core.model.jima.security.User;
import ir.msob.manak.core.service.jima.crud.base.domain.DomainCrudRepository;
import ir.msob.manak.core.service.jima.crud.base.domain.DomainCrudService;
import lombok.Getter;

import java.util.Collections;
import java.util.TreeSet;

@Getter
public abstract class DomainCrudDataProvider<
        D extends Domain,
        DTO extends Dto,
        C extends Criteria,
        R extends DomainCrudRepository<D>,
        S extends DomainCrudService<D, DTO, C, R>>
        implements BaseDomainCrudDataProvider<String, User, D, DTO, C, R, S> {

    private final ObjectMapper objectMapper;
    private final S service;
    private final User sampleUser;

    protected DomainCrudDataProvider(BaseIdService idService, ObjectMapper objectMapper, S service) {
        this.objectMapper = objectMapper;
        this.service = service;
        sampleUser = User.builder()
                .id(idService.<String>newId())
                .sessionId(idService.<String>newId())
                .username("user")
                .audience("web")
                .roles(new TreeSet<>(Collections.singleton("USER")))
                .build();
    }
}