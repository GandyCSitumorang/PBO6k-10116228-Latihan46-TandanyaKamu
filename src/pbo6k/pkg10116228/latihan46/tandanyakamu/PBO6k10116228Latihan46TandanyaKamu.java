/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6k.pkg10116228.latihan46.tandanyakamu;

import java.util.Scanner;

/**
 * Nama : Gandy Christian Situmorang
 * Kelas: PBO-6K
 * NIM  : 10116228
 *Deskripsi Program : program ini berisi program yang menghitung perhitungan
 * umur kamu
 */
public class PBO6k10116228Latihan46TandanyaKamu {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Age age = new Age(2018);

        Scanner scn = new Scanner(System.in);
        System.out.print("Masukkan Tahun lahir anda : ");
        age.setYearBirth(scn.nextInt());
        
        System.out.println("======Hasil Perhitungan Umur======");
        System.out.println("Tahun Lahir Anda : " + age.getYearBirth(0));
        System.out.println("Hari ini Tahun : " + age.getYearNow());
        System.out.println("Umur kamu sampai hari ini adalah "
                + age.hitungUmur()+ " tahun");
        System.out.println("Tandanya Kamu : "+ age.tandanyaKamu(age.hitungUmur()));
    }
    
}
