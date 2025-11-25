package ir.msob.manak.core.service.jima.security;

import com.fasterxml.jackson.databind.ObjectMapper;
import ir.msob.jima.core.beans.properties.JimaProperties;
import ir.msob.jima.core.commons.childdomain.relatedobject.relatedparty.RelatedPartyAbstract;
import ir.msob.jima.core.commons.security.BaseUser;
import ir.msob.manak.core.model.jima.childdomain.relatedobject.relatedparty.RelatedParty;
import ir.msob.manak.core.service.jima.security.keycloak.BaseKeycloakUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.Serializable;

@Service
@RequiredArgsConstructor
public class UserService implements BaseKeycloakUserService, BaseSecurityUserService {
    private final JimaProperties jimaProperties;
    private final ObjectMapper objectMapper;

    @Override
    public JimaProperties getJimaProperties() {
        return jimaProperties;
    }

    @Override
    public ObjectMapper getObjectMapper() {
        return objectMapper;
    }

    @Override
    public <USER extends BaseUser> USER getUser(String token) {
        // TODO
        return null;
    }

    @Override
    public <ID extends Comparable<ID> & Serializable, USER extends BaseUser, RP extends RelatedPartyAbstract<ID>> RP getRelatedParty(USER user) {
        RelatedParty relatedParty = new RelatedParty();
        relatedParty.setId(user.getId());
        relatedParty.setName(user.getName());
        return (RP) relatedParty;
    }
}
