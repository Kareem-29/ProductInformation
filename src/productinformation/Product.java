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
public class Product {
    private int prodID;
    private String prodName;
    private double price;
    
    public Product(int prodID, String prodName, double price){
        this.prodID = prodID;
        this.prodName = prodName;
        this.price = price;
    
    }
    
    public int getProdID(){
        return prodID;
    }
    
    public void setProdID(int prodID){
        this.prodID = prodID;
    }
    
    public String getProdName(){
        return prodName;
    }
    
    public void setProdName(String prodName){
        this.prodName = prodName;
    }
    
    public double getPrice(){
        return price;
    }
    
    public void setPrice(double price){
        this.price = price;
    }
    
    @Override
    public String toString(){
        return prodID + "\t" + prodName + "\t" + price;
    
    }
    
}
