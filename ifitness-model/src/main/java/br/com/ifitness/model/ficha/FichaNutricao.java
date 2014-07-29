package br.com.ifitness.model.ficha;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name = "ficha_nutricao")
@Cache(usage = CacheConcurrencyStrategy.TRANSACTIONAL)
public class FichaNutricao implements Serializable {

	private static final long serialVersionUID = -5227596184639833619L;

}
