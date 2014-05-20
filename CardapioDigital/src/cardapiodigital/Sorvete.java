package cardapiodigital;

public class Sorvete extends Item {
    private Sabor saborSorvete;

    public Sorvete(String nome, float preco, boolean adicionavel, Sabor sabor) {
        super(nome, preco, adicionavel);
        saborSorvete = sabor;
    }

    public Sorvete( String nome, float preco, Sabor sabor) {
        super(nome, preco);
        saborSorvete = sabor;
    }

    public String getSabor() {
        return saborSorvete.getSabor();
    }
    public void setSabor(Sabor sabor) {
        saborSorvete = sabor;
    }
}
