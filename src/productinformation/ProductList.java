/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package productinformation;

import java.util.ArrayList;

/**
 *
 * @author Kareem_29
 */
public class ProductList {
    
    private ArrayList<Product> prodList;
    
    public ProductList(){
    prodList = new ArrayList<>();
    }
    
    public void addProd(Product prod){
    prodList.add(prod);
    }
    
    public Product searchProd(int prodID){
        
        Product result = null;
        for(Product p : prodList){
            if(p.getProdID() == prodID){
                result = p;
                break;
            }
        }
        return result;
    }
    
    @Override
    public String toString() {
        return "ProductList\n" + prodList + '\n';
    }
    
    public void displayProdList(){
    
        System.out.println("ID \t NAME \t PRICE");
        for(Product p: prodList){
        System.out.println(p.toString());
        }
    }

    
    
}
