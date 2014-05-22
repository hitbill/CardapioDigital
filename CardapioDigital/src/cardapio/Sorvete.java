/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cardapio;
import java.util.ArrayList;

/**
 *
 * @author Paulo
 */
public class Sorvete extends Item{
    private Sabor sabor;
    
    
    public Sorvete(){
        sabor = new Sabor(null);
    }
    
    public void setSorveteSabor(String sabor){
        this.sabor.SetSaborName(sabor); 
    }

    public Sabor getSabor() {
        return sabor;
    }
    
  public String print(){
        return getItemName()+ " sabor " + sabor.GetSaborName() + " | Preço: " + getPreco();
    }

 
}
