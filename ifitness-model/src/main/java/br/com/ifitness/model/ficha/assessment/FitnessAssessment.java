package br.com.ifitness.model.ficha.assessment;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import br.com.ifitness.model.plan.HealthPlan;

@Entity
@Table(name = "fitness_assessment")
@Cache(usage = CacheConcurrencyStrategy.TRANSACTIONAL)
public class FitnessAssessment implements Serializable {

	private static final long serialVersionUID = 8295039453208715337L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "weight")
	private Double weight;

	@Column(name = "height")
	private Double height;

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "fk_id_physical_plan")
	@Cache(usage = CacheConcurrencyStrategy.TRANSACTIONAL)
	private BodyComposition bodyComposition;

	@ManyToOne
	@JoinColumn(name = "fk_id_health_plan")
	@Cache(usage = CacheConcurrencyStrategy.TRANSACTIONAL)
	private HealthPlan healthPlan;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public BodyComposition getBodyComposition() {
		return bodyComposition;
	}

	public void setBodyComposition(BodyComposition bodyComposition) {
		this.bodyComposition = bodyComposition;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	public HealthPlan getHealthPlan() {
		return healthPlan;
	}

	public void setHealthPlan(HealthPlan healthPlan) {
		this.healthPlan = healthPlan;
	}

}
