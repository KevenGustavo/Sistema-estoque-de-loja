import java.util.ArrayList;
import java.util.List;

public class Estoque {
    List<Produto> deposito = new ArrayList<Produto>();
    
    public void cadastrarProduto(boolean tipo, int codigo, String nome, String fornecedor, float preço, int quantidade){
        if(tipo){
            PorPeso produtoPeso = new PorPeso(codigo, nome, fornecedor, preço, quantidade);
            this.deposito.add(produtoPeso);
        }else{
            PorUnidade produtoUnitario = new PorUnidade(codigo, nome, fornecedor, preço, quantidade);
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
        Produto TempObj = this.deposito.get(indexProduto);
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
    public Boolean tipoProduto(int inputTipoProduto){
        if(inputTipoProduto == 1){
            return false;
        }else if(inputTipoProduto == 2){
            return true;
        }
        throw new NullPointerException("Erro ao entrar o tipo do Produto!");
    }
}
    
