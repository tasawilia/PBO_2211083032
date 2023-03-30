/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tasa290323;

/**
 *
 * @author maita
 */
public class OperasiAritmatik {
    public static void main (String[] args){
        if(args.length != 2){
           System.out.println("Usage: java operasiAritmatika n1 n2");
           return;
        }
         int n1 = Integer.parseInt(args[0]);
         int n2 = Integer.parseInt(args[1]);
         
         System.out.println("Sum = "+ (n1+n2));
         System.out.println("Difference = "+ (n1-n2));
         System.out.println("Product = "+ (n1*n2));
         System.out.println("Quotient = "+ (n1/n2));
    }
    
}
