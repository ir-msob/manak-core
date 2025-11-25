package ir.msob.manak.core.model.jima.channel;

import com.fasterxml.jackson.core.type.TypeReference;
import ir.msob.jima.core.commons.channel.BaseChannelTypeReference;
import ir.msob.jima.core.commons.channel.ChannelMessage;
import ir.msob.jima.core.commons.channel.message.IdJsonPatchMessage;
import ir.msob.jima.core.commons.channel.message.IdMessage;
import ir.msob.jima.core.commons.channel.message.IdsMessage;
import ir.msob.jima.core.commons.channel.message.LongMessage;
import ir.msob.jima.core.commons.shared.ModelType;
import ir.msob.manak.core.model.jima.domain.Criteria;
import ir.msob.manak.core.model.jima.domain.Dto;
import ir.msob.manak.core.model.jima.security.User;

public interface ChannelTypeReference<DTO extends Dto, C extends Criteria> extends BaseChannelTypeReference<String, User, DTO, C> {

    @Override
    default TypeReference<ChannelMessage<User, ModelType>> getChannelMessageModelTypeReferenceType() {
        return new TypeReference<>() {
        };
    }

    @Override
    default TypeReference<ChannelMessage<User, IdMessage<String>>> getChannelMessageIdReferenceType() {
        return new TypeReference<>() {
        };
    }

    @Override
    default TypeReference<ChannelMessage<User, IdsMessage<String>>> getChannelMessageIdsReferenceType() {
        return new TypeReference<>() {
        };
    }

    @Override
    default TypeReference<ChannelMessage<User, IdJsonPatchMessage<String>>> getChannelMessageIdJsonPatchReferenceType() {
        return new TypeReference<>() {
        };
    }

    @Override
    default TypeReference<ChannelMessage<User, LongMessage>> getChannelMessageLongReferenceType() {
        return new TypeReference<>() {
        };
    }
}