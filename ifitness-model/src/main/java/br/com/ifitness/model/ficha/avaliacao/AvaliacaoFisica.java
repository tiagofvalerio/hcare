package br.com.ifitness.model.ficha.avaliacao;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import br.com.ifitness.model.ficha.FichaAluno;

@Entity
@Table(name = "avaliacao_fisica")
@Cache(usage = CacheConcurrencyStrategy.TRANSACTIONAL)
public class AvaliacaoFisica implements Serializable {

	private static final long serialVersionUID = 8295039453208715337L;

	@ManyToOne
	@JoinColumn(name = "fk_id_ficha_aluno")
	@Cache(usage = CacheConcurrencyStrategy.TRANSACTIONAL)
	private FichaAluno fichaAluno;

	public FichaAluno getFichaAluno() {
		return fichaAluno;
	}

	public void setFichaAluno(FichaAluno fichaAluno) {
		this.fichaAluno = fichaAluno;
	}
}
