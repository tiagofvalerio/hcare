package br.com.ifitness.model.entidade;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Size;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Table(name = "pessoa", uniqueConstraints = { @UniqueConstraint(columnNames = {"id", "tipo" }) })
@DiscriminatorColumn(name = "tipo", discriminatorType = DiscriminatorType.STRING, columnDefinition = "varchar", length = 3)
@Cache(usage = CacheConcurrencyStrategy.TRANSACTIONAL)
public class Pessoa implements Serializable {

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
    
    @Column(name = "email")
    private String email;
    
    @Column(name = "idade")
    private Short idade;
    
    @Column(name = "data_nascimento")
    private Date dataNascimento;
    
    @Column(name="profissao")
    private String profissao;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_id_endereco")
    @Fetch(FetchMode.JOIN)
	@Cache(usage = CacheConcurrencyStrategy.TRANSACTIONAL)
    private Endereco endereco;
    
    @Column(name = "tipo", nullable = false, updatable = false, insertable = false)
    private String tipo;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", nome=" + nome + ", sobrenome="
				+ sobrenome + ", email=" + email + ", idade=" + idade
				+ ", dataNascimento=" + dataNascimento + ", profissao="
				+ profissao + ", endereco=" + endereco + "]";
	}

}
