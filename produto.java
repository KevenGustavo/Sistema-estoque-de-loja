abstract class produto implements interfaceProduto{
    int codigo;
    String nome;
    String fornecedor; 

    public int getCodigo(){
        return this.codigo;
    }
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getFornecedor(){
        return this.fornecedor;
    }
    public void setFornecedor(String fornecedor){
        this.fornecedor = fornecedor;
    }
}
