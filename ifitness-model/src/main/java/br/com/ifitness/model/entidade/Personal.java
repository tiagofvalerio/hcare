package br.com.ifitness.model.entidade;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@DiscriminatorValue("PE")
@Cache(usage = CacheConcurrencyStrategy.TRANSACTIONAL)
public class Personal extends Pessoa implements Serializable {

	private static final long serialVersionUID = 7981690583526504451L;

}
