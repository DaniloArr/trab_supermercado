import java.util.Scanner;

public class Gerente {
    public String nome;
    private int quantidade;

    Scanner sc = new Scanner(System.in);

public int addProduto(int quantidade){
    return this.quantidade += quantidade;



}
public void relatorioVendas(){

}

public void relatorioEstoque(){

}

public void menuGerente(){
    System.out.println("\n\n## Sistema de controle Supermercado ##");
    System.out.println();

    System.out.println("  ------------------------------");
    System.out.println(" |     1 - ADD PRODUTO          |");
    System.out.println(" |     2 - RELATORIO VENDAS     |");
    System.out.println(" |     3 - RELATORIO ESTOQUE    |");
    System.out.println(" |     0 - SAIR                 |");
    System.out.println("  ------------------------------");

    System.out.print("Digite opção desejada: ");
    int opcaoGerente = sc.nextInt();
    System.out.printf("Opção Escolhida: %d", opcaoGerente);
    System.out.println();

    switch (opcaoGerente) {
        case 1:
            System.out.printf("Digite a quantidade do produto: ");
            quantidade = sc.nextInt();
            addProduto(quantidade);
            System.out.printf(" " + this.quantidade);
            break;
        case 2:
            relatorioVendas();
            break;
        case 3:
            relatorioEstoque();
            break;
        case 0:
            break;
        default:
            System.err.println("Opção Inválida! ");
            break;
        }


    }
}
