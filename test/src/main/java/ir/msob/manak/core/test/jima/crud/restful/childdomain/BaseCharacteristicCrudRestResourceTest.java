package ir.msob.manak.core.test.jima.crud.restful.childdomain;

import com.fasterxml.jackson.core.type.TypeReference;
import ir.msob.jima.core.commons.domain.BaseCriteria;
import ir.msob.jima.core.commons.domain.BaseDomain;
import ir.msob.jima.core.commons.domain.BaseDto;
import ir.msob.jima.core.test.Assertable;
import ir.msob.jima.crud.commons.domain.BaseDomainCrudRepository;
import ir.msob.jima.crud.service.childdomain.BaseChildDomainCrudService;
import ir.msob.jima.crud.service.domain.BaseDomainCrudService;
import ir.msob.jima.crud.test.domain.BaseDomainCrudDataProvider;
import ir.msob.manak.core.model.jima.childdomain.characteristic.Characteristic;
import ir.msob.manak.core.model.jima.childdomain.characteristic.CharacteristicCriteria;
import ir.msob.manak.core.model.jima.security.User;
import ir.msob.manak.core.test.jima.crud.base.childdomain.characteristic.BaseCharacteristicCrudDataProvider;

import java.lang.reflect.Type;
import java.util.Collection;

public abstract class BaseCharacteristicCrudRestResourceTest<
        D extends BaseDomain<String>,
        DTO extends BaseDto<String>,
        C extends BaseCriteria<String>,
        R extends BaseDomainCrudRepository<String, D>,
        S extends BaseDomainCrudService<String, User, D, DTO, C, R>,
        DP extends BaseDomainCrudDataProvider<String, User, D, DTO, C, R, S>,
        CS extends BaseChildDomainCrudService<String, User, DTO>,
        CDP extends BaseCharacteristicCrudDataProvider<DTO, CS>>
        extends ChildCrudRestResourceTest<D, DTO, C, R, S, DP, CS, CDP>
        implements ir.msob.jima.crud.api.restful.test.childdomain.characteristic.BaseCharacteristicCrudRestResourceTest<String, User, Characteristic, CharacteristicCriteria, D, DTO, C, R, S, DP, CS, CDP> {


    @Override
    public Assertable<DTO> getUpdateAssertable() {
        return dto -> {
        };
    }

    @Override
    public Assertable<DTO> getDeleteAssertable() {
        return dto -> {
        };
    }

    @Override
    public Assertable<DTO> getSaveAssertable() {
        return dto -> {
        };
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