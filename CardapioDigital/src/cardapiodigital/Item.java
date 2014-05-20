package cardapiodigital;

public class Item {
    private String nome;
    private int codigo;
    private float preco;
    private int quantidade;
    private boolean adicionavel;

    public Item(){
        nome = "Item";
        codigo = 0;
        preco = 0;
        quantidade = 0;
        adicionavel = false;        
    }
    
    public Item(String nome, float preco, boolean adicionavel) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = 0;
        this.adicionavel = adicionavel;
        codigo = 0;
    }
    
    public Item(String nome, float preco) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = 0;
        this.adicionavel = false;
        codigo = 0;
    }
    
    public String getNome() {
        return nome;
    }
    public int getCodigo() {
        return codigo;
    }
    public float getPreco() {
        return preco;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public boolean isAdicionavel() {
        return adicionavel;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public void setPreco(float preco) {
        this.preco = preco;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public void setAdicionavel(boolean adicionavel) {
        this.adicionavel = adicionavel;
    }
    
    
    
}
