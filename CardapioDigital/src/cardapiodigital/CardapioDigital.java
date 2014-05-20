package cardapiodigital;

public class CardapioDigital {

    public static void main(String[] args) {
        
        Tamanho tam = new Tamanho();
        Categoria categ = new Categoria();
        categ.setCategoria("Diversos");
        Sabor sab =  new Sabor();
        Sabor sab2 =  new Sabor();
        sab.setSabor("Creme");
        sab2.setSabor("Baunilia");
        categ.setSabor(sab);
        
        Sorvete sorvete = new Sorvete("Sorvete Bola", 2, sab);
        MilkShake mk = new MilkShake("Milk Shake", 0, categ, sab, tam);
        mk.setSabor(sab2);

        System.out.println(mk.printSabor());

    }
    
}
