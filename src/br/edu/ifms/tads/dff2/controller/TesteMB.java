package br.edu.ifms.tads.dff2.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.hibernate.Session;

import br.edu.esab.util.HibernateUtil;
import br.edu.ifms.tads.dao.PessoaDAO;
import br.edu.ifms.tads.dbf3.model.Pessoa;

@ManagedBean
@SessionScoped
public class TesteMB {

	private Pessoa pessoa = new Pessoa();

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	public void  salvar(){
		
		PessoaDAO pd = new PessoaDAO();
		pd.salvar(pessoa);
		
		this.pessoa = new Pessoa();
		
	}
	
	
}
