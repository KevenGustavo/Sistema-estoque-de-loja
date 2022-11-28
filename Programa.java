public class Programa {
    public static void main(String[] args) {

        Fornecedores fornecedores = new Fornecedores();
        Estoque controle = new Estoque();

        fornecedores.cadastrarFornecedor("Mercado Livre");
        String mercadoLivre = fornecedores.getFornecedor("Mercado Livre");

        controle.cadastrarProduto(true,21,"Limpo",mercadoLivre,12.50f,2);

        controle.listarProdutos();
        controle.setQuantidadeProduto(21, 30);
        controle.listarProdutos();

    }
}