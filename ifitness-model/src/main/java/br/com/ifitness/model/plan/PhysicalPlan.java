package br.com.ifitness.model.plan;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name = "physical_plan")
@Cache(usage = CacheConcurrencyStrategy.TRANSACTIONAL)
public class PhysicalPlan implements Serializable {

	private static final long serialVersionUID = -7433705848838277075L;

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "physicalPlan")
	@JoinColumn(name = "fk_id_physical_plan")
	@Cache(usage = CacheConcurrencyStrategy.TRANSACTIONAL)
	private HealthPlan healthPlan;

}
