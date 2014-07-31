package br.com.ifitness.model.ficha;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import br.com.ifitness.model.ficha.avaliacao.AvaliacaoFisica;

@Entity
@Table(name = "ficha_aluno")
@Cache(usage = CacheConcurrencyStrategy.TRANSACTIONAL)
public class FichaAluno implements Serializable {

	private static final long serialVersionUID = 5464514513002370374L;

	@OneToMany(cascade = { CascadeType.PERSIST, CascadeType.REMOVE,
			CascadeType.REFRESH }, fetch = FetchType.LAZY, mappedBy = "fichaAluno")
	@Cache(usage = CacheConcurrencyStrategy.TRANSACTIONAL)
	@Fetch(FetchMode.JOIN)
	private List<AvaliacaoFisica> avaliacoesFisicas;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_id_ficha_personal")
	@Cache(usage = CacheConcurrencyStrategy.TRANSACTIONAL)
	private FichaPersonal fichaPersonal;

	public List<AvaliacaoFisica> getAvaliacoesFisicas() {
		return avaliacoesFisicas;
	}

	public void setAvaliacoesFisicas(List<AvaliacaoFisica> avaliacoesFisicas) {
		this.avaliacoesFisicas = avaliacoesFisicas;
	}

	public FichaPersonal getFichaPersonal() {
		return fichaPersonal;
	}

	public void setFichaPersonal(FichaPersonal fichaPersonal) {
		this.fichaPersonal = fichaPersonal;
	}

}
