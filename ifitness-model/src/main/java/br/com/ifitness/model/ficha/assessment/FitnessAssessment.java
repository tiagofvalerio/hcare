package br.com.ifitness.model.ficha.assessment;

import java.io.Serializable;
import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import br.com.ifitness.model.plan.HealthPlan;

@Entity
@Table(name = "fitness_assessment")
@Cache(usage = CacheConcurrencyStrategy.TRANSACTIONAL)
public class FitnessAssessment implements Serializable {

	private static final long serialVersionUID = 8295039453208715337L;

	private Map<MeasurementsType, Integer> subcutaneousMeasurements;

	@ManyToOne
	@JoinColumn(name = "fk_id_health_plan")
	@Cache(usage = CacheConcurrencyStrategy.TRANSACTIONAL)
	private HealthPlan healthPlan;

	public HealthPlan getHealthPlan() {
		return healthPlan;
	}

	public void setHealthPlan(HealthPlan healthPlan) {
		this.healthPlan = healthPlan;
	}

	public Map<MeasurementsType, Integer> getSubcutaneousMeasurements() {
		return subcutaneousMeasurements;
	}

	public void setSubcutaneousMeasurements(
			Map<MeasurementsType, Integer> subcutaneousMeasurements) {
		this.subcutaneousMeasurements = subcutaneousMeasurements;
	}

}
