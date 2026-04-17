/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication29;

/**
 *
 * @author user
 */
public class JavaApplication29 {

    
    public static void main(String[] args) {
        String s="sifa";
        String rev="";
        //String s1="sana";
        for (int i = s.length()-1; i >= 0; i--) {
            rev=rev+ s.charAt(i);
            
            
        }
 System.out.println(rev);
    }
    
}
