package classes;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        Loja loja = null;
        Produto produto = null;

        do {
            System.out.println("(1) Criar uma loja");
            System.out.println("(2) Criar um produto");
            System.out.println("(3) Sair");
            System.out.print("Escolha uma opção: ");
            
            try {
                opcao = scanner.nextInt();
                scanner.nextLine(); 

                switch (opcao) {
                    case 1:
                       
                        System.out.print("Digite o nome da loja: ");
                        String nomeLoja = scanner.nextLine();

                        System.out.print("Digite a quantidade de funcionários: ");
                        int quantidadeFuncionarios = scanner.nextInt();

                        System.out.print("Digite o salário base dos funcionários: ");
                        double salarioBase = scanner.nextDouble();
                        scanner.nextLine(); 
                        System.out.print("Digite o nome da rua: ");
                        String nomeRua = scanner.nextLine();

                        System.out.print("Digite a cidade: ");
                        String cidade = scanner.nextLine();

                        System.out.print("Digite o estado: ");
                        String estado = scanner.nextLine();

                        System.out.print("Digite o país: ");
                        String pais = scanner.nextLine();

                        System.out.print("Digite o CEP: ");
                        String cep = scanner.nextLine();

                        System.out.print("Digite o número: ");
                        String numero = scanner.nextLine();

                        System.out.print("Digite o complemento: ");
                        String complemento = scanner.nextLine();

                        System.out.print("Digite o dia de fundação: ");
                        int diaFundacao = scanner.nextInt();

                        System.out.print("Digite o mês de fundação: ");
                        int mesFundacao = scanner.nextInt();

                        System.out.print("Digite o ano de fundação: ");
                        int anoFundacao = scanner.nextInt();

                        System.out.print("Digite o tamanho do estoque: ");
                        int tamanhoEstoque = scanner.nextInt();

                        Data dataFundacao = new Data(diaFundacao, mesFundacao, anoFundacao);
                        Endereco enderecoLoja = new Endereco(nomeRua, cidade, estado, pais, cep, numero, complemento);
                        loja = new Loja(nomeLoja, quantidadeFuncionarios, salarioBase, enderecoLoja, dataFundacao, tamanhoEstoque);

                        break;

                    case 2:
                       
                        System.out.print("Digite o nome do produto: ");
                        String nomeProduto = scanner.nextLine();

                        System.out.print("Digite o preço do produto: ");
                        double precoProduto = scanner.nextDouble();
                        scanner.nextLine(); 

                        System.out.print("Digite o dia de validade: ");
                        int diaValidade = scanner.nextInt();

                        System.out.print("Digite o mês de validade: ");
                        int mesValidade = scanner.nextInt();

                        System.out.print("Digite o ano de validade: ");
                        int anoValidade = scanner.nextInt();
                        scanner.nextLine(); 

                        Data dataValidadeProduto = new Data(diaValidade, mesValidade, anoValidade);
                        produto = new Produto(nomeProduto, precoProduto, dataValidadeProduto);

                        break;

                    case 3:
                        // Sair
                        break;

                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                        continue;
                }

                if (loja != null && produto != null) {
                   
                    System.out.println("Informações da Loja:");
                    System.out.println(loja);

                  
                    Data dataVerificar = new Data(20, 10, 2023);
                    if (produto.estaVencido(dataVerificar)) {
                        System.out.println("PRODUTO VENCIDO");
                    } else {
                        System.out.println("PRODUTO NÃO VENCIDO");
                    }

                   
                    System.out.println("\nInformações do Produto:");
                    System.out.println(produto);

                    
                    break;
                }

            } catch (java.util.InputMismatchException e) {
                System.out.println("Entrada inválida. Tente novamente.");
                scanner.nextLine(); 
            }

        } while (opcao != 3);

        scanner.close();
    }
}