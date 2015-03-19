package br.edu.ifms.tads.dao;

import org.hibernate.Session;

import br.edu.esab.util.HibernateUtil;
import br.edu.ifms.tads.dbf3.model.Pessoa;

public class PessoaDAO {

		
public void  salvar(Pessoa pessoa){
		
		//System.out.println(this.pessoa.getId());
		
		//Pessoa p1 = new Pessoa();
		
		/*pessoa.setId(pessoa.getId());
		pessoa.setNome(pessoa.getNome());
		pessoa.setRg(pessoa.getRg());*/
		
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		
		session.beginTransaction();
		
		session.save(pessoa);
		
		session.getTransaction().commit();
		
	}
}
