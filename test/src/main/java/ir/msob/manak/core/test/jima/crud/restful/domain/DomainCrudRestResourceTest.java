package ir.msob.manak.core.test.jima.crud.restful.domain;

import com.fasterxml.jackson.core.type.TypeReference;
import ir.msob.manak.core.service.jima.crud.base.domain.DomainCrudRepository;
import ir.msob.manak.core.service.jima.crud.base.domain.DomainCrudService;
import ir.msob.manak.core.model.jima.domain.Criteria;
import ir.msob.manak.core.model.jima.domain.Domain;
import ir.msob.manak.core.model.jima.domain.Dto;
import ir.msob.manak.core.model.jima.security.User;
import com.fasterxml.jackson.databind.ObjectMapper;
import ir.msob.jima.core.beans.properties.JimaProperties;
import ir.msob.jima.core.ral.mongo.commons.query.QueryBuilder;
import ir.msob.jima.crud.api.restful.test.domain.BaseDomainCrudRestResourceTest;
import ir.msob.jima.security.commons.TokenService;
import ir.msob.manak.core.test.jima.crud.base.domain.DomainCrudDataProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.reactive.server.WebTestClient;

import java.lang.reflect.Type;
import java.util.Collection;

public abstract class DomainCrudRestResourceTest<
        D extends Domain,
        DTO extends Dto,
        C extends Criteria,
        R extends DomainCrudRepository<D, C>,
        S extends DomainCrudService<D, DTO, C, R>,
        DP extends DomainCrudDataProvider<D, DTO, C, R, S>>
        implements BaseDomainCrudRestResourceTest<String, User, D, DTO, C, QueryBuilder, R, S, DP> {

    @Autowired
    private WebTestClient webTestClient;
    @Autowired
    private TokenService tokenService;
    @Autowired
    private DP dataProvider;
    @Autowired
    private ObjectMapper objectMapper;
    @Autowired
    private JimaProperties jimaProperties;

    @Override
    public ObjectMapper getObjectMapper() {
        return objectMapper;
    }

    @Override
    public DP getDataProvider() {
        return dataProvider;
    }

    @Override
    public JimaProperties getJimaProperties() {
        return jimaProperties;
    }

    @Override
    public WebTestClient getWebTestClient() {
        return webTestClient;
    }

    @Override
    public TokenService getTokenService() {
        return tokenService;
    }

    public User getSampleUser() {
        return this.getDataProvider().getSampleUser();
    }

    @Override
    public TypeReference<Collection<String>> getIdsReferenceType() {
        return new TypeReference<Collection<String>>() {
            @Override
            public Type getType() {
                return super.getType();
            }
        };
    }
}