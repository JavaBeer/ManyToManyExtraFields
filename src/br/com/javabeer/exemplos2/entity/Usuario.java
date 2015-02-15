package br.com.javabeer.exemplos2.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
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

	@OneToMany(mappedBy = "id.usuario",
			cascade = CascadeType.ALL)
	private List<UsuarioGrupo> usuarioGrupo = new ArrayList<UsuarioGrupo>();

	public Integer getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
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

	public List<UsuarioGrupo> getUsuarioGrupo() {
		return usuarioGrupo;
	}

	public void setUsuarioGrupo(List<UsuarioGrupo> usuarioGrupo) {
		this.usuarioGrupo = usuarioGrupo;
	}
	
	public void addUsuarioGrupo(UsuarioGrupo usuarioGrupo){
		this.usuarioGrupo.add(usuarioGrupo);
	}
}
