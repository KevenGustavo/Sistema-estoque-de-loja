public class Main{
    public static void main(String[] args) {
        fornecedores fornecedores = new fornecedores();
        estoque controle = new estoque();

        fornecedores.cadastrarFornecedor("Mercado Livre");
        String mercadoLivre = fornecedores.getFornecedor("Mercado Livre");

        controle.cadastrarProduto(true,21,"Limpo",mercadoLivre,12.50f,2);
        
        controle.listarProdutos();
        controle.setQuantidadeProduto(21, 30);
        controle.listarProdutos();
    }
}
  