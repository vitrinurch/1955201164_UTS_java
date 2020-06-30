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
public class percabangan_if_else_if {
    public static void main(String[] args) {
        String nama = JOptionPane.showInputDialog(null, "masukkan nama anda");
        String alamat = JOptionPane.showInputDialog(null, "masukkan alamat anda");
        String kebangsaan = JOptionPane.showInputDialog(null, "masukkan kebangsaan anda");
        String tiket = JOptionPane.showInputDialog(null, "masukkan tiket anda"); 
        int hargatiket = Integer.parseInt(JOptionPane.showInputDialog(null, "berapa harga tiket yang anda beli"));
        
        if(hargatiket >= 200){
            JOptionPane.showMessageDialog(null, "selamat " + nama + ",kelas anda adalah A");
        } else if(hargatiket >= 150) {
            JOptionPane.showMessageDialog(null, "selamat " + nama + ",kelas anda adalah B");  
        } else if(hargatiket >= 100) {
            JOptionPane.showMessageDialog(null, "selamat " + nama + ",kelas anda adalah C");
        }
        else if (hargatiket >= 50){
            JOptionPane.showMessageDialog(null, "maaf " + nama + ",kelas yang anda cari tidak tersedia");
    }
}
}
