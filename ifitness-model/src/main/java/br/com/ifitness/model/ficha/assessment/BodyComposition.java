package br.com.ifitness.model.ficha.assessment;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name = "body_composition")
@Cache(usage = CacheConcurrencyStrategy.TRANSACTIONAL)
public class BodyComposition implements Serializable {

	private static final long serialVersionUID = -7014757235651945969L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "subscapular")
	private Double subscapular;

	@Column(name = "suprailiac")
	private Double suprailiac;

	@Column(name = "triceps")
	private Double triceps;

	@Column(name = "biceps")
	private Double biceps;

	@Column(name = "abdominal")
	private Double abdominal;

	@Column(name = "thigh")
	private Double thigh;

	@Column(name = "chest")
	private Double chest;

	@Column(name = "midaxillary")
	private Double midaxillary;

	@Column(name = "calf")
	private Double calf;

	@Column(name = "body_density")
	private Double bodyDensity;

	@Column(name = "body_fat")
	private Double bodyFat;

	@Column(name = "body_free_fat")
	private Double bodyFreeFat;

	@Column(name = "body_fat_weight")
	private Double bodyFatWeight;

	@Column(name = "body_fat_weight")
	private Double bodyFreeFatWeight;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getSubscapular() {
		return subscapular;
	}

	public void setSubscapular(Double subscapular) {
		this.subscapular = subscapular;
	}

	public Double getSuprailiac() {
		return suprailiac;
	}

	public void setSuprailiac(Double suprailiac) {
		this.suprailiac = suprailiac;
	}

	public Double getTriceps() {
		return triceps;
	}

	public void setTriceps(Double triceps) {
		this.triceps = triceps;
	}

	public Double getBiceps() {
		return biceps;
	}

	public void setBiceps(Double biceps) {
		this.biceps = biceps;
	}

	public Double getAbdominal() {
		return abdominal;
	}

	public void setAbdominal(Double abdominal) {
		this.abdominal = abdominal;
	}

	public Double getThigh() {
		return thigh;
	}

	public void setThigh(Double thigh) {
		this.thigh = thigh;
	}

	public Double getChest() {
		return chest;
	}

	public void setChest(Double chest) {
		this.chest = chest;
	}

	public Double getMidaxillary() {
		return midaxillary;
	}

	public void setMidaxillary(Double midaxillary) {
		this.midaxillary = midaxillary;
	}

	public Double getCalf() {
		return calf;
	}

	public void setCalf(Double calf) {
		this.calf = calf;
	}

	public Double getBodyDensity() {
		return bodyDensity;
	}

	public void setBodyDensity(Double bodyDensity) {
		this.bodyDensity = bodyDensity;
	}

	public Double getBodyFat() {
		return bodyFat;
	}

	public void setBodyFat(Double bodyFat) {
		this.bodyFat = bodyFat;
	}

	public Double getBodyFreeFat() {
		return bodyFreeFat;
	}

	public void setBodyFreeFat(Double bodyFreeFat) {
		this.bodyFreeFat = bodyFreeFat;
	}

	public Double getBodyFatWeight() {
		return bodyFatWeight;
	}

	public void setBodyFatWeight(Double bodyFatWeight) {
		this.bodyFatWeight = bodyFatWeight;
	}

	public Double getBodyFreeFatWeight() {
		return bodyFreeFatWeight;
	}

	public void setBodyFreeFatWeight(Double bodyFreeFatWeight) {
		this.bodyFreeFatWeight = bodyFreeFatWeight;
	}
}
