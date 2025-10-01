package ir.msob.manak.core.model.jima.childdomain.relatedaction;

import com.fasterxml.jackson.annotation.JsonInclude;
import ir.msob.jima.core.commons.childdomain.relatedaction.RelatedActionCriteriaAbstract;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString(callSuper = true)
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RelatedActionCriteria extends RelatedActionCriteriaAbstract<String, RelatedAction> {

}