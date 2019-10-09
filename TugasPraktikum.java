/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulpbo;
import java.util.Scanner;
/**
 *
 * @author asus
 */
public class TugasPraktikum {
    public static void main(String[] args) {
     Scanner scan=new Scanner(System.in);
      
        String NamaDepan, NIS,  NamaBelakang, JenisKelamin, MottoHidup, Alamat, Kota, Lahir, Tgl;
      
        System.out.println();
        System.out.println("--------------------------------------");
        System.out.println("Program menampilkan biodata");
        System.out.println("--------------------------------------");
        System.out.println();
        System.out.println("Masukkan data anda dengan benar!");
        System.out.println();
        
        System.out.print("Nama Depan         :");
        NamaDepan=scan.nextLine();
        System.out.print("Nama Belakang      :");
        NamaBelakang=scan.nextLine();
        System.out.print("NIS                :");
        NIS=scan.nextLine();
        System.out.print("Kota               :");
        Kota=scan.nextLine();
        System.out.print("Tempat Lahir       :");
        Lahir=scan.nextLine();
        System.out.print("Tanggal Lahir      :");
        Tgl=scan.nextLine();
        System.out.print("Jenis Kelamin      :");
        JenisKelamin=scan.nextLine();
        System.out.print("Alamat Di Malang   :");
        Alamat=scan.nextLine();
        System.out.print("Motto Hidup        :");
        MottoHidup=scan.nextLine();
        
        System.out.println();
        System.out.println("======================================");
        System.out.println("          Biodata           ");
        System.out.println("======================================");
        System.out.println("Nama Lengkap   : "+NamaDepan+" "+NamaBelakang);
        System.out.println("NIS : "+NIS); 
        System.out.println("Alamat         : "+Alamat+", "+Kota);
        System.out.println("Tempat/Tgl      : "+Lahir+", "+Tgl);
        System.out.println("JenisKelamin : "+JenisKelamin);
        System.out.println("MottoHidup : "+MottoHidup);
        System.out.println("======================================");
            
      
    }
}

   
    
    