import java.util.ArrayList;
import java.util.List;

public class estoque {
    List<produto> deposito = new ArrayList<produto>();
    
    public void cadastrarProduto(boolean tipo, int codigo, String nome, String fornecedor, float preço, int quantidade){
        if(tipo){
            porPeso produtoPeso = new porPeso(codigo, nome, fornecedor, preço, quantidade);
            this.deposito.add(produtoPeso);
        }else{
            porUnidade produtoUnitario = new porUnidade(codigo, nome, fornecedor, preço, quantidade);
            this.deposito.add(produtoUnitario);
        }
        return;
    }
    public void listarProdutos(){
        for(int num = 0; num < this.deposito.size(); num++){
            int codigo = this.deposito.get(num).getCodigo();
            String nome = this.deposito.get(num).getNome();
            float preço = this.deposito.get(num).getPreço();
            int quantidade = this.deposito.get(num).getQuantidade();
            System.out.printf("\nCodigo: %d\nNome: %s\nPreço: %4.2f\nQuantidade: %d\n", codigo, nome, preço, quantidade);
        }
        return;
    }
    public int buscarProduto(int CodigoProduto){
        for(int num = 0; num < this.deposito.size(); num++){
            int codigoDeposito = this.deposito.get(num).getCodigo();
            if(codigoDeposito == CodigoProduto){
                return num;
            }
        }
        throw new NullPointerException("Produto não foi encontrado!");
    }
    public void setQuantidadeProduto(int CodigoProduto, int newQuantidade){
        int indexProduto = this.buscarProduto(CodigoProduto);
        produto TempObj = this.deposito.get(indexProduto);
        TempObj.setQuantidade(newQuantidade);
        this.deposito.set(indexProduto, TempObj);
        return;
    }
    public void venderProduto(int CodigoProduto, int quantidadeVendida){
        int indexProduto = this.buscarProduto(CodigoProduto);
        int quantidadeAtual = this.deposito.get(indexProduto).getQuantidade();
        int newQuantidade = quantidadeAtual - quantidadeVendida;
        if(newQuantidade < 0){
            System.out.println("A quantidade selecionada ultrapassa a quantidade de produtos disponivel no estoque");
            return;
        }else{
            this.setQuantidadeProduto(CodigoProduto, newQuantidade);
            return;
        }
    }
    public void excluirProduto(int CodigoProduto){
        int indexProduto = this.buscarProduto(CodigoProduto);
        this.deposito.remove(indexProduto);
        System.out.println("Produto removido com sucesso!");
        return;
    }
}
    
