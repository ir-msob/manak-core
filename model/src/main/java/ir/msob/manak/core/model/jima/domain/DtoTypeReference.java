package ir.msob.manak.core.model.jima.domain;

import com.fasterxml.jackson.core.type.TypeReference;
import ir.msob.jima.core.commons.domain.BaseDtoTypeReference;

import java.lang.reflect.Type;
import java.util.Collection;

public interface DtoTypeReference<DTO extends Dto, C extends Criteria> extends BaseDtoTypeReference<String, DTO, C> {
    @Override
    default TypeReference<Collection<String>> getIdsReferenceType() {
        return new TypeReference<Collection<String>>() {
            @Override
            public Type getType() {
                return super.getType();
            }
        };
    }
}
