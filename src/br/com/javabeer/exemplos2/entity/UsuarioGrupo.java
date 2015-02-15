package br.com.javabeer.exemplos2.entity;

import java.util.Date;

import javax.persistence.AssociationOverride;
import javax.persistence.AssociationOverrides;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "usuario_grupo")
@AssociationOverrides({
	@AssociationOverride(name = "id.usuario",
			joinColumns = @JoinColumn(name = "idusuario")),
			@AssociationOverride(name = "id.grupo",
			joinColumns = @JoinColumn(name = "idgrupo")) })
public class UsuarioGrupo {
	
	private UsuarioGrupoID id = new UsuarioGrupoID();
	private Date dataModificacao;
	
	@EmbeddedId
	public UsuarioGrupoID getId() {
		return id;
	}
	public void setId(UsuarioGrupoID id) {
		this.id = id;
	}
	
	@Transient
	public Usuario getUsuario(){
		return getId().getUsuario();
	}
	public void setUsuario(Usuario u){
		getId().setUsuario(u);
	}
	@Transient
	public Grupo getGrupo(){
		return getId().getGrupo();
	}
	public void setGrupo(Grupo g){
		getId().setGrupo(g);
	}
	
	public Date getDataModificacao() {
		return dataModificacao;
	}
	public void setDataModificacao(Date dataModificacao) {
		this.dataModificacao = dataModificacao;
	}
	
}
