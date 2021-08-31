package questao19;

/*
Identifique as classes e implemente um programa para a seguinte especificação: “O
supermercado vende diferentes tipos de produtos. Cada produto tem um preço e uma
quantidade em estoque. Um pedido de um cliente é composto de itens, onde cada
item especifica o produto que o cliente deseja e a respectiva quantidade. Esse
pedido pode ser pago em dinheiro, cheque ou cartão.”
*/

public class Produto {

    private String nome;
    private double preco;
    private int quantidadeEstoque;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidade;
    }

    public Produto(int quantidade) {
        if (quantidade <= this.quantidadeEstoque) {
            this.quantidadeEstoque -= quantidade;
        } else {
            System.out.println("Quantidade indisponível");
        }
    }

    public String getNome() {
        return this.nome;
    }

    public double getPreco() {
        return this.preco;
    }

    public int getQuantidade() {
        return this.quantidadeEstoque;
    }

}
