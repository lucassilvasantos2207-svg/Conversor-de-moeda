import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {

            System.out.println("\n=================================");
            System.out.println("      CONVERSOR DE MOEDAS");
            System.out.println("=================================");
            System.out.println("1 - Real -> Dólar");
            System.out.println("2 - Real -> Euro");
            System.out.println("3 - Real -> Libra");
            System.out.println("4 - Dólar -> Real");
            System.out.println("5 - Euro -> Real");
            System.out.println("6 - Libra -> Real");
            System.out.println("7 - Real -> Peso Argentino");
            System.out.println("8 - Peso Argentino -> Real");
            System.out.println("9 - Outros");
            System.out.println("0 - Sair");

            opcao = scanner.nextInt();

            switch (opcao) {

                case 1:
                    System.out.print("\nDigite o valor em reais: R$ ");
                    double reais = scanner.nextDouble();

                    double dolar = reais / 5.15;

                    System.out.println("\n=================================");
                    System.out.println("          RESULTADO");
                    System.out.println("=================================");
                    System.out.printf("R$ %.2f equivalem a US$ %.2f%n", reais, dolar);
                    System.out.println("=================================\n");
                    break;

                case 2:
                    System.out.print("\nDigite o valor em reais: R$ ");
                    reais = scanner.nextDouble();

                    double euro = reais / 6.10;

                    System.out.println("\n=================================");
                    System.out.println("          RESULTADO");
                    System.out.println("=================================");
                    System.out.printf("R$ %.2f equivalem a € %.2f%n", reais, euro);
                    System.out.println("=================================\n");
                    break;

                case 3:
                    System.out.print("\nDigite o valor em reais: R$ ");
                    reais = scanner.nextDouble();

                    double libra = reais / 7.00;

                    System.out.println("\n=================================");
                    System.out.println("          RESULTADO");
                    System.out.println("=================================");
                    System.out.printf("R$ %.2f equivalem a £ %.2f%n", reais, libra);
                    System.out.println("=================================\n");
                    break;

                case 4:
                    System.out.print("\nDigite o valor em dólares: US$ ");
                    dolar = scanner.nextDouble();

                    reais = dolar * 5.15;

                    System.out.println("\n=================================");
                    System.out.println("          RESULTADO");
                    System.out.println("=================================");
                    System.out.printf("US$ %.2f equivalem a R$ %.2f%n", dolar, reais);
                    System.out.println("=================================\n");
                    break;

                case 5:
                    System.out.print("\nDigite o valor em euros: € ");
                    euro = scanner.nextDouble();

                    reais = euro * 6.10;

                    System.out.println("\n=================================");
                    System.out.println("          RESULTADO");
                    System.out.println("=================================");
                    System.out.printf("€ %.2f equivalem a R$ %.2f%n", euro, reais);
                    System.out.println("=================================\n");
                    break;

                case 6:
                    System.out.print("\nDigite o valor em libras: £ ");
                    libra = scanner.nextDouble();

                    reais = libra * 7.00;

                    System.out.println("\n=================================");
                    System.out.println("          RESULTADO");
                    System.out.println("=================================");
                    System.out.printf("£ %.2f equivalem a R$ %.2f%n", libra, reais);
                    System.out.println("=================================\n");
                    break;

                case 7:
                    System.out.print("\nDigite o valor em reais: R$ ");
                    reais = scanner.nextDouble();

                    double peso = reais * 190;

                    System.out.println("\n=================================");
                    System.out.println("          RESULTADO");
                    System.out.println("=================================");
                    System.out.printf("R$ %.2f equivalem a ARS %.2f%n", reais, peso);
                    System.out.println("=================================\n");
                    break;

                case 8:
                    System.out.print("\nDigite o valor em pesos argentinos: ARS ");
                    peso = scanner.nextDouble();

                    reais = peso / 190;

                    System.out.println("\n=================================");
                    System.out.println("          RESULTADO");
                    System.out.println("=================================");
                    System.out.printf("ARS %.2f equivalem a R$ %.2f%n", peso, reais);
                    System.out.println("=================================\n");
                    break;

                   case 9:

     
                   String[] moedas = {
                    "BRL - Real Brasileiro",
                    "USD - Dólar Americano",
                    "EUR - Euro",
                    "GBP - Libra Esterlina",
                    "ARS - Peso Argentino",
                    "JPY - Iene Japonês",
                    "CHF - Franco Suíço",
                    "CAD - Dólar Canadense",
                    "AUD - Dólar Australiano",
                    "CNY - Yuan Chinês",
                    "MXN - Peso Mexicano",
                    "CLP - Peso Chileno",
                    "UYU - Peso Uruguaio",
                    "KRW - Won Sul-Coreano",
                    "INR - Rupia Indiana",
                    "SEK - Coroa Sueca",
                    "NOK - Coroa Norueguesa",
                    "DKK - Coroa Dinamarquesa",
                    "SGD - Dólar de Singapura",
                    "HKD - Dólar de Hong Kong"
   
                };

    
                double[] cotacoes = {
    
                    1.00, 5.15, 6.10, 7.00, 0.0053,
                    0.036, 6.40, 3.75, 3.30, 0.72,
                    0.29, 0.0055, 0.12, 0.0037, 0.061,
                    0.54, 0.48, 0.82, 3.85, 0.66
   
                };

   
                System.out.println("\n╔══════════════════════════════════════╗");
                System.out.println("║          CONVERSÃO AVANÇADA         ║");
                System.out.println("╚══════════════════════════════════════╝");

   
                for (int i = 0; i < moedas.length; i++) {
                    System.out.printf("%2d - %-30s%n", i + 1, moedas[i]);
   
                }

   
                System.out.println("\n══════════════════════════════════════");
                System.out.print("Escolha a moeda de origem: ");
                int origem = scanner.nextInt();
                System.out.print("Escolha a moeda de destino: ");
                int destino = scanner.nextInt();
                if (origem < 1 || origem > moedas.length ||
                    destino < 1 || destino > moedas.length) {
                        System.out.println("\n❌ Opção inválida!");
                        break;
    
                    }

    
                    System.out.print("Digite o valor: ");
                    double valor = scanner.nextDouble();
                    double valorEmReais = valor * cotacoes[origem - 1];
                    double resultado = valorEmReais / cotacoes[destino - 1];
                    System.out.println("\n╔══════════════════════════════════════╗");
                    System.out.println("║              RESULTADO              ║");
                    System.out.println("╚══════════════════════════════════════╝");
                    System.out.printf("Moeda origem : %s%n", moedas[origem - 1]);
                    System.out.printf("Moeda destino: %s%n", moedas[destino - 1]);
                    System.out.println("--------------------------------------");
                    System.out.printf("Valor informado : %.2f%n", valor);
                    System.out.printf("Valor convertido: %.2f%n", resultado);
                    System.out.println("══════════════════════════════════════\n");
                    break;     
                    case 0:
                    System.out.println("\nSaindo do programa...");
                    break;
                default:
                    System.out.println("\nOpção inválida! Tente novamente.");
                    break;
                }
            } while (opcao != 0);
            scanner.close();
        }
    }