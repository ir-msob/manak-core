package ir.msob.manak.core.model.jima.childdomain.relatedaction;

import com.fasterxml.jackson.annotation.JsonInclude;
import ir.msob.jima.core.commons.childdomain.relatedaction.RelatedActionAbstract;
import ir.msob.jima.core.commons.shared.auditinfo.AuditInfo;
import ir.msob.jima.core.commons.shared.timeperiod.TimePeriod;
import lombok.*;

@Setter
@Getter
@ToString(callSuper = true)
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RelatedAction extends RelatedActionAbstract<String> {
    @Builder
    public RelatedAction(String name, String status, Boolean mandatory, TimePeriod validFor, AuditInfo auditInfo) {
        super(name, status, mandatory, validFor, auditInfo);
    }
}