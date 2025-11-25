package ir.msob.manak.core.model.jima.childdomain.criteria;

import com.fasterxml.jackson.annotation.JsonInclude;
import ir.msob.jima.core.commons.childdomain.criteria.BaseChildCriteriaAbstract;
import ir.msob.manak.core.model.jima.childdomain.ChildDomain;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString(callSuper = true)
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public abstract class ChildCriteriaAbstract<CHILD extends ChildDomain> extends BaseChildCriteriaAbstract<String, CHILD> implements ChildCriteria<CHILD> {

}