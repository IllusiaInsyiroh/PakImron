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
class Persegi extends bangun_datar {
float sisi;
public void luas(){
Persegi p1 = new Persegi();  
p1.luas=sisi*sisi;
System.out.println("luas Persegi : "+p1.luas);
}  
public void keliling(){
Persegi p1 = new Persegi();  
p1.keliling= 4*sisi;
System.out.println("keliling persegi : "+p1.keliling);
}
}
