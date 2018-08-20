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
public class LuasBola {
    public static void main(String[] args){
         Scanner masukan = new Scanner(System.in);
         System.out.print("jari-jari :");
         int r = masukan.nextInt();
         System.out.println("Luas Bola ="+ 4*22*r*r/7);
    }
}
