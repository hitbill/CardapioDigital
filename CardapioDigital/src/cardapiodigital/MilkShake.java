package cardapiodigital;

public class MilkShake extends Item{
    private Categoria categoria;
    private Tamanho tamanho;

    public MilkShake(String nome, float preco, boolean adicionavel, Categoria categoria, Sabor sabor, Tamanho tamanho) {
        super(nome, preco, adicionavel);
        this.categoria = categoria;
        this.categoria.setSabor(sabor);
        this.tamanho = tamanho;
    }

    public MilkShake(String nome, float preco, Categoria categoria, Sabor sabor, Tamanho tamanho) {
        super(nome, preco);
        this.categoria = categoria;
        this.categoria.setSabor(sabor);
        this.tamanho = tamanho;
    }

    public Sabor getSabor(){
        return categoria.getSabor();
    }
    
    public void setSabor(Sabor sabor){
        categoria.setSabor(sabor);
    }
    public String getCategoria() {
        return categoria.getCategoria();
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Tamanho getTamanho() {
        return tamanho;
    }

    public void setTamanho(Tamanho tamanho) {
        this.tamanho = tamanho;
    }
    
    public String printSabor(){
        return categoria.getStrSabor();
    }

}
