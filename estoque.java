import java.util.ArrayList;
import java.util.List;

public class estoque {
    List<produto> deposito = new ArrayList<produto>();
    
    public void cadastrarProduto(boolean tipo, int codigo, String nome, float preço, int quantidade){
        if(tipo){
            porPeso produtoPeso = new porPeso(codigo, nome, preço, quantidade);
            this.deposito.add(produtoPeso);
        }else{
            porUnidade produtoUnitario = new porUnidade(codigo, nome, preço, quantidade);
            this.deposito.add(produtoUnitario);
        }
    }
    public void listarProdutos(){
        for(int num = 0; num < this.deposito.size(); num++){
            int codigo = this.deposito.get(num).getCodigo();
            String nome = this.deposito.get(num).getNome();
            float preço = this.deposito.get(num).getPreço();
            int quantidade = this.deposito.get(num).getQuantidade();
            System.out.printf("\nCodigo: %d\nNome: %s\nPreço: %4.2f\nQuantidade: %d\n", codigo, nome, preço, quantidade);
        }
    }
    public void addProduto(){}
    public void venderProduto(){}
    public void excluirProduto(){}
    public void buscarProduto(){}
}
