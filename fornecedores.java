import java.util.ArrayList;

public class Fornecedores{
    ArrayList<String> fornecedores = new ArrayList<String>();

    public void cadastrarFornecedor(String nome){
        this.fornecedores.add(nome);
    }

    public void listarProdutos(){
        for(int num = 0; num < this.fornecedores.size(); num++){
            String nomeFornecedor = this.fornecedores.get(num);
            System.out.printf("\nNome: %s\n", nomeFornecedor);
        }
        return;
    }
    public int buscarProduto(String nomeFornecedor){
        for(int num = 0; num < this.fornecedores.size(); num++){
            String nomeFornecedorLista = this.fornecedores.get(num);
            if(nomeFornecedorLista == nomeFornecedor){
                return num;
            }
        }
        throw new NullPointerException("Fornecedor não foi encontrado!");
    }

    public String getFornecedor(String nomeFornecedor){
        int indexFornecedor = this.buscarProduto(nomeFornecedor);
        String fornecedorEncontrado = this.fornecedores.get(indexFornecedor);
        return fornecedorEncontrado;
    }

    public void excluirFornecedor(String nomeFornecedor){
        int indexFornecedor = this.buscarProduto(nomeFornecedor);
        this.fornecedores.remove(indexFornecedor);
        System.out.println("Produto removido com sucesso!");
        return;
    }
}
