

import org.hibernate.Session;

import br.edu.esab.util.HibernateUtil;
import br.edu.ifms.tads.dbf3.model.Pessoa;

public class TesteHibernate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pessoa p1 = new Pessoa();
		
		p1.setId(2);
		p1.setNome("Teste Para o Primefaces");
		p1.setRg(052);
		
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		
		session.beginTransaction();
		
		session.save(p1);
		
		session.getTransaction().commit();

	}

}
