/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package productinformation;

/**
 *
 * @author Kareem_29
 */
public class ProductInformation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Product prod1 = new Product(111, "Orange", 12);
       Product prod2 = new Product(222, "Apple", 25);
       Product prod3 = new Product(333, "Banana", 10);
       Product prod4 = new Product(444, "Pineapple", 20);
       Product prod5 = new Product(555, "Watermelon", 30);
    
    
      ProductList prodList = new ProductList();
      
      prodList.addProd(prod1);
      prodList.addProd(prod2);
      prodList.addProd(prod3);
      prodList.addProd(prod4);
      prodList.addProd(prod5);
      
      System.out.println(prodList);
      
      System.out.println(prodList.searchProd(333).toString());
      
      prodList.displayProdList();
    }
    
    
    
}
