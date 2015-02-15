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
public class Grupo {
	@Id 
	@GeneratedValue
	@Column(name="idgrupo")
	private Integer idGrupo;
	private String grupo;
	@OneToMany(mappedBy = "id.grupo",
			cascade = CascadeType.ALL)
	private List<UsuarioGrupo> usuarioGrupo = new ArrayList<UsuarioGrupo>();

	public Integer getIdGrupo() {
		return idGrupo;
	}
	public void setIdGrupo(Integer idGrupo) {
		this.idGrupo = idGrupo;
	}
	public String getGrupo() {
		return grupo;
	}
	public void setGrupo(String grupo) {
		this.grupo = grupo;
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
