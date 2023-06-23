package br.fernando.teste.kumulus.dao;

import java.util.List;

import org.junit.Test;

import br.fernando.teste.kumulus.domain.Cidade;
import br.fernando.teste.kumulus.domain.Pessoa;

public class PessoaDAOTest {

	@Test
	public void salvar() {
		
		CidadeDAO cidadeDAO = new CidadeDAO();
		
		Cidade cidade = cidadeDAO.buscar(1L);
		
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Fernando Dantas");
		pessoa.setEmail("email@teste.com");
		pessoa.setRg("2547589");
		pessoa.setTelefone("8333412065");
		pessoa.setCelular("83057452546");
		pessoa.setCpf("05412355987");
		pessoa.setCep("54546228");
		pessoa.setBairro("Miramar");
		pessoa.setRua("Rua das acacias");
		pessoa.setNumero(647L);
		pessoa.setComplemento("");
		pessoa.setCidade(cidade);
		
		PessoaDAO pessoaDAO = new PessoaDAO();
		pessoaDAO.salvar(pessoa);
		
	}
	
	@Test
	public void listar() {
		PessoaDAO pessoaDAO = new PessoaDAO();
		List<Pessoa> resultado = pessoaDAO.listar();
		
		resultado.forEach(r -> {
			System.out.println("Código: " + r.getCodigo() + " - " + r.getNome() + " - " + r.getCpf());			
		});
	}
	
	@Test
	public void buscar() {
		Long codigo = 1L;
		
		PessoaDAO pessoaDAO = new PessoaDAO();
		Pessoa pessoa = pessoaDAO.buscar(codigo);
		
		if(pessoa == null) {
			System.out.println("Nenhum registro encontrado");
		}else {
			System.out.println("Código: " + pessoa.getCodigo() + " - " + pessoa.getNome() + " - " + pessoa.getCpf());
		}
	}
	
	@Test
	public void excluir() {		
		Long codigo = 1L;
		
		PessoaDAO pessoaDAO = new PessoaDAO();		
		Pessoa pessoa = pessoaDAO.buscar(codigo);
		
		pessoaDAO.excluir(pessoa);
		
		System.out.println("Pessoa Removida");
		System.out.println("Código: " + pessoa.getCodigo() + " - " + pessoa.getNome() + " - " + pessoa.getCpf());
	}
	
	@Test
	public void editar(){
		Long codigoPessoa = 1L;
		Long codigoCidade = 1L;
		
		CidadeDAO cidadeDAO = new CidadeDAO();
		Cidade cidade = cidadeDAO.buscar(codigoCidade);
		
		System.out.println("Código da cidade: " + cidade.getCodigo());
		System.out.println("Nome da cidade: " + cidade.getNome());
		System.out.println("Sigla do Estado: " + cidade.getEstado().getSigla());
		
		
		PessoaDAO pessoaDAO = new PessoaDAO();
		Pessoa pessoa = pessoaDAO.buscar(codigoPessoa);
		
		System.out.println("Pessoa A Ser Editada");
		System.out.println("Código da Pessoa: " + pessoa.getCodigo());
		System.out.println("Nome da Pessoa: " + pessoa.getNome());		
		
		pessoa.setNome("Junior");
		
		pessoaDAO.editar(pessoa);
		
	}
	
}
