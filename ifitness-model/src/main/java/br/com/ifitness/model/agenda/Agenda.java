package br.com.ifitness.model.agenda;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import br.com.ifitness.model.entity.UserProfile;

@Entity
@Table(name = "agenda")
@Cache(usage = CacheConcurrencyStrategy.TRANSACTIONAL)
public class Agenda implements Serializable {

	private static final long serialVersionUID = -5086373591810679643L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@ManyToOne
	@JoinColumn(name = "fk_id_user_profile")
	@Cache(usage = CacheConcurrencyStrategy.TRANSACTIONAL)
	@Fetch(FetchMode.JOIN)
	private UserProfile userProfile;

	@Column(name = "event_start_date")
	private Date eventStartDate;

	@Column(name = "event_final_date")
	private Date eventFinalDate;

	@Column(name = "event_title")
	private String eventTitle;

	@Column(name = "event_description")
	private String eventDescription;

	@Column(name = "event_location")
	private String eventLocation;

	@Column(name = "all_day")
	private Boolean allDay;

	@Column(name = "repeat")
	private Boolean repeat;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public UserProfile getUserProfile() {
		return userProfile;
	}

	public void setUserProfile(UserProfile userProfile) {
		this.userProfile = userProfile;
	}

	public Date getEventStartDate() {
		return eventStartDate;
	}

	public void setEventStartDate(Date eventStartDate) {
		this.eventStartDate = eventStartDate;
	}

	public Date getEventFinalDate() {
		return eventFinalDate;
	}

	public void setEventFinalDate(Date eventFinalDate) {
		this.eventFinalDate = eventFinalDate;
	}

	public String getEventTitle() {
		return eventTitle;
	}

	public void setEventTitle(String eventTitle) {
		this.eventTitle = eventTitle;
	}

	public String getEventDescription() {
		return eventDescription;
	}

	public void setEventDescription(String eventDescription) {
		this.eventDescription = eventDescription;
	}

	public String getEventLocation() {
		return eventLocation;
	}

	public void setEventLocation(String eventLocation) {
		this.eventLocation = eventLocation;
	}

	public Boolean getAllDay() {
		return allDay;
	}

	public void setAllDay(Boolean allDay) {
		this.allDay = allDay;
	}

	public Boolean getRepeat() {
		return repeat;
	}

	public void setRepeat(Boolean repeat) {
		this.repeat = repeat;
	}
}
