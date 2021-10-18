import java.io.Console;
import java.util.Locale;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int opcao = 0;

        do {
            System.out.println("\n\n## Sistema de controle Supermercado ##");
            System.out.println();

            System.out.println("  ----------------------");
            System.out.println(" |     1 - GERENTE      |");
            System.out.println(" |     2 - VENDEDOR     |");
            System.out.println(" |     0 - SAIR         |");
            System.out.println("  ----------------------");

            System.out.println("Digite opção desejada: ");
            opcao = sc.nextInt();
            System.out.printf("Opção Escolhida: %d",opcao);
            System.out.println();

            switch (opcao) {
                case 1:
                    //chamar funcao gerente
                    break;
                case 2:
                    //chamar funcao funcionario
                    break;
                case 0:
                    //finalizar programa
                    break;

                default:
                    System.err.println("Opção Inválida! ");
                    break;
            }
        }while (opcao != 0);
    }
}
