package ir.msob.manak.core.service.jima.service;

import ir.msob.jima.core.commons.id.BaseIdService;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Component;


@Component
public class IdService implements BaseIdService {
    @Override
    public String newId() {
        return new ObjectId().toHexString();
    }

    @Override
    public String of(String id) {
        return id;
    }
}
