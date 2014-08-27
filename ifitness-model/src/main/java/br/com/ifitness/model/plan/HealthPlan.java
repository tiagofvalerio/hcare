package br.com.ifitness.model.plan;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import br.com.ifitness.model.ficha.assessment.FitnessAssessment;

@Entity
@Table(name = "health_plan")
@Cache(usage = CacheConcurrencyStrategy.TRANSACTIONAL)
public class HealthPlan implements Serializable {

	private static final long serialVersionUID = 5464514513002370374L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@OneToMany(cascade = { CascadeType.PERSIST, CascadeType.REMOVE,
			CascadeType.REFRESH }, fetch = FetchType.LAZY, mappedBy = "healthPlan")
	@Cache(usage = CacheConcurrencyStrategy.TRANSACTIONAL)
	@Fetch(FetchMode.JOIN)
	private List<FitnessAssessment> fitnessAssessments;

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_id_physical_plan")
	@Cache(usage = CacheConcurrencyStrategy.TRANSACTIONAL)
	private PhysicalPlan physicalPlan;

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_id_nutrition_plan")
	@Cache(usage = CacheConcurrencyStrategy.TRANSACTIONAL)
	private NutritionPlan nutritionPlan;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<FitnessAssessment> getFitnessAssessments() {
		return fitnessAssessments;
	}

	public void setFitnessAssessments(List<FitnessAssessment> fitnessAssessments) {
		this.fitnessAssessments = fitnessAssessments;
	}

	public PhysicalPlan getPhysicalPlan() {
		return physicalPlan;
	}

	public void setPhysicalPlan(PhysicalPlan physicalPlan) {
		this.physicalPlan = physicalPlan;
	}

	public NutritionPlan getNutritionPlan() {
		return nutritionPlan;
	}

	public void setNutritionPlan(NutritionPlan nutritionPlan) {
		this.nutritionPlan = nutritionPlan;
	}
}
