/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapackages_dan_api;
import java.io.*;
/**
 *
 * @author WINDOWS 10
 */
public class BR {
    public static void main(String [] args){
   //Tidak Bisa memakai INT 
    BufferedReader input =
            new BufferedReader (new InputStreamReader (System.in));
    String Nama;
    String Alamat;
    String Gender ;
    String Jurusan ;
    String NIM ;
    String Tahun ;
    try{
   System.out.print("Masukkan Nama :");
    Nama = input.readLine();
   System.out.print("Masukkan Alamat :");
    Alamat = input.readLine();
   System.out.print("Masukkan Gender :"); 
    Gender = input.readLine();
    System.out.print("Masukkan Jurusan :");
    Jurusan = input.readLine();
    System.out.print("Masukkan Gender :");
    Gender = input.readLine();
     System.out.print("Masukkan NIM :");
    NIM = input.readLine();
     System.out.print("Masukkan Tahun :");
    Tahun = input.readLine();
    
     System.out.print("Masukkan Nama :"+Nama);
      System.out.print("Masukkan Alamat :"+Alamat);
       System.out.print("Masukkan Gender :"+Gender);
        System.out.print("Masukkan Jurusan :"+Jurusan);
         System.out.print("Masukkan NIM :"+NIM);
          System.out.print("Masukkan Tahun :"+Tahun);

    }catch(IOException ex){
    System.out.println("ERROR LUR");}
    }
}
