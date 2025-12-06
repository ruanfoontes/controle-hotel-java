import java.util.ArrayList;
import java.util.Scanner;

public class SistemaHotel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Hotel> hoteis = new ArrayList<>();
        int opcao = 0;

        while (opcao != 6) {
            System.out.println("\n---- SISTEMA DE HOTEL ----");
            System.out.println(" 1 - Cadastrar Hotel");
            System.out.println(" 2 - Listar Hotéis");
            System.out.println(" 3 - Buscar Hotel por ID");
            System.out.println(" 4 - Atualizar Hotel");
            System.out.println(" 5 - Remover Hotel");
            System.out.println(" 6 - Sair");
            System.out.print("Digite uma opção: "); 

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o ID do hotel: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Digite o nome do hotel: ");
                    String nome = scanner.nextLine();

                    System.out.print("Digite a cidade do hotel: ");
                    String cidade = scanner.nextLine();

                    Hotel novoHotel = new Hotel(id, nome, cidade);
                    hoteis.add(novoHotel);

                    System.out.println("Hotel cadastrado com sucesso!");
                    break;

                case 2:
                    if (hoteis.isEmpty()) {  //hoteis.isempty() verifica se a lista está vazia
                        System.out.println("Nenhum hotel cadastrado.");                   
                    } else {
                        System.out.println("\n--- LISTAS DE HOTÉIS ---");
                        for (Hotel h : hoteis) {
                            System.out.println(h.toString());
                        }
                    }
                    break;

                case 3:
                    System.out.print("Digite o ID do hotel que deseja buscar: ");
                    int idBusca = scanner.nextInt();
                    scanner.nextLine();

                    boolean encontrado = false;

                    for (Hotel h : hoteis) {
                        if (h.getID() == idBusca) {
                            System.out.println("Hotel encontrado:");
                            System.out.println(h.toString());
                            encontrado = true;
                            break;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("Nenhum hotel encontrado com esse ID.");
                    }
                    break;

                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    System.out.println("Saindo do Sistema...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            } // fim do switch
        } // fim do while
    } // fim do main
} // fim da classe
