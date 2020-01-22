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
class user {
    private int ID;
    private int AGE;
private String FIRST_NAME,LAST_NAME,CONTACT_NO,GENDER,ADDRESS;

public user(int ID,String FIRST_NAME,String LAST_NAME,String GENDER,int AGE,String ADDRESS,String CONTACT_NO)
{
this.ID=ID;
this.FIRST_NAME=FIRST_NAME;
this.LAST_NAME=LAST_NAME;
this.GENDER=GENDER;
this.AGE=AGE;
this.ADDRESS=ADDRESS;
this.CONTACT_NO=CONTACT_NO;
}

    user(int aInt, String string, String string0, String string1, int aInt0, String string2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
public int getID(){
    return ID;
}
public String getFIRST_NAME(){
return FIRST_NAME;
}
public String getLAST_NAME(){
return LAST_NAME;
}
public String getGENDER(){
return GENDER;
}
public int getAGE(){
return AGE;
}
public String getADDRESS(){
    return ADDRESS;
    }
public String getCONTACT_NO(){
    return CONTACT_NO;
}   
}
