/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author HP 14-AM514TU
 */
public class contoh_buffered {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
      String nama = "";
      String kelamin = "";
      String agama = "";
      String alamat = "";
      String hobby = "";
      String citacita = "";
      int usia = 0;
      int tahunlulus = 2018;
      double beratbadan = 49;
      double tinggibadan = 155;
      
      // object inputStream
      InputStreamReader isr = new InputStreamReader(System.in);
      // object bufferedReader
      BufferedReader br = new BufferedReader (isr);
      // mengisi nama dengan bufferedReader
      
        System.out.println("``` PENDAFTARAN MAHASISWI TATA BOGA ```");
        
        System.out.println("Siapa Nama Anda?");
        nama = br.readLine();
        
        System.out.println("Kelamin Anda?");
        kelamin = br.readLine();
        
        System.out.println("Agama Anda?");
        agama = br.readLine();
        
        System.out.println("Alamat Anda?");
        alamat = br.readLine();
        
        System.out.println("Hobby Anda?");
        hobby = br.readLine();
        
        System.out.println("Cita Cita Anda?");
        citacita = br.readLine();
        
        System.out.println("Usia Anda?");
        usia = Integer.parseInt(br.readLine());
        
        System.out.println("Berat Badan Anda?");
        beratbadan = Double.parseDouble(br.readLine());
        
        System.out.println("Tinggi Badan Anda?");
        tinggibadan = Double.parseDouble(br.readLine());
        
        // menampilkan nama
        System.out.println("````````````````````````");
        System.out.println("Nama Anda Adalah :" + nama);
        System.out.println("Kelamin Anda Adalah :" + kelamin);
        System.out.println("Agama Anda Adalah :" + agama);
        System.out.println("Alamat Anda Adalah :" + alamat);
        System.out.println("Hobby Anda Adalah :" + hobby);
        System.out.println("Cita cita Anda Adalah :" + citacita);
        System.out.println("Usia Anda Adalah :" + usia);
        System.out.println("Tahun Lulus Anda Adalah :" + tahunlulus);
        System.out.println("Berat Badan Anda Adalah :" + beratbadan);
        System.out.println("Tinggi Badan Anda Adalah :" + tinggibadan);
        









    }
    
}
