package br.com.javabeer.exemplos1.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Grupo {
	@Id 
	@GeneratedValue
	@Column(name="idgrupo")
	private Integer idGrupo;
	private String grupo;
	@OneToMany(mappedBy = "idgrupo")
	private List<UsuarioGrupo> usuarioGrupo;
}
