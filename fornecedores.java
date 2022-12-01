import java.util.ArrayList;

public class Fornecedores{
    ArrayList<String> fornecedores = new ArrayList<String>();

    public void cadastrarFornecedor(String nome){
        this.fornecedores.add(nome);
    }

    public void listarFornecedores(){
        for(int num = 0; num < this.fornecedores.size(); num++){
            String nomeFornecedor = this.fornecedores.get(num);
            System.out.printf("\nNome: %s\n", nomeFornecedor);
        }
        return;
    }
    public int buscarFornecedor(String nomeFornecedor){
        for(int num = 0; num < this.fornecedores.size(); num++){
            String nomeFornecedorLista = this.fornecedores.get(num);
            if(nomeFornecedorLista.equals(nomeFornecedor)){
                return num;
            }
        }
        throw new NullPointerException("Fornecedor não foi encontrado!");
    }

    public String getFornecedor(String nomeFornecedor){
        int indexFornecedor = this.buscarFornecedor(nomeFornecedor);
        String fornecedorEncontrado = this.fornecedores.get(indexFornecedor);
        return fornecedorEncontrado;
    }

    public void excluirFornecedor(String nomeFornecedor){
        int indexFornecedor = this.buscarFornecedor(nomeFornecedor);
        this.fornecedores.remove(indexFornecedor);
        System.out.println("Fornecedor removido com sucesso!");
        return;
    }
}
