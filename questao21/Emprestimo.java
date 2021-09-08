package questao21;

/*
 * Faça um programa para controle de empréstimo de livros, com as classes
 * Emprestimo, Livro e Pessoa
 */

public class Emprestimo {

    private Pessoa pessoa;
    private Livro livro;
    private int diasEmprestimo;

    public Emprestimo(Pessoa pessoa, Livro livro, int diasEmprestimo) {
        this.pessoa = pessoa;
        this.livro = livro;
        this.diasEmprestimo = diasEmprestimo;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public int getDiasEmprestimo() {
        return diasEmprestimo;
    }

    public void setDiasEmprestimo(int diasEmprestimo) {
        this.diasEmprestimo = diasEmprestimo;
    }

}
