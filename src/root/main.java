/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package root;

import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon;
import java.util.Arrays;

/**
 *
 * @author VULEMBERE
 */
public class main  {
     
    public static void main(String[] args) {
 
//    System.out.println(FontAwesomeIcon.ADDRESS_BOOK);  
    
        FontAwesomeIcon[] fonct =  FontAwesomeIcon.values();
        
        for (FontAwesomeIcon fontAwesomeIcon : fonct) {
             System.out.println(fontAwesomeIcon);
        }
       
    }
    
}
