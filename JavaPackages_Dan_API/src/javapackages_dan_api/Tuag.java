/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapackages_dan_api;
import java.util.Scanner;
/**
 *
 * @author WINDOWS 10
 */
public class Tuag {
    public static void main(String [] args){
    Scanner input = new Scanner(System.in);
    String Nama,Alamat,Gender,Jurusan;
    long NIM;
    int Tahun;
   
    Scanner Masuk=new Scanner(System.in);
   
   System.out.print("Masukkan Nama :");
    Nama = Masuk.nextLine();
   System.out.print("Masukkan Alamat :"); 
    Alamat = Masuk.nextLine();
   System.out.print("Masukkan Jurusan  :"); 
    Jurusan = Masuk.nextLine();
    System.out.print("Masukkan Jenis Kelamin :");
    Gender = Masuk.nextLine(); 
    System.out.print("Masukkan NIM :");
    NIM = Masuk.nextLong();
   System.out.print("Masukkan Tahun :"); 
    Tahun = Masuk.nextInt();
     
System.out.println(" Biodata Saya--------------");
System.out.println(" Nama :"+Nama);
System.out.println(" Alamat :"+Alamat);
System.out.println(" Jurusan :"+Jurusan);
System.out.println(" Jenis Kelamin :"+Gender);
System.out.println(" NIM :"+NIM);
System.out.println(" Tahun :"+Tahun);
          
     
}
}
