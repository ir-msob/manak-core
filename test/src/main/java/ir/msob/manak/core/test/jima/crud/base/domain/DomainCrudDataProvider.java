package ir.msob.manak.core.test.jima.crud.base.domain;

import ir.msob.manak.core.service.jima.crud.base.domain.DomainCrudRepository;
import ir.msob.manak.core.service.jima.crud.base.domain.DomainCrudService;
import ir.msob.manak.core.model.jima.domain.Criteria;
import ir.msob.manak.core.model.jima.domain.Domain;
import ir.msob.manak.core.model.jima.domain.Dto;
import ir.msob.manak.core.model.jima.security.User;
import com.fasterxml.jackson.databind.ObjectMapper;
import ir.msob.jima.core.commons.id.BaseIdService;
import ir.msob.jima.core.ral.mongo.commons.query.QueryBuilder;
import ir.msob.jima.crud.test.domain.BaseDomainCrudDataProvider;
import lombok.Getter;

import java.util.Collections;
import java.util.TreeSet;

@Getter
public abstract class DomainCrudDataProvider<
        D extends Domain,
        DTO extends Dto,
        C extends Criteria,
        R extends DomainCrudRepository<D, C>,
        S extends DomainCrudService<D, DTO, C, R>>
        implements BaseDomainCrudDataProvider<String, User, D, DTO, C, QueryBuilder, R, S> {

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
                .roles(new TreeSet<String>(Collections.singleton("USER"))) // TODO: Replace with real role
                .build();
    }
}