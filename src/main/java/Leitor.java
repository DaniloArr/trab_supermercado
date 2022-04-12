public class Leitor {

    public static void mostrarValorProduto(String codigo){
        Utilitario.ImprimaMensagem("*               Procurando produto de código '" + codigo + "'           *");

        Produto produto = Estoque.seekProduto(codigo);
        if(produto != null) {
            System.out.println("*   Produto: "+ produto.getNome() + "   *\n*   Preço: R$ " + produto.getPreco() + "   *");
        }
        else{
            Utilitario.ImprimaMensagem("*                    Produto não encontrado!                    *");
        }
        System.out.println();
        System.out.println();
        System.out.println("------------------------------------------------------");
    }
}
