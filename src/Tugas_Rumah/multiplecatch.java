/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas_Rumah;

/**
 *
 * @author Lenovo
 */
public class multiplecatch {
    public static void main(String[] args) {
        try{
           String[] siswa = new String[3];
           siswa[0] = "Wildan";
           siswa[1] = "Ferdi";
           siswa[2] = "Taufiq";
           System.out.println("Nama siswa : "+siswa[3]);
           //====================================
           int angka = 7;
           int hasil = angka/0;
           System.out.println(hasil);
        }catch(ArrayIndexOutOfBoundsException ex2){
            System.out.println("Data Array Yang Ingin Dikeluarkan Tidak Ada");
        }catch(ArithmeticException ex2){
            System.out.println("Tidak Boleh Menggunakan Pembagian dengan 0 (nol)");
        }catch(Exception ex2){
            System.out.println(ex2.getMessage());
        }
    }
    }

