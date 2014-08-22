package br.com.ifitness.model.ficha.assessment;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name = "body_composition")
@Cache(usage = CacheConcurrencyStrategy.TRANSACTIONAL)
public class BodyComposition implements Serializable {

	private static final long serialVersionUID = -7014757235651945969L;

	private Double subscapularMeasurement;

	private Double suprailiacMeasurement;

	private Double tricepsMeasurement;

	private Double bicepsMeasurement;

	private Double abdominalMeasurement;

	private Double thighMeasurement;

	private Double chestMeasurement;

	private Double midaxillaryMeasurement;

	private Double calfMeasurement;

	private Double bodyDensity;

	private Double BodyFat;

	private Double BodyFreeFat;

	private Double BodyFatWeight;

	private Double BodyFreeFatWeight;

	public Double getSubscapularMeasurement() {
		return subscapularMeasurement;
	}

	public void setSubscapularMeasurement(Double subscapularMeasurement) {
		this.subscapularMeasurement = subscapularMeasurement;
	}

	public Double getSuprailiacMeasurement() {
		return suprailiacMeasurement;
	}

	public void setSuprailiacMeasurement(Double suprailiacMeasurement) {
		this.suprailiacMeasurement = suprailiacMeasurement;
	}

	public Double getTricepsMeasurement() {
		return tricepsMeasurement;
	}

	public void setTricepsMeasurement(Double tricepsMeasurement) {
		this.tricepsMeasurement = tricepsMeasurement;
	}

	public Double getBicepsMeasurement() {
		return bicepsMeasurement;
	}

	public void setBicepsMeasurement(Double bicepsMeasurement) {
		this.bicepsMeasurement = bicepsMeasurement;
	}

	public Double getAbdominalMeasurement() {
		return abdominalMeasurement;
	}

	public void setAbdominalMeasurement(Double abdominalMeasurement) {
		this.abdominalMeasurement = abdominalMeasurement;
	}

	public Double getThighMeasurement() {
		return thighMeasurement;
	}

	public void setThighMeasurement(Double thighMeasurement) {
		this.thighMeasurement = thighMeasurement;
	}

	public Double getChestMeasurement() {
		return chestMeasurement;
	}

	public void setChestMeasurement(Double chestMeasurement) {
		this.chestMeasurement = chestMeasurement;
	}

	public Double getMidaxillaryMeasurement() {
		return midaxillaryMeasurement;
	}

	public void setMidaxillaryMeasurement(Double midaxillaryMeasurement) {
		this.midaxillaryMeasurement = midaxillaryMeasurement;
	}

	public Double getCalfMeasurement() {
		return calfMeasurement;
	}

	public void setCalfMeasurement(Double calfMeasurement) {
		this.calfMeasurement = calfMeasurement;
	}

	public Double getBodyDensity() {
		return bodyDensity;
	}

	public void setBodyDensity(Double bodyDensity) {
		this.bodyDensity = bodyDensity;
	}

	public Double getBodyFat() {
		return BodyFat;
	}

	public void setBodyFat(Double bodyFat) {
		BodyFat = bodyFat;
	}

	public Double getBodyFreeFat() {
		return BodyFreeFat;
	}

	public void setBodyFreeFat(Double bodyFreeFat) {
		BodyFreeFat = bodyFreeFat;
	}

	public Double getBodyFatWeight() {
		return BodyFatWeight;
	}

	public void setBodyFatWeight(Double bodyFatWeight) {
		BodyFatWeight = bodyFatWeight;
	}

	public Double getBodyFreeFatWeight() {
		return BodyFreeFatWeight;
	}

	public void setBodyFreeFatWeight(Double bodyFreeFatWeight) {
		BodyFreeFatWeight = bodyFreeFatWeight;
	}
}
