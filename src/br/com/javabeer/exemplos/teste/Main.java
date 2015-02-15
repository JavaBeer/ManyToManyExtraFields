package br.com.javabeer.exemplos.teste;
import java.util.Date;


import org.hibernate.Session;

import br.com.javabeer.exemplos.util.HibernateUtil;
import br.com.javabeer.exemplos2.entity.Grupo;
import br.com.javabeer.exemplos2.entity.Usuario;
import br.com.javabeer.exemplos2.entity.UsuarioGrupo;

public class Main {

	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		session.getTransaction().begin();
		Usuario u = new Usuario();
		u.setEmail("francisco@javabeer.com.br");
		u.setNome("Francisco");
		u.setSobrenome("Almeida");
		
		Grupo g = new Grupo();
		g.setGrupo("Administradores");
		session.save(g);
		
		UsuarioGrupo ug = new UsuarioGrupo();
		ug.setGrupo(g);
		ug.setUsuario(u);
		ug.setDataModificacao(new Date());
		
		u.addUsuarioGrupo(ug);
		
		session.save(u);
		session.getTransaction().commit();
		session.close();
	}

}
