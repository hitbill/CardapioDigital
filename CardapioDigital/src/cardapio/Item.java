package cardapio;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Paulo
 */
public class Item extends Comercializavel{
    private String nome;
    private boolean adicionavel;
    
    
    public Item(){
        nome = "Sem nome";
        setTamanhoName("Único");
        setPreco(0);
    }
    public Item(String nome, String tamanho, float preco){
        this.nome = nome;
        setTamanhoName(tamanho);
        setPreco(preco);
    }
    public Item(String nome, float preco){
        this.nome = nome;
        setTamanhoName("Único");
        setPreco(preco);
    }
    public String getItemName(){
        return nome;
    }
    
    public void setItemName(String nome){
        this.nome = nome;
    }
    
    public String print(){
    
        return nome+" | Tamanho: "+getTamanhoName()+" | Preço: R$ "+getPreco();
    }
    
}
