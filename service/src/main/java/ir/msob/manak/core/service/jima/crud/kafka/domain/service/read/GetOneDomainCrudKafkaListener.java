package ir.msob.manak.core.service.jima.crud.kafka.domain.service.read;

import ir.msob.jima.crud.api.kafka.service.domain.read.BaseGetOneDomainCrudKafkaListener;
import ir.msob.manak.core.model.jima.channel.ChannelTypeReference;
import ir.msob.manak.core.model.jima.domain.Criteria;
import ir.msob.manak.core.model.jima.domain.Domain;
import ir.msob.manak.core.model.jima.domain.Dto;
import ir.msob.manak.core.model.jima.security.User;
import ir.msob.manak.core.service.jima.crud.base.domain.DomainCrudRepository;
import ir.msob.manak.core.service.jima.crud.base.domain.DomainCrudService;

public interface GetOneDomainCrudKafkaListener<
        D extends Domain,
        DTO extends Dto,
        C extends Criteria,
        R extends DomainCrudRepository<D>,
        S extends DomainCrudService<D, DTO, C, R>
        > extends BaseGetOneDomainCrudKafkaListener<String, User, D, DTO, C, R, S>
        , ChannelTypeReference<DTO, C> {

}