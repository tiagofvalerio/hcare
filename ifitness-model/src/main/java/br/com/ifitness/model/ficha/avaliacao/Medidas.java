package br.com.ifitness.model.ficha.avaliacao;

import java.io.Serializable;
import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name = "medidas")
@Cache(usage = CacheConcurrencyStrategy.TRANSACTIONAL)
public class Medidas implements Serializable {

	private static final long serialVersionUID = -6380625026977502114L;
	
	private Map<TipoMedidas, Integer> medidasSubCutaneas; 

}
