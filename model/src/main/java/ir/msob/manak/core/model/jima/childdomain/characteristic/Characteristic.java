package ir.msob.manak.core.model.jima.childdomain.characteristic;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.io.Serializable;

@Setter
@Getter
@ToString(callSuper = true)
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Characteristic extends ir.msob.jima.core.commons.childdomain.characteristic.Characteristic<String> {

    @Builder
    public Characteristic(String id, String parentId, String key, Serializable value, String dataType) {
        super(id, parentId, key, value, dataType);
    }
}