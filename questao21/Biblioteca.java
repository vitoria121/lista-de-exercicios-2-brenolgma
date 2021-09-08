package questao21;

public class Biblioteca {

    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa("Joedson", "12345678912", "(75) 987879-1234", "joedson@ifba.edu.br");
        Livro livro1 = new Livro("Java: Como programar!", "Deitel", "Pearson", "Programação", 2021);

        Emprestimo emprestimo = new Emprestimo(pessoa1, livro1, 10);

        Pessoa novaPessoa = emprestimo.getPessoa();
        Livro novoLivro = emprestimo.getLivro();

        System.out.println("Nome: " + novaPessoa.getNome());
        System.out.println("Livro emprestado: " + novoLivro.getTitulo());
        System.out.println("Dias de empréstimo: " + emprestimo.getDiasEmprestimo() + " dias.");

    }
}
