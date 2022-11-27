public class Main{
    public static void main(String[] args) {
        estoque controle = new estoque();
        controle.cadastrarProduto(true,21,"Limpo",10,2);
        System.out.println(controle.deposito.get(0).nome);
    }
}
  