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
public class percabangan_if_else {
    public static void main(String[] args) {
        String nama = JOptionPane.showInputDialog(null, "masukkan nama anda");
        String alamat = JOptionPane.showInputDialog(null, "masukkan alamat anda");
        String kebangsaan = JOptionPane.showInputDialog(null, "masukkan kebangsaan anda");
        String tiket = JOptionPane.showInputDialog(null, "masukkan tiket anda"); 
        int usia = Integer.parseInt(JOptionPane.showInputDialog(null, "berapa usia anda"));
        
        if(usia >= 17){
            JOptionPane.showMessageDialog(null, "selamat anda boleh masuk");
            
        } else {
          JOptionPane.showMessageDialog(null, "maaf usia anda belum cukup untuk masuk");  

    }
}
}
