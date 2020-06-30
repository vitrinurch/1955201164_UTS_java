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
public class percabangan_switch_case {
    public static void main(String[] args) {
         String nama = JOptionPane.showInputDialog(null, "masukkan nama anda");
        String alamat = JOptionPane.showInputDialog(null, "masukkan alamat anda");
        String kebangsaan = JOptionPane.showInputDialog(null, "masukkan kebangsaan anda");
        String tiket = JOptionPane.showInputDialog(null, "masukkan tiket anda"); 
        String hargatiket = JOptionPane.showInputDialog(null, "berapa harga tiket yang anda beli");
        
        switch (hargatiket){
            case "vip":
                JOptionPane.showMessageDialog(null, "selamat" + nama + ", kelas anda adalah vip");
                break;
            case "B":
                JOptionPane.showMessageDialog(null, "selamat" + nama + ", kelas anda adalah B");
                break;
            case "C":
                JOptionPane.showMessageDialog(null, "selamat" + nama + ", kelas anda adalah C");
                break;
            default: JOptionPane.showMessageDialog(null, "maaf" + nama + ", kelas yang anda cari tidak tersedia");


    }
}
}