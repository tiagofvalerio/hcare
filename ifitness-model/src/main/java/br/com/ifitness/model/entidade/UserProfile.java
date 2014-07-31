package br.com.ifitness.model.entidade;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import br.com.ifitness.model.ficha.FichaPersonal;

@Entity
@Table(name = "user_profile")
@Cache(usage = CacheConcurrencyStrategy.TRANSACTIONAL)
public class UserProfile implements Serializable {

	private static final long serialVersionUID = 544300113627830302L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "nome")
	@Size(max = 30)
	private String nome;

	@Column(name = "sobrenome")
	@Size(max = 70)
	private String sobrenome;

	@Column(name = "idade")
	private Short idade;

	@Enumerated(EnumType.STRING)
	@Column(name = "sexo")
	private TipoSexo sexo;

	@Column(name = "data_nascimento")
	private Date dataNascimento;

	@Column(name = "profissao")
	private String profissao;

	@Enumerated(EnumType.STRING)
	@Column(name = "tipo")
	private TipoUser tipo;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_id_endereco")
	@Fetch(FetchMode.JOIN)
	@Cache(usage = CacheConcurrencyStrategy.TRANSACTIONAL)
	private Endereco endereco;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_id_ficha_treino")
	@Cache(usage = CacheConcurrencyStrategy.TRANSACTIONAL)
	private FichaPersonal fichaTreino;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public Short getIdade() {
		return idade;
	}

	public void setIdade(Short idade) {
		this.idade = idade;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public TipoUser getTipo() {
		return tipo;
	}

	public void setTipo(TipoUser tipo) {
		this.tipo = tipo;
	}

	public TipoSexo getSexo() {
		return sexo;
	}

	public void setSexo(TipoSexo sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "UserProfile [id=" + id + ", nome=" + nome + ", sobrenome="
				+ sobrenome + ", idade=" + idade + ", sexo=" + sexo
				+ ", dataNascimento=" + dataNascimento + ", profissao="
				+ profissao + ", endereco=" + endereco + ", tipo=" + tipo + "]";
	}

}
