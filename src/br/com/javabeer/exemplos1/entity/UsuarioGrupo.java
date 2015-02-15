package br.com.javabeer.exemplos1.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.xml.crypto.Data;

@Entity
public class UsuarioGrupo {
	@Id 
	@GeneratedValue
	@Column(name="id_usuario_grupo")
	private Integer usuarioGrupoId;
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idusuario") 
	private Usuario usuario;
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idgrupo") 
	private Grupo grupo;
	
	private Data dataModificacao;
}
