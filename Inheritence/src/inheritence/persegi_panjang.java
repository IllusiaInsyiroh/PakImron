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
class persegi_panjang extends bangun_datar {
float panjang;
float lebar;
public void luas(){
 persegi_panjang pp =new persegi_panjang();
 pp.luas=panjang*lebar;
 System.out.println("luas persegi panjang : "+pp.luas);
 }
public void keliling(){
 persegi_panjang pp =new persegi_panjang();
 pp.keliling=2*(panjang+lebar);
 System.out.println("keliling persegi panjang : "+pp.keliling);
} 
}
