/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet1;

import java.util.Scanner;

/**
 *
 * @author Risma
 */
public class Suhu {
      public static void main(String[] args){
          Scanner masukan = new Scanner(System.in);
      float C,F,R,K;
     
      System.out.print("Masukan nilai celcius :");
       C = masukan.nextInt();
      System.out.println("R = "+ C*4/5);
      System.out.println("F = "+(C*9/5+32));
      System.out.println("K ="+(C+273));
      
      }
}
