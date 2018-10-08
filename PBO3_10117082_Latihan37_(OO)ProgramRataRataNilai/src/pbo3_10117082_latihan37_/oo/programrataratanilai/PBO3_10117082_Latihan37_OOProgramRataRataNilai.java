/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_10117082_latihan37_.oo.programrataratanilai;
import java.util.Scanner;
/**
 *Nama : WIDIAMEGA K
* Kelas : IF3
* NIM   : 10117082
* Deskripsi Program : program ini berisi program untuk menampilkan rata rata 
* nilai yang inputannya berasal dari user dengan konsep oop
 */
public class PBO3_10117082_Latihan37_OOProgramRataRataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         NilaiMahasiswa mhs = new NilaiMahasiswa();
         Scanner scn = new Scanner(System.in);

         int n;
         System.out.print("Masukkan Banyaknya Mahasiswa : ");
         n = scn.nextInt();

         mhs.hitungTotal(mhs.nilaiMhs, n);
         mhs.hitungRataRataNilaiMhs(mhs.totalNilaiMhs, n);

        System.out.println("\nMaka, Rata-rata Nilainya adalah : "
                +mhs.hitungRataRataNilaiMhs(mhs.totalNilaiMhs,n));
       
    }
    
}
