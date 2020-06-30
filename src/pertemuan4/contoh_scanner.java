/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4;

import java.util.Scanner;

/**
 *
 * @author HP 14-AM514TU
 */
public class contoh_scanner {
    public static void main(String[] args) {
        // deklarasi tipe data
        String nama, jeniskelamin , agama , alamatrumah, hobby ,citacita;
        int usia , tahunlulus;
        double beratbadan,tinggibadan;
        
        Scanner keyboard = new Scanner (System.in);
        
        System.out.println("``` PENDAFTARAN MAHASISWI TAT BOGA ```");
        System.out.println("Nama Mahasiswi");
        nama = keyboard.nextLine();
        
        System.out.println(" Jenis Kelamin");
        jeniskelamin = keyboard.nextLine();
        
        System.out.println("Agama");
        agama = keyboard.nextLine();
        
        System.out.println("Alamat");
        String alamat = keyboard.nextLine();
        
        System.out.println("Hobby");
        hobby = keyboard.nextLine();
        
        System.out.println("Cita Cita");
        citacita = keyboard.nextLine();
        
        System.out.println("Usia");
        usia = keyboard.nextInt();
        
        System.out.println("Tahun Lulus");
        tahunlulus = keyboard.nextInt();
        
        System.out.println("Berat Badan");
        beratbadan = keyboard.nextDouble();
        
        System.out.println("Tinggi Badan");
        tinggibadan = keyboard.nextDouble();
        
        
        System.out.println("````````````````````");
        System.out.println("nama mahasiswi: " + nama);
        System.out.println("Jenis Kelamin: " + jeniskelamin);
        System.out.println("Agama: " + agama);
        System.out.println("Alamat Rumah: " + alamat);
        System.out.println("hobby: " + hobby);
        System.out.println("Cita Cita: " + citacita);
        System.out.println("Usia: " + usia);
        System.out.println("Tahun Lulus: " + tahunlulus);
        System.out.println("Berat Badan: " + beratbadan);
        System.out.println("Tinggi Badan: " + tinggibadan);
    }
   
}
