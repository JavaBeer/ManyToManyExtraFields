package br.com.javabeer.exemplos1.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Usuario {
	@Id 
	@GeneratedValue
	@Column(name="idusuario")
	private Integer idUsuario;
	private String nome;
	private String sobrenome;
	private String email;
	@OneToMany(mappedBy = "idusuario")
	private List<UsuarioGrupo> usuarioGrupo;
}
