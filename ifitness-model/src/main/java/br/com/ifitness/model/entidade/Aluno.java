package br.com.ifitness.model.entidade;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@DiscriminatorValue("AL")
@Cache(usage = CacheConcurrencyStrategy.TRANSACTIONAL)
public class Aluno extends Pessoa implements Serializable {

	private static final long serialVersionUID = -3996713181349887586L;
	
	/**
	 * private HistoricoMedico historicoMedico; 
	 */

}
