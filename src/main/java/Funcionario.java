public class Funcionario implements IOperacoesDoEstoque {
    private String nome;
    private String userName;
    private String senha;

    public Funcionario(String nome, String userName, String senha) {
        this.nome = nome;
        this.userName = userName;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public void adicionarProduto(Produto produto, double quantidade) {
        Estoque.adicionarProduto(produto, quantidade);
    }

    @Override
    public void removerProduto(String codigo, double quantidade) {
        Estoque.removerProduto(codigo, quantidade);
    }

    @Override
    public void mostrarEstoque() {
        Estoque.mostrarEstoque(1);
    }

}






