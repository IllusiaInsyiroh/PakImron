/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapackages_dan_api;
import javax.swing.JOptionPane;
/**
 *
 * @author WINDOWS 10
 */
public class JOP {
    public static void main(String[] args){    
    String Nama;
    String Alamat;
    String Gender ;
    String Jurusan ;
    String NIM ;
    String Tahun ;
    String Welcome ;
    
    Nama = JOptionPane.showInputDialog("Who Are You ?");
    Alamat = JOptionPane.showInputDialog("Where You Live ?");   
    Gender =  JOptionPane.showInputDialog("What Your Gender ?");
    Jurusan = JOptionPane.showInputDialog("What Your Majors ?");
    NIM = JOptionPane.showInputDialog("What Your NIM?");
    Tahun = JOptionPane.showInputDialog("What Year ?");
   
    
    JOptionPane.showMessageDialog(null,"Hai "+Nama);
    JOptionPane.showMessageDialog(null,"Rumah Kamu di "+Alamat);
    JOptionPane.showMessageDialog(null,"Kamu itu "+Gender);
    JOptionPane.showMessageDialog(null,"Jurusan mu "+Jurusan);
    JOptionPane.showMessageDialog(null,"NIM :"+NIM);
    JOptionPane.showMessageDialog(null,"Tahun masuk "+Tahun);
    JOptionPane.showMessageDialog(null,"Welcome "+Nama);    
        
}
}