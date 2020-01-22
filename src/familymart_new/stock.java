/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package familymart_new;

/**
 *
 * @author SHASHANK K SHUKLA
 */
class stock {

    private int ID;
    private String product_code;
    private String product_name;
    private String price;
    private int quantity;
    private String category;
public stock(int ID,String product_code,String product_name,String price,int quantity,String category)
{
this.ID=ID;
this.product_code=product_code;
this.product_name=product_name;
this.price=price;
this.quantity=quantity;
this.category=category;
}
stock(int aInt, String string, String string0, String string1, int aInt0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
public int getID(){
    return ID;
}
public String getproduct_code(){
return product_code;
}
public String getproduct_name(){
return product_name;
}
public String getprice(){
return price;
}
public int getquantity(){
return quantity;
}
public String getcategory(){
    return category;
}
}
    
    
 
    

