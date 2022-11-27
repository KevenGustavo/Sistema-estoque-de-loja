public class porUnidade extends produto{
    float preçoPorUnidade;
    int quantidadeUnidades; 
    
    public porUnidade(int codigo, String nome, float preço, int quantidade){
        this.setCodigo(codigo);
        this.setNome(nome);
        this.setPreço(preço);
        this.setQuantidade(quantidade);
    } 
    public float getPreço(){
        return this.preçoPorUnidade;
    }
    public void setPreço(float preço){
        this.preçoPorUnidade = preço;
    }
    public int getQuantidade(){
        return this.quantidadeUnidades;
    }
    public void setQuantidade(int quantidade){
        this.quantidadeUnidades = quantidade;
    }

}