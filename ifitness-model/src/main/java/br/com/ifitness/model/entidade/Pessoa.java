package br.com.ifitness.model.entidade;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

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

}
