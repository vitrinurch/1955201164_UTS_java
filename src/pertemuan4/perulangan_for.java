/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4;

/**
 *
 * @author HP 14-AM514TU
 */
public class perulangan_for {
    public static void main(String[] args) {
        int n = 5 ;
        String Cabe = "";
        System.out.println("mulai");
        System.out.println("siapkan cobek");
        System.out.println("masukkan garam dan gula secukupnya");
        System.out.println("masukkan terasi");
        System.out.println("masukkan tomat");
        System.out.println("masukkan cabe");
        
        String cabe;
        cabe = "pedas";
        System.out.println("apakah sudah pedas?");
        if("pedas".equals(cabe)) {
    }
        else {
            System.out.println("belum pedas");
        }
        for (int i = 1; i <n; i++){
            System.out.println("tambahkan cabe lagi - " + 1);
        }
        System.out.println("uleg");
        System.out.println("selesai");
    }
}
