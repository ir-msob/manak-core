package ir.msob.manak.core.model.jima.childdomain.auditdomain;

import com.fasterxml.jackson.annotation.JsonInclude;
import ir.msob.jima.core.commons.childdomain.auditdomain.AuditDomainAbstract;
import ir.msob.manak.core.model.jima.childdomain.relatedobject.relatedparty.RelatedParty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString(callSuper = true)
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AuditDomain extends AuditDomainAbstract<String, RelatedParty> {

}