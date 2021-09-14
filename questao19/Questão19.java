public class supermercado {

    public static void main(String[] args) {
        
        Scanner digite = new Scanner (System.in);
        System.out.println("Olá, faça seu pedido!");
        
        System.out.println("Produtos disponíveis: ");
        Produto arroz = new Produto("1. Arroz", 5.00, 10);
        Produto feijao = new Produto("2. Feijão", 8.00, 10);
        Produto macarrao = new Produto("3. Macarrão", 4.00, 10);
        
        System.out.println("Escolha-os de acordo com sua numeração: ");
        Itens i1 = new Itens(0, arroz, 2);
        Itens i2 = new Itens(1, feijao, 3);
        Itens i3 = new Itens(2, macarrao, 1);
        
        System.out.println("Qual será a forma de pagamento?: ");
        System.out.println("As formas disponíeis são: ");
        System.out.println("Dinheiro");
        System.out.println("Cartão");
        String pagamento = digite.next();
        
        if (Cartao) {
            System.out.println("Ok!");

        }
    
        else {
            System.out.println("Qual será a quantia de pagamento? ");
            
            System.out.println("Aqui está seu troco. Volte sempre! :) ");
        }
        
        Pedido pedido = new Pedido(1, "Cartão de Crédito", 3);
        pedido.adicionarItem(i1);
        pedido.adicionarItem(i2);
        pedido.adicionarItem(i3);

        pedido.imprimir();
        
        

    }

}
