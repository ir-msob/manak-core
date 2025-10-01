package ir.msob.manak.core.model.jima.channel;

import ir.msob.manak.core.model.jima.domain.Criteria;
import ir.msob.manak.core.model.jima.domain.Dto;
import ir.msob.manak.core.model.jima.security.User;
import com.fasterxml.jackson.core.type.TypeReference;
import ir.msob.jima.core.commons.channel.BaseChannelTypeReference;
import ir.msob.jima.core.commons.channel.ChannelMessage;
import ir.msob.jima.core.commons.channel.message.*;
import ir.msob.jima.core.commons.shared.ModelType;

public interface ChannelTypeReference<DTO extends Dto, C extends Criteria> extends BaseChannelTypeReference<String, User, DTO, C> {

    @Override
    default TypeReference<ChannelMessage<User, ModelType>> getChannelMessageModelTypeReferenceType(){
        return new TypeReference<>() {
        };
    }

    @Override
    default TypeReference<ChannelMessage<User, CriteriaMessage<String, C>>> getChannelMessageCriteriaReferenceType(){
        return new TypeReference<>() {
        };
    }

    @Override
    default TypeReference<ChannelMessage<User, PageableMessage<String, C>>> getChannelMessagePageableReferenceType(){
        return new TypeReference<>() {
        };
    }

    @Override
    default TypeReference<ChannelMessage<User, PageMessage<String, DTO>>> getChannelMessagePageReferenceType(){
        return new TypeReference<>() {
        };
    }

    @Override
    default TypeReference<ChannelMessage<User, JsonPatchMessage<String, C>>> getChannelMessageJsonPatchReferenceType(){
        return new TypeReference<>() {
        };
    }

    @Override
    default TypeReference<ChannelMessage<User, DtoMessage<String, DTO>>> getChannelMessageDtoReferenceType(){
        return new TypeReference<>() {
        };
    }

    @Override
    default TypeReference<ChannelMessage<User, DtosMessage<String, DTO>>> getChannelMessageDtosReferenceType(){
        return new TypeReference<>() {
        };
    }

    @Override
    default TypeReference<ChannelMessage<User, IdMessage<String>>> getChannelMessageIdReferenceType(){
        return new TypeReference<>() {
        };
    }

    @Override
    default TypeReference<ChannelMessage<User, IdsMessage<String>>> getChannelMessageIdsReferenceType(){
        return new TypeReference<>() {
        };
    }

    @Override
    default TypeReference<ChannelMessage<User, IdJsonPatchMessage<String>>> getChannelMessageIdJsonPatchReferenceType(){
        return new TypeReference<>() {
        };
    }

    @Override
    default TypeReference<ChannelMessage<User, LongMessage>> getChannelMessageLongReferenceType(){
        return new TypeReference<>() {
        };
    }
}