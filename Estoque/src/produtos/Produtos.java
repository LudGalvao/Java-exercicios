package produtos;

public class Produtos {
    private String nome;
    private double preco;
    private int quantidade;

    // construtor
    public Produtos(){
    }

    // construtor
    public Produtos(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    // construtor
    public Produtos(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getPreco(){
        return preco;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public int getQuantidade(){
        return quantidade;
    }

    public double valorTotalEmEstoque(){
        return preco * quantidade;
    }

    @Override
    public String toString(){
        return "Produto [nome = " + nome + ", preço unidade = " + String.format("%.2f", preco) + " Quantidade = " + quantidade + " Total = " + String.format("%.2f", valorTotalEmEstoque()) + "]";
    }
}
