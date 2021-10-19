import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);
    public int opcao = 0;

    public void menuInicial() {

            System.out.println("\n\n## Sistema de controle Supermercado ##");
            System.out.println();

            System.out.println("  ----------------------");
            System.out.println(" |     1 - GERENTE      |");
            System.out.println(" |     2 - VENDEDOR     |");
            System.out.println(" |     0 - SAIR         |");
            System.out.println("  ----------------------");
            System.out.println();
            System.out.print("Digite opção desejada: ");
            opcao = sc.nextInt();
            System.out.printf("Opção Escolhida: %d", opcao);
            System.out.println();

            switch (opcao) {
                case 1:
                    gerente();
                    break;
                case 2:
                    funcionario();
                    break;
                case 0:
                    //finalizar programa
                    break;

                default:
                    System.err.println("Opção Inválida! ");
                    break;
            }
    }

    public void gerente(){
        Gerente geren = new Gerente();
        System.out.println("Você selecionou gerente");
        geren.menuGerente();
    }
    public void funcionario(){
        Funcionario func = new Funcionario("Ana",1);
        System.out.println("Você selecionou funcionario");
        func.menuFuncionario();
    }
//teste
}


