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
public abstract class Comercializavel {
    
   private String tamanho;
   private float preco;
   
   public void setTamanhoName(String tamanho){
       this.tamanho = tamanho; 
   }
   public String getTamanhoName(){
       return tamanho;
   }
   public void setPreco(float preco){
       this.preco = preco;
   }
   public float getPreco(){
       return preco;
   }
   
   public abstract String print();
    
}
