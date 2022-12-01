import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Boolean menu = true;
        Scanner input = new Scanner(System.in);
        Fornecedores fornecedores = new Fornecedores();
        Estoque controle = new Estoque();
        fornecedores.cadastrarFornecedor("Mercado Livre");
        fornecedores.getFornecedor("Mercado Livre");


        while(menu == true){
            System.out.println("\nSistema de estoque da loja");
            System.out.println("1 - Listar produtos\n2 - Listar Fornecedores\n3 - Cadastrar produtos\n4 - Cadastrar fornecedores\n5 - Modificar quantidade do produto no estoque\n6 - Remover produto\n7 - Remover fornecedor\n0 - Fechar Programa");
            System.out.println("Escolha o numero da operação a ser realizada:");
            int numMenuControle = input.nextInt();
            
            if(numMenuControle == 0){
                menu = false;
                continue;
            }
            if(numMenuControle == 1){
                System.out.println("\nProdutos:\n");
                controle.listarProdutos();
            }
            if(numMenuControle == 2){
                System.out.println("\nFornecedores:\n");
                fornecedores.listarFornecedores();
            }
            if(numMenuControle == 3){
                System.out.println("\nCadastro de fornedor\n");
                System.out.println("Tipo de produto a ser cadastrado:\n1 - Vendido por Unidade\n2 - Vendido por Peso ");
                input.nextLine();
                int inputTipoProduto = input.nextInt();
                Boolean tipoProduto = controle.tipoProduto(inputTipoProduto);
                System.out.println("Codigo do produto: ");
                input.nextLine();
                int CodigoProduto = input.nextInt();
                System.out.println("Nome do produto:");
                input.nextLine();
                String nomeProduto = input.nextLine();
                System.out.println("Nome do fornecedor:");
                String inputFornecedor = input.nextLine();
                fornecedores.buscarFornecedor(inputFornecedor);
                System.out.println("Preço do produto: ");
                input.nextLine();
                Float preçoProduto = input.nextFloat();
                System.out.println("Quantidade do produto no estoque: ");
                input.nextLine();
                int quantidadeProduto = input.nextInt();
                controle.cadastrarProduto(tipoProduto,CodigoProduto,nomeProduto,inputFornecedor,preçoProduto,quantidadeProduto); 
            }
            if(numMenuControle == 4){
                System.out.println("\nCadastro de fornedor\n");
                System.out.println("Nome do fornecedor para ser cadastrado: ");
                input.nextLine();
                String nomeCadastroFornecedor = input.nextLine();
                fornecedores.cadastrarFornecedor(nomeCadastroFornecedor);
            }
            if(numMenuControle == 5){
                System.out.println("\nAtualizar quantidade do Produto em estoque\n");
                System.out.println("Codigo do produto a ser modificado: ");
                input.nextLine();
                int CodigoProduto = input.nextInt();
                System.out.println("Nova quantidade do produto no estoque: ");
                input.nextLine();
                int novaQuantidade = input.nextInt();
                controle.setQuantidadeProduto(CodigoProduto, novaQuantidade);
            }
            if(numMenuControle == 6){
                System.out.println("\nRemover Produto\n");
                System.out.println("Codigo do produto a ser removido: ");
                input.nextLine();
                int CodigoProduto = input.nextInt();
                controle.excluirProduto(CodigoProduto);
            }
            if(numMenuControle == 7){
                System.out.println("\nRemover fornecedor\n");
                System.out.println("Nome do fornecedor a ser removido: ");
                input.nextLine();
                String nomeCadastroFornecedor = input.nextLine();
                fornecedores.excluirFornecedor(nomeCadastroFornecedor);
            }
             
        }
        input.close();
        return;
    }
}