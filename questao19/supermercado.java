package questao19;

/*
Identifique as classes e implemente um programa para a seguinte especificação: “O
supermercado vende diferentes tipos de produtos. Cada produto tem um preço e uma
quantidade em estoque. Um pedido de um cliente é composto de itens, onde cada
item especifica o produto que o cliente deseja e a respectiva quantidade. Esse
pedido pode ser pago em dinheiro, cheque ou cartão.”

PROVA 3 - UNIDADE 1
Entrega até 14/09/2021 às 23:59

- Usuário que deve Adicionar itens ao pedido (Apresente a lista de produtos e
quantidade disponível)
- Editar o pedido (Apresente a lista de produtos e quantidade disponível)
- Usuário que deve remover itens do pedido
- Usuário que deve escolher a forma de pagamento do pedido após o pedido ser
finalizado (Dinheiro ou Cartão)
- Se dinheiro, o usuário deve informar o valor do pagamento e o troco deve ser apresentado
*/

public class supermercado {

    public static void main(String[] args) {

        Produto arroz = new Produto("Arroz", 5.00, 10);
        Produto feijao = new Produto("Feijão", 8.00, 10);
        Produto macarrao = new Produto("Macarrão", 4.00, 10);

        Itens i1 = new Itens(0, arroz, 2);
        Itens i2 = new Itens(1, feijao, 3);
        Itens i3 = new Itens(2, macarrao, 1);

        Pedido pedido = new Pedido(1, "Cartão de Crédito", 3);
        pedido.adicionarItem(i1);
        pedido.adicionarItem(i2);
        pedido.adicionarItem(i3);

        pedido.imprimir();

    }

}
