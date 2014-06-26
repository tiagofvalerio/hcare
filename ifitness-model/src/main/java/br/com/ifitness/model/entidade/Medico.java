package br.com.ifitness.model.entidade;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@DiscriminatorValue("ME")
@Cache(usage = CacheConcurrencyStrategy.TRANSACTIONAL)
public class Medico extends Pessoa implements Serializable {

	private static final long serialVersionUID = -8526022090360710130L;

}
