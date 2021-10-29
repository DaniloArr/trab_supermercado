import java.util.Scanner;

public class Utilitario {
    private static Scanner sc = new Scanner(System.in);

    public static void ImprimaMensagem(String mensagem){
        System.out.println("-----------------------------------------------------------------");
        System.out.println(mensagem);
        System.out.println("-----------------------------------------------------------------");
    }

    public static void ImprimaMensagem(String mensagem1, String mensagem2){
        System.out.println("-----------------------------------------------------------------");
        System.out.println(mensagem1);
        System.out.println(mensagem2);
        System.out.println("-----------------------------------------------------------------");
    }

    public static void Continuar(){
        System.out.println();
        System.out.println("Aperte ENTER para continuar ...");
        sc.nextLine();
    }
}
