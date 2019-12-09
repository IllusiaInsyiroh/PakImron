/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritence;

/**
 *
 * @author windows
 */
class Segitiga extends bangun_datar {  
float tinggi;
float alas;
public void luas(){
Segitiga ss = new Segitiga();
ss.luas=alas*tinggi/2;
System.out.println("luas segitiga : "+ss.luas);
}
public void keliling(){
Segitiga ss = new Segitiga();
ss.keliling=alas*3;
 System.out.println("keliling segitiga : "+ss.keliling);
}
}
