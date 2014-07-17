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

import br.com.ifitness.model.entidade.Pessoa;

@Entity
@Table(name = "agenda")
public class Agenda implements Serializable {

	private static final long serialVersionUID = -5086373591810679643L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@ManyToOne
	@JoinColumn(name = "fk_id_pessoa")
	@Cache(usage = CacheConcurrencyStrategy.TRANSACTIONAL)
	@Fetch(FetchMode.JOIN)
	private Pessoa pessoa;

	@Column(name = "data_inicial_evento")
	private Date dataInicialEvento;

	@Column(name = "data_final_evento")
	private Date dataFinalEvento;

	@Column(name = "titulo_evento")
	private String tituloEvento;

	@Column(name = "descricao_evento")
	private String descricaoEvento;

	@Column(name = "local_evento")
	private String localEvento;

	@Column(name = "dura_dia_todo")
	private Boolean duraDiaTodo;

	@Column(name = "repete_evento")
	private Boolean repeteEvento;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Date getDataInicialEvento() {
		return dataInicialEvento;
	}

	public void setDataInicialEvento(Date dataInicialEvento) {
		this.dataInicialEvento = dataInicialEvento;
	}

	public Date getDataFinalEvento() {
		return dataFinalEvento;
	}

	public void setDataFinalEvento(Date dataFinalEvento) {
		this.dataFinalEvento = dataFinalEvento;
	}

	public String getTituloEvento() {
		return tituloEvento;
	}

	public void setTituloEvento(String tituloEvento) {
		this.tituloEvento = tituloEvento;
	}

	public String getDescricaoEvento() {
		return descricaoEvento;
	}

	public void setDescricaoEvento(String descricaoEvento) {
		this.descricaoEvento = descricaoEvento;
	}

	public String getLocalEvento() {
		return localEvento;
	}

	public void setLocalEvento(String localEvento) {
		this.localEvento = localEvento;
	}

	public Boolean getDuraDiaTodo() {
		return duraDiaTodo;
	}

	public void setDuraDiaTodo(Boolean duraDiaTodo) {
		this.duraDiaTodo = duraDiaTodo;
	}

	public Boolean getRepeteEvento() {
		return repeteEvento;
	}

	public void setRepeteEvento(Boolean repeteEvento) {
		this.repeteEvento = repeteEvento;
	}

}
