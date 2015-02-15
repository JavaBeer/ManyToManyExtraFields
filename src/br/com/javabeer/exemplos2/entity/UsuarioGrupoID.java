package br.com.javabeer.exemplos2.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

@Embeddable
public class UsuarioGrupoID implements Serializable{
	/**
	 * 
	 */
	public static final long serialVersionUID = 1105216802883021988L;
	private Usuario usuario;
	private Grupo grupo;
	
	@ManyToOne(cascade = CascadeType.ALL)
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	@ManyToOne(cascade = CascadeType.ALL)
	public Grupo getGrupo() {
		return grupo;
	}
	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}
}