package br.com.ifitness.model.ficha;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name = "ficha_medica")
@Cache(usage = CacheConcurrencyStrategy.TRANSACTIONAL)
public class FichaMedica implements Serializable {

	private static final long serialVersionUID = 4316906903486554003L;

}
