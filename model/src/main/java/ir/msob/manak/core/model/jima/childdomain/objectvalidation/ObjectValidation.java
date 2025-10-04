package ir.msob.manak.core.model.jima.childdomain.objectvalidation;

import com.fasterxml.jackson.annotation.JsonInclude;
import ir.msob.jima.core.commons.childdomain.objectvalidation.ObjectValidationAbstract;
import ir.msob.jima.core.commons.shared.timeperiod.TimePeriod;
import lombok.*;

@Setter
@Getter
@ToString(callSuper = true)
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ObjectValidation extends ObjectValidationAbstract<String> {
    @Builder
    public ObjectValidation(String name, String status, Boolean enabled, TimePeriod validFor) {
        super(name, status, enabled, validFor);
    }
}