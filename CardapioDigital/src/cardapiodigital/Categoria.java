package cardapiodigital;

public class Categoria {
    private String categoria;
    private Sabor sabor;
    
    public Categoria(){
        sabor = new Sabor();
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Sabor getSabor() {
        return sabor;
    }

    public void setSabor(Sabor sabor) {
        this.sabor = sabor;
    }
    
    public String getStrSabor(){
        return sabor.getSabor();
    }

}
