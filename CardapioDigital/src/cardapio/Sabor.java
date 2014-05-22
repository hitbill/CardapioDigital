/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cardapio;

/**
 *
 * @author Paulo
 */
public class Sabor {
    private String nome;
    
    public Sabor(String nome){
        SetSaborName(nome);
    }
    
    public String GetSaborName(){
        return nome;
    }
    
    public void SetSaborName(String nome){
        this.nome = nome;
    }
    
    public String print(){
    
        return nome;
    }
    
}
