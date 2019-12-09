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

class bangun_datar {
    float luas;
    float keliling;
   
  public static void main(String[] args) {
        // TODO code application logic here
    persegi_panjang pp = new persegi_panjang();
    pp.lebar=30;
    pp.panjang=50;
    Segitiga s = new Segitiga();
    s.alas=20;
    s.tinggi=40;
    Persegi p = new Persegi();
    p.sisi=40;
    lingkaran l= new lingkaran();
    l.jari=20;
    
pp.luas();
pp.keliling();
p.luas();
p.keliling();
s.luas();
s.keliling();
l.luas();
l.keliling();
}
}
