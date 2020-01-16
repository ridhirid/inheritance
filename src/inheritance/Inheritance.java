/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author ridhi
 */
public class Inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //circle one =new circle()   not to use now
         cyclinder cy1=new cyclinder();
         cy1.radius=2.5;
         cy1.height=5.5;
         System.out.println(cy1.toString()); 
         System.out.println("height of cyclinder :"+cy1.height);
         System.out.println("area of cyclinder :"+cy1.areaCyclinder());
         
    }
    
}
