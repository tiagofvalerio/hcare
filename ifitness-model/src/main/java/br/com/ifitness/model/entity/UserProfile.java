package br.com.ifitness.model.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import br.com.ifitness.model.plan.HealthPlan;

@Entity
@Table(name = "user_profile")
@Cache(usage = CacheConcurrencyStrategy.TRANSACTIONAL)
public class UserProfile implements Serializable {

	private static final long serialVersionUID = 544300113627830302L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "name")
	@Size(max = 30)
	private String name;

	@Column(name = "last_name")
	@Size(max = 70)
	private String lastName;

	@Column(name = "age")
	private Short age;

	@Enumerated(EnumType.STRING)
	@Column(name = "gender")
	private GenderType gender;

	@Column(name = "birthday")
	private Date birthDate;

	@Column(name = "profession")
	private String profession;

	@Enumerated(EnumType.STRING)
	@Column(name = "user_type")
	private UserType userType;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_id_address")
	@Fetch(FetchMode.JOIN)
	@Cache(usage = CacheConcurrencyStrategy.TRANSACTIONAL)
	private Address address;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_id_health_plan")
	@Cache(usage = CacheConcurrencyStrategy.TRANSACTIONAL)
	private HealthPlan healthPlan;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Short getAge() {
		return age;
	}

	public void setAge(Short age) {
		this.age = age;
	}

	public GenderType getGender() {
		return gender;
	}

	public void setGender(GenderType gender) {
		this.gender = gender;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public UserType getUserType() {
		return userType;
	}

	public void setUserType(UserType userType) {
		this.userType = userType;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public HealthPlan getHealthPlan() {
		return healthPlan;
	}

	public void setHealthPlan(HealthPlan healthPlan) {
		this.healthPlan = healthPlan;
	}
}
