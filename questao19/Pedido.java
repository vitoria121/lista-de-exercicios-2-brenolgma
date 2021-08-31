package questao19;

/*
Identifique as classes e implemente um programa para a seguinte especificação: “O
supermercado vende diferentes tipos de produtos. Cada produto tem um preço e uma
quantidade em estoque. Um pedido de um cliente é composto de itens, onde cada
item especifica o produto que o cliente deseja e a respectiva quantidade. Esse
pedido pode ser pago em dinheiro, cheque ou cartão.”
*/

public class Pedido {

    private int id;
    public Produto[] produto;
    public int quantidade;
    public String formaPagamento;

    public Pedido(int id, String formaPagamento) {
        this.id = id;
        this.formaPagamento = formaPagamento;
    }

    public void fazerPedido(Produto produto, int quantidade) {
        if (quantidade <= produto.getQuantidade()) {
            this.produto = new Produto[10];
        }
    }

    public int getId() {
        return id;
    }

    public Produto[] getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }
}