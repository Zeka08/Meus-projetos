
import java.util.Scanner;

public class Main{
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

    int opcao;
    do {
        System.out.println("Selecione uma opção:");
        System.out.println("1 - Registrar novo animal");
        System.out.println("2 - Calcular quantidade de comida para animal existente");
        System.out.println("0 - Sair");

        opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                registrarNovoAnimal(scanner);
                break;
            case 2:
                calcularQuantidadeComida(scanner);
                break;
            case 0:
                System.out.println("Saindo do programa...");
                break;
            default:
                System.out.println("Opção invalida. Por favor, tente");
                break;
        }
    } while (opcao != 0);
    scanner.close();
 }
 private static void registrarNovoAnimal(Scanner scanner) {
     System.out.println("Digite o nome do animal:");
     String nome = scanner.nextLine();
     nome = scanner.nextLine();

     System.out.println("Digite a raca do animal:");
     String raca = scanner.nextLine();

     System.out.println("Digite o peso do animal:");
     double peso = scanner.nextDouble();

     System.out.println("Digite a idade do animal:");
     int idade = scanner.nextInt();

     Animal animal = new Animal(nome, raca, peso, idade);
     System.out.print("Animal registrado com sucesso ");
     animal.exibirInfo();
 }
 private static void calcularQuantidadeComida(Scanner scanner){
  System.out.println("Digite o nome do animal:");
  String nome = scanner.nextLine();
  nome = scanner.nextLine();

  System.out.println("Digite a raca do animal:");
  String raca = scanner.nextLine();

  System.out.println("Digite o peso do animal:");
  double peso = scanner.nextDouble();

  System.out.println("Digite a idade do animal:");
  int idade = scanner.nextInt();

  Animal animal = new Animal(nome, raca, peso, idade);

  System.out.println("Informações do animal:");
  animal.exibirInfo();

  double quantidadedeComida = ControleAnimal.calcularQuantidadeComida(animal);
  System.out.println("Quantidade recomendada de comida por dia: " + quantidadedeComida + "g");
 }
}





