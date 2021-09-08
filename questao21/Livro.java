package questao21;

/*
 * Faça um programa para controle de empréstimo de livros, com as classes
 * Emprestimo, Livro e Pessoa
 */

public class Livro {

    private String titulo;
    private String autor;
    private String editora;
    private String genero;
    private int ano;

    public Livro(String titulo, String autor, String editora, String genero, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.genero = genero;
        this.ano = ano;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

}