public class TestaEmprestimoLivro {
	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa("Eduardo", "012312312323", "kkkkk@kkk.com", 1223430948);
		Livro livro = new Livro("kk", "kk", "kkk");
		Livro[] livros = {livro};
		Emprestimo emprestimo = new Emprestimo("20/04/2020", livros, pessoa);

		
		System.out.println(emprestimo.getPessoa().getNome() + " pegou o livro " + emprestimo + " ");
		
	}
	
}
//menu com opcoes
//cadastrar usuario, adicionar livro, emprestar livro