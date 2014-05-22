/*
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
    private ArrayList<Sabor> listaSabor = new ArrayList();
    
    public void addSabor(Sabor sabor){
        listaSabor.add(sabor);
    }

 
}
