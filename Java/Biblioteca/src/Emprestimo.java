public class Emprestimo {
	
	
	private String prazo;
	Livro[] livro;
	Pessoa pessoa;
	
	
	
	public Emprestimo(String prazo, Livro[] livro, Pessoa pessoa) {
		this.prazo = prazo;
		this.livro = livro;
		this.pessoa = pessoa;
	}
	
	public Emprestimo(){
		
	}


	public String getPrazo() {
		return prazo;
	}

	public void setPrazo(String prazo) {
		this.prazo = prazo;
	}

	public Livro[] getLivro() {
		return livro;
	}

	public void setLivro(Livro[] livro) {
		this.livro = livro;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	

	
}
