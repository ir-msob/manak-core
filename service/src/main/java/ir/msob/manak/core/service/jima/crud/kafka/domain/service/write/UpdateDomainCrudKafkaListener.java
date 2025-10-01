package ir.msob.manak.core.service.jima.crud.kafka.domain.service.write;

import ir.msob.manak.core.service.jima.crud.base.domain.DomainCrudRepository;
import ir.msob.manak.core.service.jima.crud.base.domain.DomainCrudService;
import ir.msob.manak.core.model.jima.channel.ChannelTypeReference;
import ir.msob.manak.core.model.jima.domain.Criteria;
import ir.msob.manak.core.model.jima.domain.Domain;
import ir.msob.manak.core.model.jima.domain.Dto;
import ir.msob.manak.core.model.jima.security.User;
import ir.msob.jima.core.ral.mongo.commons.query.QueryBuilder;
import ir.msob.jima.crud.api.kafka.service.domain.write.BaseUpdateDomainCrudKafkaListener;

public interface UpdateDomainCrudKafkaListener<
        D extends Domain,
        DTO extends Dto,
        C extends Criteria,
        R extends DomainCrudRepository<D, C>,
        S extends DomainCrudService<D, DTO, C, R>
        > extends BaseUpdateDomainCrudKafkaListener<String, User, D, DTO, C, QueryBuilder, R, S>
        , ChannelTypeReference<DTO, C> {

}