/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package java_desafio_1.pkg1_artur_lopes_e_eduardo;

/**
 *
 * @author Aluno
 */
public class Java_desafio_11_artur_lopes_e_eduardo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner entrada = new Scanner(System.in);
        double saldoReais = 100.00;
        double saldoDolar = 0.00;
        final double COTACAO = 5.32;

        
        List<String> extrato = new ArrayList<>();

        boolean rodando = true;

        while (rodando) {
            System.out.println("\n==== CAIXA RÁPIDO ====");
            System.out.println("1 - Saldo");
            System.out.println("2 - Depósito");
            System.out.println("3 - Extrato");
            System.out.println("4 - Simular Empréstimo");
            System.out.println("5 - Comprar Dólar");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            
            int opcao = entrada.nextInt();
            entrada.nextLine();

            switch (opcao) {
                case 1: // Saldo
                    System.out.printf("Saldo em Reais: R$ %.2f\n", saldoReais);
                    if (saldoDolar > 0) {
                        System.out.printf("Saldo em Dólares: US$ %.2f\n", saldoDolar);
                    }
                    rodando = voltarOuSair(entrada);
                    break;

                case 2: // Depósito
                    double deposito = 0;
                    do {
                        System.out.print("Informe o valor do depósito (R$): ");
                        deposito = entrada.nextDouble();
                        entrada.nextLine();
                        if (deposito <= 0 || deposito > 5000) {
                            System.out.println("!!! Valor inválido !!! O depósito deve ser entre R$ 0,01 e R$ 5000,00.");
                        }
                    } while (deposito <= 0 || deposito > 5000);

                    saldoReais += deposito;
                    extrato.add(0, "DEPÓSITO +R$ " + String.format("%.2f", deposito));
                    if (extrato.size() > 10) extrato.remove(10);
                    System.out.println("Depósito realizado com sucesso!");
                    rodando = voltarOuSair(entrada);
                    break;

                case 3: // Extrato
                    if (extrato.isEmpty()) {
                        System.out.println("Nenhum extrato disponível.");
                    } else {
                        System.out.println("Últimas movimentações:");
                        for (int i = 0; i < extrato.size(); i++) {
                            System.out.println((i + 1) + ") " + extrato.get(i));
                        }
                    }
                    rodando = voltarOuSair(entrada);
                    break;

                case 4: // Simular empréstimo
                    System.out.print("Informe o valor do empréstimo (R$): ");
                    double valorEmp = entrada.nextDouble();
                    System.out.print("Informe o seu salário bruto (R$): ");
                    double salario = entrada.nextDouble();
                    System.out.print("Quantidade de parcelas (6,12,18,...72): ");
                    int parcelas = entrada.nextInt();
                    entrada.nextLine();

                    double valorTotal = valorEmp * 1.02; // juros 2%
                    double valorParcela = valorTotal / parcelas;

                    System.out.printf("Valor do empréstimo: R$ %.2f\n", valorEmp);
                    System.out.printf("Valor total com juros: R$ %.2f\n", valorTotal);
                    System.out.printf("Valor da parcela: R$ %.2f x %d\n", valorParcela, parcelas);

                    if (valorParcela <= salario * 0.3) {
                        int protocolo = new Random().nextInt(90000) + 10000;
                        System.out.println("Empréstimo disponível!");
                        System.out.println("Número de protocolo: EM" + protocolo);
                    } else {
                        System.out.println("Empréstimo indisponível! A parcela excede 30% do salário.");
                    }
                    rodando = voltarOuSair(entrada);
                    break;

                case 5: // Comprar dólar
                    System.out.printf("Saldo disponível em Reais: R$ %.2f\n", saldoReais);
                    System.out.print("Quantos dólares deseja comprar (US$)? ");
                    double qtdDolar = entrada.nextDouble();
                    entrada.nextLine();

                    double custo = qtdDolar * COTACAO;

                    if (custo > saldoReais) {
                        System.out.println("Seu saldo é insuficiente.");
                    } else {
                        System.out.printf("Custo em Reais: R$ %.2f\n", custo);
                        System.out.print("Confirmar a compra? (s/n): ");
                        String confirma = entrada.nextLine();
                        if (confirma.equalsIgnoreCase("s")) {
                            saldoReais -= custo;
                            saldoDolar += qtdDolar;
                            extrato.add(0, "COMPRA DÓLAR -R$ " + String.format("%.2f", custo) + " | +US$ " + String.format("%.2f", qtdDolar));
                            if (extrato.size() > 10) extrato.remove(10);
                            System.out.println("Compra realizada com sucesso!");
                        } else {
                            System.out.println("Operação cancelada.");
                        }
                    }
                    rodando = voltarOuSair(entrada);
                    break;

                case 0: // Sair
                    System.out.println("Encerrando o atendimento. Obrigado por utilizar o Caixa Rápido.");
                    rodando = false;
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
        entrada.close();
    }

    private static boolean voltarOuSair(Scanner entrada) {
        System.out.print("Deseja voltar ao menu (V) ou encerrar (E)? ");
        String escolha = entrada.nextLine();
        return escolha.equalsIgnoreCase("V");
    }
}
    
    

