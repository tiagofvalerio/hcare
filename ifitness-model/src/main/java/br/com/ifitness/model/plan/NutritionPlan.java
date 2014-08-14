package br.com.ifitness.model.plan;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name = "nutrition_plan")
@Cache(usage = CacheConcurrencyStrategy.TRANSACTIONAL)
public class NutritionPlan implements Serializable{

	private static final long serialVersionUID = 3368815005315343754L;
	
	

}
