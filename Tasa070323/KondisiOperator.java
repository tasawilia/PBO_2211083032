/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tasa070323;

/**
 *
 * @author maita
 */
public class KondisiOperator {
    public static void main(String [] args){
     String status = "";
     int grade = 80;
     
     //mendapatkan status pelajar
     status = (grade >= 60)?"Passed":"Fail";
     
     //print status
     System.out.println(status);
 }   
}
