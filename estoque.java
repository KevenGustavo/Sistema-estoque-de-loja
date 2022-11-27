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
    public void addProduto(){}
    public void venderProduto(){}
    public void excluirProduto(){}
    public void buscarProduto(){}
}
