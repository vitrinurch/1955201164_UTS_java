/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4;

import javax.swing.JOptionPane;

/**
 *
 * @author HP 14-AM514TU
 */
public class contoh_JOptionPane {
    public static void main(String[] args) {
        String tanya = JOptionPane.showInputDialog("Siapa Nama Anda?");
        String jeniskelamin = JOptionPane.showInputDialog("Jenis Kelamin : Anda?");
        String agama = JOptionPane.showInputDialog("Agama : Anda?");
        String alamat = JOptionPane.showInputDialog("Alamat : Anda?");
        String hobby = JOptionPane.showInputDialog("Hobby : Anda?");
        String citacita = JOptionPane.showInputDialog(" Cita Cita : Anda?");
        String usia = JOptionPane.showInputDialog("Usia : Anda?");
        String tahunlulus = JOptionPane.showInputDialog("Tahun Lulus : Anda?");
        String beratbadan = JOptionPane.showInputDialog("Berat Badan : Anda?");
        String tinggibadan = JOptionPane.showInputDialog("Tinggi Badan : Anda?");
        
        int jumlah = Integer.parseInt(usia);
        int banyakmahasisiwi = 150;
        int banyakmahasiswi = 0;
        double total = jumlah*banyakmahasiswi;
        
        System.out.println(" Siapa Nama Anda :" + tanya);
        System.out.println(" Jenis Kelamin :" + jeniskelamin);
        System.out.println("Agama :" + agama);
        System.out.println(" Alamat :" + alamat);
        System.out.println(" Hobby :" + hobby);
        System.out.println(" Cita Cita :" + citacita);
        System.out.println(" Usia :" + usia);
        System.out.println(" Tahun Lulus :" + tahunlulus);
        System.out.println(" Berat Badan :" + beratbadan);
        System.out.println(" Tinggi Badan :" + tinggibadan);



    }
}
