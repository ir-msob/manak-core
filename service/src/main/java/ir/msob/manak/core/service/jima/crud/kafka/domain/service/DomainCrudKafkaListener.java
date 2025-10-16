package ir.msob.manak.core.service.jima.crud.kafka.domain.service;

import ir.msob.manak.core.service.jima.crud.base.domain.DomainCrudRepository;
import ir.msob.manak.core.service.jima.crud.base.domain.DomainCrudService;
import ir.msob.manak.core.service.jima.security.UserService;
import ir.msob.manak.core.model.jima.channel.ChannelTypeReference;
import ir.msob.manak.core.model.jima.domain.Criteria;
import ir.msob.manak.core.model.jima.domain.Domain;
import ir.msob.manak.core.model.jima.domain.Dto;
import ir.msob.manak.core.model.jima.security.User;
import com.fasterxml.jackson.databind.ObjectMapper;
import ir.msob.jima.core.commons.client.BaseAsyncClient;
import ir.msob.jima.core.commons.security.BaseUserService;
import ir.msob.jima.crud.api.kafka.service.domain.BaseDomainCrudKafkaListener;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.ConsumerFactory;

public abstract class DomainCrudKafkaListener<
        D extends Domain,
        DTO extends Dto,
        C extends Criteria,
        R extends DomainCrudRepository<D>,
        S extends DomainCrudService<D, DTO, C, R>
        > implements BaseDomainCrudKafkaListener<String, User, D, DTO, C, R, S>
        , ChannelTypeReference<DTO, C> {

    private final UserService userService;
    private final S service;
    private final ObjectMapper objectMapper;
    private final ConsumerFactory<String, String> consumerFactory;
    private final BaseAsyncClient asyncClient;
    @Value("${spring.kafka.consumer.group-id}")
    private String groupId;

    protected DomainCrudKafkaListener(UserService userService, S service, ObjectMapper objectMapper, ConsumerFactory<String, String> consumerFactory, BaseAsyncClient asyncClient) {
        this.userService = userService;
        this.service = service;
        this.objectMapper = objectMapper;
        this.consumerFactory = consumerFactory;
        this.asyncClient = asyncClient;
    }

    @Override
    public String getGroupId() {
        return groupId;
    }

    @Override
    public ConsumerFactory<String, String> getKafkaConsumerFactory() {
        return consumerFactory;
    }

    @Override
    public ObjectMapper getObjectMapper() {
        return objectMapper;
    }

    @Override
    public BaseAsyncClient getAsyncClient() {
        return asyncClient;
    }

    @Override
    public BaseUserService getUserService() {
        return userService;
    }

    @Override
    public S getService() {
        return service;
    }

}