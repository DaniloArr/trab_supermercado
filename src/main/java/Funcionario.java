import java.util.Scanner;

public class Funcionario extends Gerente {
    private String nome;
    private int caixa;

    public Funcionario(String nome, int caixa){
        this.nome = nome;
        this.caixa = caixa;
    }

    public void menuFuncionario(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\n## Sistema de controle Supermercado ##");
        System.out.println();

        System.out.println("  ------------------------------");
        System.out.println(" |     1 - VENDER               |"); //Registra caixa, determinando funcionario e valor total
        System.out.println(" |     0 - SAIR                 |");
        System.out.println("  ------------------------------");

        System.out.print("Digite opção desejada: ");
        int opcaoFuncionario = sc.nextInt();
        System.out.printf("Opção Escolhida: %d", opcaoFuncionario);
        System.out.println();

        switch (opcaoFuncionario) {
            case 1:
                vender();
                break;
            case 0:
                break;
            default:
                System.err.println("Opção Inválida! ");
                break;
        }
    }

    public void vender(){

    }
}





