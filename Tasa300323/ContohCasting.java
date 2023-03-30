/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tasa300323;

/**
 *
 * @author maita
 */
public class ContohCasting {
    public static void main(String[] args){
        //char valChar = 'A';
        char valChar = 'a';
        int valInt = valChar;
        
        double valDouble = 10.12;
        
        double x = 10.12;
        int    y = 2;
        
        int result = (int)(x/y); //hasil typecast operasi ke int
        
        System.out.print( valInt); //casting explist : keluaran 65
        
    }
}
