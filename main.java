public class Main{
    public static void main(String[] args) {
        estoque controle = new estoque();
        controle.cadastrarProduto(true,21,"Limpo",12.50f,2);
        controle.listarProdutos();
        controle.setQuantidadeProduto(2, 30);
        controle.listarProdutos();
    }
}
  