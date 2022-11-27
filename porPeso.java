public class porPeso extends produto{
    float preçoPorKg;
    int quantidadeTotal;
    
    public porPeso(int codigo, String nome,String fornecedor, float preço, int quantidade){
        this.setCodigo(codigo);
        this.setNome(nome);
        this.setFornecedor(fornecedor);
        this.setPreço(preço);
        this.setQuantidade(quantidade);
    } 
    public float getPreço(){
        return this.preçoPorKg;
    }
    public void setPreço(float preço){
        this.preçoPorKg = preço;
    }
    public int getQuantidade(){
        return this.quantidadeTotal;
    }
    public void setQuantidade(int quantidade){
        this.quantidadeTotal = quantidade;
    }
}
