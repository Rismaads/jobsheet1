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
public class Biodatadiri {
    public static void main(String[] args){
          Scanner masukan = new Scanner(System.in);
String nama,nis,tempatlahir,tgl,jk,alamat,motto;
          System.out.print("Nama :");
          nama=masukan.nextLine();
    System.out.print("NIS :");
    nis=masukan.nextLine();
    System.out.print("Tempat lahir :");
    tempatlahir=masukan.nextLine();
    System.out.print("Tanggal lahir :");
    tgl=masukan.nextLine();
    System.out.print("Jenis Kelamin :");
    jk=masukan.nextLine();
    System.out.print("Alamat di Malang :");
    alamat=masukan.nextLine();
    System.out.print("Motto hidup :");
   motto=masukan.nextLine();
    }
}
